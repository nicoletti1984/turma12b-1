package exercicio02;

public class Animal {
    private String nome, raca, cor;
    private int anoNascimento;
    private Proprietario proprietario;

    public Animal(String nome, String raca, String cor, int anoNascimento, String nomeProp, String telefone) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.anoNascimento = anoNascimento;
        this.proprietario = new Proprietario(nomeProp, telefone);
    }

    @Override
    public String toString() {
        return nome + ", " + raca + ", " + cor  + ", " + anoNascimento;
    }

    public String getProprietario(){
        return proprietario.toString();
    }

    public String getRaca() {
        return raca;
    }
    
}
