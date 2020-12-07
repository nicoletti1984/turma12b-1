package exemplos.exemplo01;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario() { // construtor default
    }

    public Funcionario(String nome) {
        this.nome = nome;
        this.salario = 0;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        salario = salario + salario * porcentagem;
    }

    public String exibir() {
        return nome + " : " + salario;
    }

    @Override
    public String toString() {
        return nome + " : " + salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
}