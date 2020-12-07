package exercicios.exercicio03;

public class AppConta {
    public static void main(String[] args) {
        Conta c = new Conta(123456);

        c.depositar(100);
        c.sacar(50);
        
        System.out.println(c);
    }
}
