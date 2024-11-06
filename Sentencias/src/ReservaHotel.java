import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        // constantes
        final var TARIFA_DIARIA_SIN_VISTA_MAR = 150;
        final var TARIFA_DIARIA_CON_VISTA_MAR = 190.50;


        var consola = new Scanner(System.in);
        System.out.println("Nombre cliente: ");
        var nombreCliente = consola.nextLine();
        System.out.print("Días de estadía: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());

        System.out.println("Con vista al mar (true/false)? ");
        var conVistaAlMar = Boolean.parseBoolean(consola.nextLine());

        // Calculo costo total estancia

        var costoTotal = 0.0;
        if(conVistaAlMar) {
            costoTotal = diasEstadia * TARIFA_DIARIA_CON_VISTA_MAR;
        }else
            costoTotal = diasEstadia *TARIFA_DIARIA_SIN_VISTA_MAR;

        System.out.printf("""
                %n --------------Detalles de la Reservación-------------
                Cliente: %s
                Días de estadía: %d
                Costo total: $%.2f
                Habitación con vista al mar: %s
                """, nombreCliente, diasEstadia, costoTotal, conVistaAlMar ? "Si :)" : "No :(");

    }
}
