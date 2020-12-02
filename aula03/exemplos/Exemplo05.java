package exemplos;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;

        do {
            System.out.println("Digite um valor positivo:");
            valor = teclado.nextInt();
        } while (valor <= 0);

        System.out.println("Valido");

        teclado.close();
    }
}
