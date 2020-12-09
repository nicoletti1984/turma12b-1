package exercicio02;

import java.util.ArrayList;

public class GerenciaAnimal {
    private ArrayList<Animal> animais;

    public GerenciaAnimal(){
        animais = new ArrayList<>();
    }

    public void novoAnimal(String nome, String raca, String cor, int anoNascimento, String nomeProp, String telefone){
        animais.add( new Animal(nome, raca, cor, anoNascimento, nomeProp, telefone) );
    }

    public String listarAnimais(){
        return animais.toString();
    }
    
    public String getProprietarioPorRaca(String raca){
        String saida = "";
        for (Animal animal : animais) {
            if(animal.getRaca().equals(raca)){
                saida += animal.getProprietario() + "\n";
            }
        }
        return saida;
    }

}
