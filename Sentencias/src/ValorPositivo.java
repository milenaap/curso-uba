import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Proporciona un número: ");
        var numero = Integer.parseInt(consola.nextLine());

        if(numero > 0) {
            System.out.println("Es positivo: " + numero);
        } else if (numero < 0){
            System.out.println("Es negativo: " + numero);
        } else {
            System.out.println("Es cero: " + numero);
        }
    }
}
