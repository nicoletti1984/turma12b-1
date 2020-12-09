package exercicios.exercicio03;

public class ContaCorrente extends Conta {
    private final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public boolean depositar(double valor) {
        return super.depositar(valor - TAXA_DEPOSITO);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo()) {
            return super.sacar(valor);
        }
        return false;
    }

}
