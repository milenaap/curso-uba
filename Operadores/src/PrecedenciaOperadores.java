public class PrecedenciaOperadores {
    public static void main(String[] args) {
        // Expresion
        var a = 12 / (3 + 2) * 3 - 1;
        // Paso 1. Division 12 / 3 = 4
        // Paso 2. Multiplicacion 2 * 3 = 6
        // Paso 3. Suma 4 + 6 = 10
        // Paso 4. Resta 10 - 1 = 1
        System.out.println("a = " + a);

    }
}
