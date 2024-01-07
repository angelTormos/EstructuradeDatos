import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountCountries {
    public static void main(String[] args) throws IOException {
        //OK. Aunque te he tenido que comentar una línea
        HashMap<String, Integer> contador = new HashMap<>();

        BufferedReader reader = new BufferedReader(new FileReader("/media/alu10675957/T7/Colfuturo-Seleccionados.csv"));
        String line;
        while ((line = reader.readLine()) != null) {
            //line.spli t(",");
            String[] actual = line.split(",");
            String pais = actual[6];
                int rep = 1;
                if (contador.containsKey(pais)) {
                    rep = contador.get(pais) + 1;
                }
                contador.put(pais, rep);
            }
        System.out.println(contador);
        }
    }