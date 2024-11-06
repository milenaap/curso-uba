import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de Cocina ***");
        var consola = new Scanner(System.in);

        // Nombre de la receta
        System.out.print("Ingresa el nombre de la receta: ");
        var nombreReceta = consola.nextLine();


        // Ingredientes
        System.out.print("Ingredientes: ");
        var ingredientes = consola.nextLine();

        // Tiempo de preparación
        System.out.print("Tiempo de preparación (min): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        // Dificultad de la preparacion
        System.out.print(" Ingresa la dificultad (facil/medio/dificil): ");
        var dificultadPreparacion = consola.nextLine();

        // Imprimir los valores de la recera
        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("\tNombre Receta = " + nombreReceta);
        System.out.println("\tIngredientes = " + ingredientes);
        System.out.println("\tTiempo de Preparacion = " + tiempoPreparacion + "minutos");
        System.out.println("\tDificultad= " + dificultadPreparacion);

    }
}
