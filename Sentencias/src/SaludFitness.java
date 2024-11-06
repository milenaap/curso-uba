import java.util.Scanner;

public class SaludFitness {
    public static void main(String[] args) {

        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04; // Valor aproximado en kilocalorias

        var consola = new Scanner(System.in);

        var usuario = consola.nextLine();

        var pasosDiarios = Integer.parseInt(consola.nextLine());

        var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;


        var metaAlcanzada = (pasosDiarios >= META_PASOS_DIARIO) ? "Si :)" : "No :(";

        System.out.printf("""
                %nUsuario: %s
                Pasos dados hoy: %d
                Calorías quemadas: %.2f kcal
                Meta de pasos diarios alcanzada : %s
                ------------------------------------
                La meta de pasos diarios es de: %d pasos
                """, usuario, pasosDiarios,caloriasQuemadas, metaAlcanzada);




    }
}
