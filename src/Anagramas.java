import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Anagramas {


    public static void main(String[] args) throws IOException {
        //OK
        int minGroupSize = 5;

        Map<String, List<String>> m = new HashMap<String, List<String>>();

        BufferedReader reader = new BufferedReader(new FileReader("/media/alu10675957/T7/spanish-dict.txt"));
        String word;

        while ((word = reader.readLine()) != null) {
            String alpha = alfabetizar(word);
            List<String> l = m.get(alpha);
            if (l == null) {
                l = new ArrayList<>();
                l.add(word);
                m.put(alpha, l);
            } else {
                l.add(word);
            }
        }
        reader.close();

        for (List<String> palabras:m.values()){
            if (palabras.size() >= minGroupSize){
                System.out.println(palabras.size() + " : " + palabras);
            }
        }

    }

    private static String alfabetizar(String s){
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

}
