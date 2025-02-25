public class Controldeflujo {
    public static void main(String[] Args){

        //Estructuras condicionales
        //if-else

        int edad=11;
        if(edad>=18){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Eres menos de edad");
        }

        // con else-if

        int temperatura=200;

        if(temperatura > 350){
            System.out.println("Esta haciendo calor");
        }else if(temperatura >= 300){
            System.out.println("Esta muy caluroso");
        } else if (temperatura <300) {
            System.out.println("Esta haciendo frio");

        }

        //switch-case

        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Día no válido");
        }
    }
}
