import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Loteria {
    public static HashMap<Integer, Integer> probabilidades(ArrayList<String> boletos) {
        HashMap<Integer, Integer> contador = new HashMap<>();


        for (String boleto:boletos) {
        int rep = 1;
        int ultimo = Integer.parseInt("" + boleto.charAt(boleto.length()-1));
        if (contador.containsKey(ultimo)){
            rep = contador.get(ultimo) + 1;
        }
        contador.put(ultimo, rep);
        }
        return contador;
    }

    public static void main(String[] args) {

        ArrayList<String> loteria = new ArrayList<>();

        loteria.add("58975");
        loteria.add("25894");
        loteria.add("52985");
        loteria.add("98595");

        System.out.println(probabilidades(loteria));

    }
}
