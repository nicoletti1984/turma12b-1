package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um valor inteiro");
        numero = teclado.nextInt();
        
        if (numero % 2 == 0) { // resto da divisão do 'numero' por 2
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }

        teclado.close();
    }
}
