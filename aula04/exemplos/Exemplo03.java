package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        int resultado;
        int n = 18;

        resultado = soma(n, 6); // 'resultado' recebe o retorno do método
        System.out.println("Soma = " + resultado);
    }

    // void - (nada) sem retorno
    // método soma com 2 parâmetros e retorno int
    public static int soma(int valor1, int valor2) {
        int resposta;

        resposta = valor1 + valor2;

        return resposta; // devolve (retorna) o valor da variável
    }

}
