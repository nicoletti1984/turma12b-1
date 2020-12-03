package exercicio04;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(15, 30, 22);

        relogio.setHora(2);

        relogio.exibir();

        System.out.println("Hora atual: " + relogio.getHora());

    }
}
