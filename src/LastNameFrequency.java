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
        String apellido = " ";
        String rep;
        String valor;

        Scanner scanner = new Scanner(System.in);

        while ((line = reader.readLine()) != null) {
            String[] actual = line.split(",");
            if (actual.length == 2){
                apellido = actual[0];
                rep = actual[1];
                rep  = rep.replaceAll("\\.","");
                contador.put(apellido, rep);
            }
        }
        System.out.println("Introduce un apellido");

        while (true){
            apellido = scanner.nextLine();
            if (apellido.equals("")){
                reader.close();
                System.exit(0);
            }
            System.out.println(contador.get(apellido));
        }
    }
}
