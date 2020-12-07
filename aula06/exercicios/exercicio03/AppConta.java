package exercicios.exercicio03;

public class AppConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123456);

        cc.depositar(100);
        cc.sacar(50);
        
        System.out.println(cc);
    }
}
