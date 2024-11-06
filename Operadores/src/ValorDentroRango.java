import java.math.MathContext;
import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {

        // Definimos los limites

        final var MINIMO = 0;
        final var MAXIMO = 5;
        // Solicitar un valor entre 0 y 5
        System.out.print("Proporciona un dato entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        // Verificar si el dato esta dentro del rango
        var estraDentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("estraDentroRango = " + estraDentroRango);
    }
}
