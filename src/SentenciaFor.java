import java.util.Scanner;

public class SentenciaFor {
    public static void main(String[] args) {

        /*for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("\n");
        for (int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println("\n");
        for (int i = 1, j = 10; i < j; i++, j--){
            System.out.println(i + " - " + j);
        }*/
        System.out.println("\n");
        //numeros pares o impares
        Scanner scanner = new Scanner(System.in);
        System.out.println("NUMEROS IMPARES");
        System.out.println("Digite un numero entero");
        int numero = scanner.nextInt();

        for (int i = 0; i <= numero; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("\n");

        System.out.println("NUMEROS PARES");
        System.out.println("Digite un numero entero");
        int numero1 = scanner.nextInt();

        for (int i = 0; i <= numero1; i++){
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
