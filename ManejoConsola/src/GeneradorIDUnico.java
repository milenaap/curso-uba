import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println(" *** Sistema Generador de ID Único *** ");
        System.out.print("Cual es tu nombre: ");
        var nombre = consola.nextLine();
        System.out.print("¿Cual es tu apellido? ");
        var apellido = consola.nextLine();
        System.out.print("Año de nacimiento: ");
        var anio = consola.nextLine();

        //JUPE955232

        var random = new Random();
        var numeroAletorio = random.nextInt(9999) + 1;
        var id = nombre.trim().substring(0,2).toUpperCase() +
                apellido.trim().substring(0,2).toUpperCase() +
                anio.substring(2) +
                "%04d".formatted(numeroAletorio);

        System.out.printf("""
                Hola %s,
                \tTu nuevo número de Identificación (ID) generado por el sistema es: 
                \t%s
                \tFelicidades!
                """, nombre,id, numeroAletorio);

    }
}
