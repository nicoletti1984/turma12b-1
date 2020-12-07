package exercicios.exercicio03;

public class ContaCorrente extends Conta {
    private final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor - TAXA_DEPOSITO);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            super.sacar(valor);
        }
    }

}
