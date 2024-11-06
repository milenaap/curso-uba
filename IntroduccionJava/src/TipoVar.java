public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***");

        // Sin uso de var
        String nombre1 = "Martha";
        System.out.println("nombre1 = " + nombre1);

        // Con uso de var
        var nombre2 = "Milena";
        System.out.println("nombre2 = " + nombre2);

        // Definir otras variables usando
        var edad = 30; // Se infiere tipo int
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F;// Se infiere tipo float
        var esCasado = false; // Se infiere tipo boolean
        esCasado = true;
        // esCasado = "No"; No podemos asignar u  tipo distinto distinto

        // Se debe definir su valor
        // var precio , esto da error
        // precio = 10;

        // Se debe poner
        // var apellido = null no se puede inferir el tipo de dato
    }
}
