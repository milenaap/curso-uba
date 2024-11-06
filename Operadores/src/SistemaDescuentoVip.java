import java.util.Scanner;

public class SistemaDescuentoVip {
    public static void main(String[] args) {
        System.out.println("*** Sistema descuento VIP ***");
        final var NO_PRODUCTOS_DESCUENTO = 10;
        var consola = new Scanner(System.in);

        System.out.println("Cuantos productos compraste hoy: ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.println("Tienes la membresía de la tienda (true/false)? ");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento =
                cantidadProductos >= NO_PRODUCTOS_DESCUENTO && tienesMembresia;

        System.out.println("Tienes acceso al descuento VIP ? " + esElegibleDescuento);

    }
}
