import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Frecuency {

    public static HashMap<String, Integer> probabilidades(ArrayList<String> palabras) {
        HashMap<String, Integer> contador = new HashMap<>();


        for (String palabra:palabras) {
            int rep = 1;
            if (contador.containsKey(palabra)){
                rep = contador.get(palabra) + 1;
            }
            contador.put(palabra, rep);
        }
        return contador;
    }

    public static void main(String[] args) {

        ArrayList<String> palabras = new ArrayList<>();

       String palabra;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce diversas palabras");
        while (scanner.hasNextLine()){
            palabra = scanner.nextLine();
            if (palabra.isEmpty()) {
                break;
            }

            palabras.add(palabra);
        }

        /*palabras.add("uno");
        palabras.add("dos");
        palabras.add("uno");
        palabras.add("tres");*/

        System.out.println(probabilidades(palabras));

    }
}
