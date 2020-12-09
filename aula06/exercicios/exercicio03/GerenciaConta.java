package exercicios.exercicio03;

import java.util.ArrayList;

public class GerenciaConta {
    private ArrayList<Conta> listaContas;

    public GerenciaConta() {
        listaContas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) {
        listaContas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limiteConta) {
        listaContas.add(new ContaEspecial(numeroConta, limiteConta));
    }

    public void novaContaPoupanca(int numeroConta) {
        listaContas.add(new ContaPoupanca(numeroConta));
    }

    public String exibirSaldo(int numeroConta) {
        for (Conta c : listaContas) {
            if (c.getNumero() == numeroConta) {
                return c.toString();
            }
        }
        return "Conta não encontrada";
    }

    public boolean sacar(int numeroConta, double valor) {
        for (Conta c : listaContas) {
            if (c.getNumero() == numeroConta) {
                return c.sacar(valor);
            }
        }
        return false;
    }

    public boolean depositar(int numeroConta, double valor){
        for (Conta c : listaContas) {
            if (c.getNumero() == numeroConta) {
                return c.depositar(valor);
            }
        }
        return false;
    }
}
