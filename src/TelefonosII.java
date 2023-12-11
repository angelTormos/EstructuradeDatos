import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelefonosII {

    public static String telefono(Map<String, ArrayList<String>> agenda, String contacto) {

        return String.valueOf(agenda.get(contacto));

    }

    public static void main(String[] args) {
        ArrayList<String> telefonos = new ArrayList<>();
        Map<String, ArrayList<String>> agenda = new HashMap<>();

        String contacto;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un contacto");
        contacto = scanner.next();

        telefonos.add("658759325");
        telefonos.add("648521357");
        agenda.put("Juan", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add("642358965");
        agenda.put("Maria", telefonos);

        if (agenda.containsKey(contacto)){
            System.out.println(telefono(agenda, contacto));
        }else {
            System.out.println("El contacto no existe");
        }
    }
}
