public class Java_tipos_de_datos {

    // Enum definido fuera de cualquier método y dentro de la clase
    public enum Days {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }

    public static void main(String[] args) {
        // DATOS PRIMITIVOS
        //--------------------------------------------------------------------------------------------------------------
        // Tipos de datos enteros
        byte tipoByte = 127;     // -128 a 127 tamaño 8
        short tipoShort = 32767;   // -32,768 a 32,767 tamaño 16
        int tipoInt = 2147483647;       // -2,147,483,648 a 2,147,483,647 tamaño 32
        long tipoLong = 9223372036854775807L;     // -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 tamaño 64

        System.out.println("El tipo byte es : " + tipoByte);
        System.out.println("El tipo short es : " + tipoShort);
        System.out.println("El tipo int es : " + tipoInt);
        System.out.println("El tipo long es : " + tipoLong);

        //--------------------------------------------------------------------------------------------------------------
        // Tipos de datos con decimal
        float tipoFloat = 1.4e-45f; // 1.4×10^-45 a 3.4028235×10^38
        double tipoDouble = 1.7976931348623157e308; // 4.9×10^-324 a 1.7976931348623157×10^308

        System.out.println("El tipo float es : " + tipoFloat);
        System.out.println("El tipo double es : " + tipoDouble);

        //--------------------------------------------------------------------------------------------------------------
        // Tipos de dato caracter
        final char tipoCaracter = 'c'; // Con 'final' declaramos el valor como constante
        System.out.println("El tipo caracter es : " + tipoCaracter);

        // Tipos de dato booleano
        boolean tipoBoolean = true;
        System.out.println("El tipo boolean es : " + tipoBoolean); // true o false

        // DATOS NO PRIMITIVOS
        // String
        String tipoString = "Hola mundo"; // Almacena una cadena de caracteres
        System.out.println("El tipo string es : " + tipoString);

        // Arreglos
        int[] numeros = {1, 2, 3, 4, 5, 6}; // Almacena múltiples valores del mismo tipo
        String[] nombres = {"Nameless", "Daniel"};
        System.out.println("Primer número del arreglo: " + numeros[0]);
        System.out.println("Primer nombre del arreglo: " + nombres[0]);

        // Enum
        Days lunes = Days.LUNES;
        System.out.println("Día seleccionado: " + lunes);
    }
}