public class Reserva {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hoteles ***");

        // Definimos las variables
        var nombreCliente = "Miguel Flores";
        var diasDistancia = 7;
        var tarifaDiaria = 1300.00;
        var tieneVistaMar = true;

        // Mostrar el detalle

        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasDistancia = " + diasDistancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaMar = " + tieneVistaMar);

        // Modificamos algunos valores
        diasDistancia = 5;
        tarifaDiaria = 900.00;
        tieneVistaMar = false;

        // Mostrar el detalle de la reserva

        System.out.println();
        System.out.println("*** Nuevos Datos de Reserva ***");
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasDistancia = " + diasDistancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaMar = " + tieneVistaMar);
    }
}
