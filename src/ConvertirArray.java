import java.util.*;
public class ConvertirArray {

        public static void main(String args[]) {
            ArrayList<String> frutas = new ArrayList<>();
            frutas.add("Manzana");
            frutas.add("Platano");
            frutas.add("Mango");
            frutas.add("Pera");

            String[] str = new String[frutas.size()];
            for(int i=0; i < frutas.size(); i++) {
                str[i] = frutas.get(i);
            }

            for(String s : str) {
                System.out.println(s);
            }
        }
    }
