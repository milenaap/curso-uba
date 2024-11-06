public class OperadorTernario {
    public static void main(String[] args) {
        // Sintaxis
        // Condicion ? exp1 : exp2

        // Determinar si un numero es par o no
        var numero = 4;
        var resultado = (numero % 2 == 0)? "Par": "Impar";
        System.out.println("El numero " + numero + " es: " + resultado);

        // Calcular si es mayor de edad
        var edad = 17;
        var mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println("\nTienes " + edad +", " + mensaje);

    }
}
