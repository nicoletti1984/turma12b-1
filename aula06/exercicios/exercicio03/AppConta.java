package exercicios.exercicio03;

import java.util.Scanner;

public class AppConta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limiteConta, valor;
        GerenciaConta contas = new GerenciaConta();

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
                    contas.novaContaCorrente(numeroConta);
                    break;
                case 2:
                    System.out.println("Informe o número da conta");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o limite da conta");
                    limiteConta = entrada.nextDouble();
                    contas.novaContaEspecial(numeroConta, limiteConta);
                    break;

                case 3:
                    System.out.println("Informe o número da conta");
                    numeroConta = entrada.nextInt();
                    contas.novaContaPoupanca(numeroConta);
                    break;

                case 4:
                    System.out.println("Informe o número da conta");
                    numeroConta = entrada.nextInt();
                    System.out.println(contas.exibirSaldo(numeroConta));
                    break;

                case 5:
                    System.out.println("Informe o número da conta");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o valor do saque");
                    valor = entrada.nextDouble();

                    boolean sucesso = contas.sacar(numeroConta, valor);

                    if (sucesso) {
                        System.out.println("Operação realizada.");
                    } else {
                        System.out.println("Saque não realizado.");
                    }

                    break;

                case 6:
                    System.out.println("Informe o número da conta");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o valor do deposito");
                    valor = entrada.nextDouble();

                    if (contas.depositar(numeroConta, valor)) {
                        System.out.println("Operação realizada.");
                    } else {
                        System.out.println("Depósito não realizado.");
                    }

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
