package exercicios.exercicio03;

import java.util.Scanner;

public class AppConta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limiteConta;
        ContaCorrente cc = null;
        ContaEspecial ce = null;
        ContaPoupanca cp = null;

        do {
            System.out.println("1- nova Conta Corrente");
            System.out.println("2- nova Conta Especial");
            System.out.println("3- nova Conta Poupança");
            System.out.println("4- consultar saldo");
            System.out.println("5- saque");
            System.out.println("6- deposito");
            System.out.println("7- sair");
            System.out.print("-> ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta");
                    numeroConta = entrada.nextInt();
                    cc = new ContaCorrente(numeroConta);
                    break;
                case 2:
                    System.out.println("Informe o número da conta");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o limite da conta");
                    limiteConta = entrada.nextDouble();
                    ce = new ContaEspecial(numeroConta, limiteConta);
                    break;
                case 3:
                    System.out.println("Informe o número da conta");
                    numeroConta = entrada.nextInt();
                    cp = new ContaPoupanca(numeroConta);
                    break;
                case 4:
                    System.out.println(cc);
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    break;

                default: // se não for nenhum dos outros
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 7);

        entrada.close();
    }
}
