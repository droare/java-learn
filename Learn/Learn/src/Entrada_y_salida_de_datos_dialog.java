import javax.swing.*;

public class Entrada_y_salida_de_datos_dialog {
    public static void main(String[] args) {

        int entero;
        float flotante;
        double doble;
        String cadena;
        String cadenaFull;
        char letra;

        entero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entero : "));
        flotante = Float.parseFloat(JOptionPane.showInputDialog("Introduzca un numero decimal : "));





        System.out.println("El valor entero es : " + entero);
        System.out.println("El valor decimal es : " + flotante);
    }
}
