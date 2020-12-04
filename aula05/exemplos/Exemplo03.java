package exemplos;

import java.util.HashMap;

public class Exemplo03 {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();

        // 1 - um
        // 2 - dois
        // 3 - três

        // armazena a informação com uma dada chave
        // (CHAVE, INFORMAÇÃO)
        mapa.put(1, "um");
        mapa.put(2, "dois");
        mapa.put(3, "três");

        // na busca, informa a chave e retorna a informação
        System.out.println("2 = " + mapa.get(2));

    }
    
}
