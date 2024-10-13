public class Tipos_datos {


    public static void main(String[] args){
        //--------------------------------------------------------------------------------------------------------------
        // Tipos de datos enteros
        byte tipoByte=127;     // -128 a 127 tamaño 8
        short tipoShort=32767;   // -32,768 a 32,767 tamaño 16
        int tipoInt=2147483647;       // -2,147,483,648 a 2,147,483,647 tamaño 32
        long tipoLong= 9223372036854775807L;     // -9,223,372,036,854,775,808 a -9,223,372,036,854,775,807 tamaño 64
        //long maxValue= Long.MAX_VALUE;

        System.out.println("El tipo byte es : " + tipoByte);
        System.out.println("El tipo short es : " + tipoShort);
        System.out.println("El tipo int es : " + tipoInt);
        System.out.println("El tipo long es : " + tipoLong);
        //System.out.println("El tipo long es : " + maxValue);

        //--------------------------------------------------------------------------------------------------------------
        // Tipos de datos con decimal

        //float tipoFloat= Float.MAX_VALUE;
        float tipoFloat= 1.4e-45f; // 1.4×10^-45  a 3.4028235×10^38
        double tipoDouble=1.7976931348623157e308; // 4.9×10^-324  a 1.7976931348623157×10^308

        System.out.println("El tipo float es : " + tipoFloat);
        System.out.println("El tipo double es : " + tipoDouble);

        //--------------------------------------------------------------------------------------------------------------
        // Tipos de datos caracter
        char tipoCaracter = 'c';
        System.out.println("El tipo caracter es : " + tipoCaracter);

        // Tipos de datos booleano
        boolean tipoBoolean = true;
        System.out.println("El tipo boolean es : " + tipoBoolean); //true o false


    }
}
