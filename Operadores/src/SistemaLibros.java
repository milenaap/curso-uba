import java.util.Scanner;

public class SistemaLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema descuento VIP ***");
        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.print("Cuentas con credencial de estudiante (true/false) ");
        var tieneCredencial = Boolean.parseBoolean(consola.nextLine());
        System.out.print("A cuantos km vives de la biblioteca? ");
        var distanciaBibliotecaKm = Integer.parseInt(consola.nextLine());
        var esEligiblePrestamo = tieneCredencial || distanciaBibliotecaKm <= DISTANCIA_PERMITIDA_KM;
        System.out.println("Eres elegible para prestamo de libros? " + (esEligiblePrestamo ? "Si" : "No"));

    }
}
