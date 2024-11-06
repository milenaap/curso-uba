public class IndiceCadena {
    public static void main(String[] args) {
        // Manejo de indices en una cadena
        var cadena1 = "Hola Mundo";



        // Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0); // Recuperar el caracter "H"
        System.out.println("primerCaracter = " + primerCaracter);
        // recuperar el ultimo caracter (en la posicion 9)
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        var quintoCaracter = cadena1.charAt(5);
        System.out.println("quintoCaracter = " + quintoCaracter);

    }
}
