public class ManejoSubCadenas {
    public static void main(String[] args) {
        // Tema subcadenas
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);


        // Subcadena
        var subcadena1 = cadena1.substring(0,4);
        System.out.println("subcadena1 = " + subcadena1);
        var subcadena2 = cadena1.substring(5);
        //var subcadena2 = cadena1.substring(5,10); otra forma
        System.out.println("subcadena2 = " + subcadena2);

    }
}
