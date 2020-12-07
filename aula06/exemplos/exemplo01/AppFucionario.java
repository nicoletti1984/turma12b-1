package exemplos.exemplo01;

public class AppFucionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Armando", 1000);
        Gerente g = new Gerente("Marisa", 1000, 10);

        //f.setNome("Armando");
        //g.setNome("Marisa");

        f.aumentarSalario(0.1);
        g.aumentarSalario(0.1);

        System.out.println(f.exibir());
        System.out.println(g.exibir());

        System.out.println(f);
        System.out.println(g);

    }
}
