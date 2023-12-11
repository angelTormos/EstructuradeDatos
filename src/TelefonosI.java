import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelefonosI {

    public static String telefono(Map<String, String> agenda, String contacto) {

        return String.valueOf(agenda.get(contacto));

    }

    public static void main(String[] args) {
        Map<String, String> agenda = new HashMap<>();

        String contacto;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un contacto");
        contacto = scanner.next();

        agenda.put("Juan", "658759325");

        agenda.put("Maria", "642358965");


        if (agenda.containsKey(contacto)){
            System.out.println(telefono(agenda, contacto));
        }else {
            System.out.println("El contacto no existe");
        }
    }
}
