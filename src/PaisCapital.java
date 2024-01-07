import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static String paiscapital(Map<String, String> paisesycapiales, String pais) {

        return paisesycapiales.get(pais);
    }

    public static void main(String[] args) {
        //OK
        Map<String, String> paisesycapiales = new HashMap<>();
            paisesycapiales.put("España", "Madrid");
            paisesycapiales.put("Francia", "Paris");
            paisesycapiales.put("Inglaterra", "Londres");
            paisesycapiales.put("Portugal", "Lisboa");
            paisesycapiales.put("Alemania", "Berlin");

            String pais;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce un pais");
            pais = scanner.next();

            if (paisesycapiales.containsKey(pais)){
                System.out.println(paiscapital(paisesycapiales, pais));
            }else {
                System.out.println("El pais introducido no está en la lista");
            }

    }

}
