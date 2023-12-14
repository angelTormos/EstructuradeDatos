import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class CountCountries {
    public static HashMap<String, Integer> main(String[] args) throws IOException {

        ArrayList<String> paises = new ArrayList<>();
        HashMap<String, Integer> contador = new HashMap<>();


        BufferedReader reader = new BufferedReader(new FileReader("/media/alu10675957/T7/spanish-dict.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            line.split(",");
            for (String pais:paises) {
                int rep = 1;
                if (contador.containsKey(pais)){
                    rep = contador.get(pais) + 1;
                }
                contador.put(pais, rep);
            }
            return contador;
            }
        return contador;
    }
  }
