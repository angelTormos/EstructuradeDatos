import java.util.ArrayList;
import java.util.Collections;

public class Coches {
    public static String coches(ArrayList<String>coches){
        String res = "";
        Collections.sort(coches);
        for(String coche  : coches){
            res += coche + "\n";
        }
        return res;
    }
    public static void main(String[] args) {

        ArrayList<String>coches = new ArrayList<>();
        String coche;
        do {
            coche = Utilidades.leerCadena("Introduce un coche" );
            coches.add(coche);
        }while (coche.length() != 0);
        Collections.sort(coches);
        System.out.println(coches(coches));
    }
}