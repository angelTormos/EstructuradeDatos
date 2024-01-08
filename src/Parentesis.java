import java.util.Stack;

public class Parentesis {

    public static Boolean parentesis (String cadena) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (letra == '(' || letra == '{' || letra == '[') {
                pila.add(letra);
            } else if (letra == ')' || letra == '}' || letra == ']') {
                if (pila.isEmpty()) return false;
                char ult = pila.pop();
                if (ult == '(' && letra != ')') return false;
                if (ult == '{' && letra != '}') return false;
                if (ult == '[' && letra != ']') return false;

            }
        }
        return pila.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(parentesis("({}[])"));
    }
}
