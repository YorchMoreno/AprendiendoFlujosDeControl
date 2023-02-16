import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite un numero del 1 al 5");
        int numero = scanner.nextInt();

        switch (numero){
            case 1:
                System.out.println("su numero es el 1");
                break;
            case 2 :
                System.out.println("su numero es el 2");
                break;
            case 3 :
                System.out.println("su numero es el 3");
                break;
            case 4 :
                System.out.println("su numero es el 4");
                break;
            case 5 :
                System.out.println("su numero es el 5");
                break;
            default:
                System.out.println("El numero esta fuera del parametro");
        }
    }
}
