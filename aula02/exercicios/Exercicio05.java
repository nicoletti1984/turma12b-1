package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String senha;
        boolean senhaValida; // true ou false

        System.out.println("Digite a senha:");
        senha = teclado.nextLine();

        senhaValida = senha.equals("R10p5");

        // aceita == true
        // true == true -> true
        // false == true -> false
        if (senhaValida) {
            System.out.println("Acesso concedido.");
        } else {
            System.out.println("Acesso negado.");
        }

        teclado.close();
    }
}