import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

       System.out.print("Precio leche: ");
       var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio platanos: ");
        var precioPlatanos = Double.parseDouble(consola.nextLine());

        System.out.println("Aplicar algún dcto (%)? ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());



        // Calculo del subtotal (sin impuestos)
        var subtotal = precioLeche + precioPan + precioLechuga + precioPlatanos;

        // Aplicar el dcto
        var descuento = subtotal * (descuentoPorcentaje/100.0);

        // Subtotal con dcto
        var subtotalConDescuento = subtotal - descuento;

        // Cálculo con impuestos (16%)
        var impuesto = subtotalConDescuento * 0.16;

        // Calculo total de la compra (con impuestos);
        var costoTotalCompra = subtotalConDescuento + impuesto;

        // Imprimir el ticket de venta
        System.out.printf("""
                %nTicket de Venta
                -----------------
                Subtotal: €%.2f
                Descuento: €%.2f (%d%%)
                Impuesto (16%%): €%.2f
                Costo total: €%.2f
                """, subtotal, descuento, descuentoPorcentaje, impuesto, costoTotalCompra);

    }
}
