import javax.swing.*;

public class SentenciaForArreglos {
    public static void main(String[] args) {
    String[] nombres = {"arturo", "juan", "maria", "gina", "yorch"};
    int count = nombres.length;
    for (int i = 0; i < count; i++){
        if (nombres[i].equalsIgnoreCase("arturo") || nombres[i].equalsIgnoreCase("arturo")){
            continue;
        }
        System.out.println(i + " - " + nombres[i]);
      }
    String buscar = JOptionPane.showInputDialog("Ingrese un nombre");
        System.out.println("buscar = " + buscar);
        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        }else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema");
        }
    }
}
