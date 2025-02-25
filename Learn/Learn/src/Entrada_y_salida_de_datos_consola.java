import java.util.Locale;
import java.util.Scanner;

public class Entrada_y_salida_de_datos_consola {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        Scanner entradaStr = new Scanner(System.in).useLocale(Locale.US);
        int entero;
        float flotante;
        double doble;
        String cadena;
        String cadenaFull;
        char letra;


        System.out.println("Introduce un numero entero");
        entero = entrada.nextInt();

        System.out.println("Introduce un numero con decimales");
        flotante = entrada.nextFloat();

        System.out.println("Introduce un numero con de tipo double");
        doble = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Introduce una cadena de caracteres");
        cadena = entradaStr.next();
        entradaStr.nextLine();

        System.out.println("Introduce una cadena de caracteres FULL");
        cadenaFull = entradaStr.nextLine();

        System.out.println("Introduce una letra");
        letra = entradaStr.next().charAt(0);

        System.out.println("El numero entero es  : " + entero);
        System.out.println("El numero decimal es : " + flotante);
        System.out.println("El numero double es : " + doble);

        System.out.println("La cadena es : " + cadena);

        System.out.println("La cadena full es : " + cadenaFull);
        System.out.println("La letra es : " + letra);


    }
}
