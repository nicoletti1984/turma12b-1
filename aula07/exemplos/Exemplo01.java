import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;

        try {

            System.out.println("Digite um número inteiro:");
            //numero1 = entrada.nextInt();
            numero1 = Integer.parseInt(entrada.nextLine());

            System.out.println("Vc digitou " + numero1);

            System.out.println("Digite outro número inteiro:");
            String texto = entrada.nextLine();
            numero2 = Integer.parseInt(texto); // converte o texto em inteiro

            System.out.println("Vc digitou " + numero2);

        } catch (InputMismatchException ex) {
            System.out.println("Você não digitou um número inteiro");
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Erro na digitação.");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } finally { // sempre executa
            System.out.println("Final do programa");
            entrada.close();
        }

    }

}