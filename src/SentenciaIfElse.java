import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su promedio con rango de 1.0 a 5.0");

        float promedio = scanner.nextFloat();

        if (promedio >= 5.0){
            System.out.println("Promedio exelente");
        } else if (promedio >= 4.0) {
            System.out.println("Promedio bueno");
        } else if (promedio >= 3.0) {
            System.out.println("Promedio regular");
        } else if (promedio >= 2.0) {
            System.out.println("Promedio insuficiente");
        } else if (promedio >= 1.0) {
            System.out.println("Promedio muy insuficiente");
        }
        System.out.println("Tu promedio es de: "+promedio);
    }
}
