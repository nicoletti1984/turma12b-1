package exemplos.exemplo01;

public class Gerente extends Funcionario {
    private int nFuncionarios;

    public Gerente(String nome, double salario, int nFuncionarios) {
        super(nome, salario); // construtor da superclasse
        this.nFuncionarios = nFuncionarios;
    }

    @Override
    public void aumentarSalario(double porcentagem) {
        super.aumentarSalario(porcentagem + 0.2);
    }

    @Override
    public String exibir() {
        return super.exibir() + " : " + nFuncionarios;
    }

    @Override
    public String toString() {
        return super.toString() + " : " + nFuncionarios;
    }

}
