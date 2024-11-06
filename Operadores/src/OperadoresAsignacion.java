public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Asignación ***");
        //Asignación =
        var miNumero = 10;
        int miNUmero2;
        miNUmero2 = 15;
        // Asignación compuesto
        // +=
        miNumero += 5; // miNumero = miNumero + 5;
        System.out.println("miNumero = " + miNumero);
        // -=, *=, /= y %=
        miNumero *= 2;
        System.out.println("miNumero = " + miNumero); // miNumero = miNumero * 2 = 30
        // Asignación de variables multiples
        int a = 10, b = 15, c = 20;
        System.out.printf("a = %d, b =%d, c = %d", a, b, c);

    }
}
