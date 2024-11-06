import java.util.Scanner;

public class TiendaLinea {
    public static void main(String[] args) {


        // Condiciones
        final var IMPORTE_COMPRA_DESC = 1000.00;
        var consola = new Scanner(System.in);

        System.out.println("Cual fue el importe de tu compra? ");
        var importeCompra = Double.parseDouble(consola.nextLine());

        System.out.println("Eres miembro de la tienda (true/false)? ");
        var eresMiembro = Boolean.parseBoolean(consola.nextLine());

        // Calculamos el dcto
        var descuento = 0.0;
        // Verificamos cada caso, con los datos proporcionados
        if(importeCompra >= IMPORTE_COMPRA_DESC && eresMiembro) {
            descuento = 0.1; // Descuento del 10%
        } else if (eresMiembro) {
            descuento = 0.05; // Descuento del 5%
        } else {
            descuento = 0; // Descuento del 0%
        }

        // Hacemos los calculos respectivos para obtener el importe final

        if (descuento != 0){
            var importeDescuento = importeCompra * descuento;
            var importeFinal = importeCompra - importeDescuento;
            System.out.printf("""
                    %nFelicidades!, has obtenido un dcto del %.0f%%
                    Importe de la compra: €%.2f
                    Importe del dcto: €%.2f
                    Importe final de la compra con dcto: €%.2f
                    """, descuento *100, importeCompra, importeDescuento, importeFinal);
        }
        else{
            System.out.printf("""
                    %nNo obtuviste ningún tipo de dcto
                    Te invitamos a hacerte miembro de la tienda!
                    Importe final de la compra: €%.2f
                    """, importeCompra);
        }
    }
}
