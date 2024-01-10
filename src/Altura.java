import java.util.ArrayList;

public class Altura {
    public static int numeroAlumnos(){
        return Utilidades.leerEntero("Introduce el número de alumnos:");
    }
    public static ArrayList<Double> leerAlturas(int numAlumnos){
        ArrayList<Double> alturas = new ArrayList<>();
        System.out.printf("Introduce las alturas de los %d alumnos", numAlumnos);
        for (int i = 0; i < numAlumnos; i++) {
            alturas.add(Utilidades.leerDoble(""));
        }
        return alturas;
    }
    public static double calcularMedia(ArrayList<Double> alturas){
        Double suma = 0D;
        for (Double altura : alturas){
            suma += altura;
        }
        return suma / alturas.size();
    }
    public static int calcularAlumnoAlturaSuperior(ArrayList<Double> alturas, Double media){
        int res = 0;
        for (Double altura : alturas) {
            if (altura > media) {
                res++;
            }
        }
        return res;
    }
    public static int calcularAlumnoAlturaInferior(ArrayList<Double> alturas, Double media){
        int res = 0;
        for (Double altura : alturas){
            if (altura < media){
                res++;
            }
        }
        return res;
    }
    public static void mostrarResultado(ArrayList<Double> alturas){
        Double media = calcularMedia(alturas);
        int superior = calcularAlumnoAlturaSuperior(alturas, media);
        int inferior = calcularAlumnoAlturaInferior(alturas, media);
        System.out.println("Las alturas son las siguientes:");
        for (Double altura : alturas) {
            System.out.println(altura + ", ");
        }
        System.out.println("");
        System.out.println("La altura media es " + media);
        System.out.println("El número de alumnos con altura superior es " + superior);
        System.out.println("El número de alumnos con altura inferior es " + inferior);

    }
    public static void main(String[] args) {
        int numAlumnos = numeroAlumnos();
        ArrayList<Double> alturas = leerAlturas(numAlumnos);
        mostrarResultado(alturas);
    }
}