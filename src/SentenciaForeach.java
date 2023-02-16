public class SentenciaForeach {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10, 12, 14, 16};
        for (int numero : numeros){
            System.out.println("numero = " + numero);
        }
        String[] nombres = {"arturo", "juan", "maria", "gina", "yorch"};
        for (String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
