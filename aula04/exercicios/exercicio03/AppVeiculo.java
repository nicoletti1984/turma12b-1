package exercicios.exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Vectra", "Chevrolet", 7.5);

        veiculo.exibir();
        //veiculo.consumo = -7.5;
        //System.out.println("Consumo: " + veiculo.consumo);
        System.out.println("Consumo: " + veiculo.obterConsumo());
    }
    
}
