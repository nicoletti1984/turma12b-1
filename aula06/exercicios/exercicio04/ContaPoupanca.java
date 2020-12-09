package exercicios.exercicio04;

public class ContaPoupanca extends Conta {
    private static double taxaSaque = 0.1; // static = atributo de classe

    public ContaPoupanca(int numero){
        super(numero);
    }

    public static void setTaxaSaque(double taxa) {
        if(taxa > 0){
            taxaSaque = taxa;
        }
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= getSaldo() + taxaSaque){
            return super.sacar(valor + taxaSaque);
        }
        return false;
    }
    
}
