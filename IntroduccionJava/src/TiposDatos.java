public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de Datos en Java
        
        // Enteros
        byte tipoByte =  127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L;
        System.out.println("tipoLong = " + tipoLong);


        // Punto flotante

        float tipoFloat = 3.14f; // F o f para indicar tipo float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D; // D o d para indicar tipo double
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter (tipo default --> \u0000)
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        // Booleano (tipo default --> false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos Object (Referencia)
        String nombre = null; // ausencia de una referencia
        System.out.println("nombre = " + nombre);
        nombre= "Juan Perez";
        System.out.println("nombre = " + nombre);


    }
}
