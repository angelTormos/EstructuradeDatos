import java.util.*;
public class AddAll {

        public static void main(String[] args) {
            List<String> lista1 = new ArrayList<String>();
            lista1.add("uno");
            lista1.add("dos");
            lista1.add("tres");
            List<String> lista2 = new ArrayList<String>();
            lista2.add("cuatro");
            lista2.add("cinco");
            lista2.add("seis");

            lista2.addAll(lista1);
            System.out.println(lista2);
        }
    }