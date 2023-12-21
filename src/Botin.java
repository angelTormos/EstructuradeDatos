import java.util.ArrayList;
import java.util.HashMap;

public class Botin {
    public static HashMap<Integer, String> repartir(int participantes, int ... billetes) {
        HashMap<Integer, String> reparto = new HashMap<>();
        ArrayList<Integer> lista = new ArrayList<>();

        for (int billete : billetes) {
            lista.add(billete);
        }

        do {
            for (int j = 0; j < participantes; j++) {
                int actual = lista.get(0);
                if (reparto.containsKey(j)) {
                    reparto.replace(j, reparto.get(j) + ", " + actual);
                } else reparto.put(j, String.valueOf(actual));
                lista.remove(0);
                if (lista.isEmpty()) {
                    break;
                }
            }
        }while (!lista.isEmpty());

        return reparto;
    }

    public static void main(String[] args) {

        System.out.println(repartir(2, 10, 20, 50, 200, 500));
    }
}
