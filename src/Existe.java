import java.util.*;
public class Existe {
        public static boolean existe(ArrayList<Integer> elemento, int num){
            return elemento.contains(num);
        }
        public static void main(String args[]) {
            ArrayList<Integer> lista = new ArrayList<Integer>();
            lista.add(3);
            lista.add(17);
            lista.add(6);
            lista.add(9);
            lista.add(7);

            if (lista.contains(7)) {
                System.out.println("El numero SI está en la lista");
            } else {
                System.out.println("El numero NO está en la lista");
            }
        }
    }