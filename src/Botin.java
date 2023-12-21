import java.util.ArrayList;
import java.util.HashMap;

public class Botin {
    public static String repartir(int participantes, int ... billetes){
        HashMap<Integer, ArrayList<Integer>> reparto = new HashMap<>();

        for (int i = 0; i < billetes[0]; i++) {
            ArrayList<Integer> lista = new ArrayList<>();
        if (participantes % 10 == 0) {
            lista.add(billetes[i]);
        }
            reparto.put(i, lista);
        }
        return reparto.toString();
    }

    public static void main(String[] args) {

        System.out.println(repartir(2, 10, 20, 50, 200, 500));
    }
}
