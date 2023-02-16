public class SentenciaBucleEtiquetas {
    public static void main(String[] args) {
        
        bucle1:
        for (int i = 0; i < 10; i++){
            if (i == 6){
                continue bucle1;
            }
            System.out.println("i = " + i);
        }
    }
}
