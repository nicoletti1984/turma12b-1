package exercicio02;

public class AppAnimal {
    public static void main(String[] args) {
        GerenciaAnimal animais = new GerenciaAnimal();

        animais.novoAnimal("Lulu", "Buldog", "branco", 2015, "Antônio", "(11) 987654321");
        animais.novoAnimal("Mel", "Siames", "bege", 2020, "Sara", "(11) 9123456");
        animais.novoAnimal("Banguela", "Siames", "preto", 2018, "Francis", "(11) 9123456");

        System.out.println(animais.listarAnimais());

        System.out.println(animais.getProprietarioPorRaca("Siames"));
    }
    
}
