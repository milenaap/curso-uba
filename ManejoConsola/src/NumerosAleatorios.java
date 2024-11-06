import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("*** Números Aleatorios ***");
        var random = new Random();
        
        
        // Generar un número aleatorio entre 0 y 9
        var numeroAletorio = random.nextInt(10);
        System.out.println("numeroAletorio entre 0 y 9 = " + numeroAletorio);

        // Generar un número aleatorio entre 1 y 10
        numeroAletorio = random.nextInt(10) + 1;
        System.out.println("numeroAletorio entre 1 y 10 = " + numeroAletorio);
        
        
        // Generar un numero flotante entre 0.0 y 1.0
        var flotanteAleatorio = random.nextInt();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);

        // Simular el lanzamiento de un dado ( 1 y 6 )
        var dado = random.nextInt(6) + 1;
        System.out.println("Resultado de lanzar el dado = " + dado);


    }
}
