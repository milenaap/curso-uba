import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.print("Cual es tu usuario: ");
        var consola = new Scanner(System.in);

        final var USUARIO_SISTEMA = "admin";
        var usuario = consola.nextLine();

        final var PASSWORD_SISTEMA = "123";
        System.out.print("Ingresa tu contraseña: ");
        var password = consola.nextLine();

        var resultado = usuario.equals(USUARIO_SISTEMA) && password.equals(PASSWORD_SISTEMA);
        System.out.print("Resultado: " + resultado);
    }
}
