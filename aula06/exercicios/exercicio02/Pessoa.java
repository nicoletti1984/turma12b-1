package exercicios.exercicio02;

// uma classe abstrata serve como modelo para outras classes

public abstract class Pessoa {
    private String nome;
    private String telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " : " + telefone;
    }
}
