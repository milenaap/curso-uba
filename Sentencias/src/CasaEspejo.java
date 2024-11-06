import java.util.Scanner;

public class CasaEspejo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Que edad tienes?: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.println("Tienes miedo a la oscuridad (true/false)?: ");
        var tieneMiedo = Boolean.parseBoolean(consola.nextLine());

        if (edad >= 10 && !tieneMiedo){
            System.out.println("Cumples con la condicion de entrar ");
        }else {
            System.out.println("Lo sentimos, no cumples las condiciones :(");
        }
    }
}
