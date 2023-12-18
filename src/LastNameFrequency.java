import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LastNameFrequency {

    public static void main(String[] args) throws IOException {

        HashMap<String, String> contador = new HashMap<>();

        BufferedReader reader = new BufferedReader(new FileReader("/media/alu10675957/T7/LastnameFrequencies.csv"));
        String line;
        String apellido;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un apellido");
        apellido = scanner.next();

        while ((line = reader.readLine()) != null) {
            String[] actual = line.split(",");
             apellido = actual[0];
            String rep = actual[1];
            contador.put(apellido, rep);
            break;
        }
        reader.close();
        System.out.println(contador);
    }
}
