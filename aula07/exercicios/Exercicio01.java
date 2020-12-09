import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, result;
        boolean erro = true;

        do {
            try {
                System.out.println("Digite dois números:");
                n1 = Double.parseDouble(teclado.nextLine());
                n2 = Double.parseDouble(teclado.nextLine());

                if (n2 == 0) {
                    System.out.println("O segundo valor não pode ser zero");
                    continue; // volta para início do laço
                }

                result = n1 / n2;
                System.out.printf("%f / %f = %f\n", n1, n2, result);

                erro = false;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
            } catch (NumberFormatException e) {
                System.out.println("O número deve ser digitado com '.' no decimal");
            } catch (ArithmeticException e) {
                System.out.println("O segundo valor não pode ser zero");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (erro);

        teclado.close();
    }
}
