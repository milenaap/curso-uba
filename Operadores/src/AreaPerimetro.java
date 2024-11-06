import java.util.Scanner;

public class AreaPerimetro {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Base: ");
        var base = Integer.parseInt(consola.nextLine());
        System.out.print("Altura: ");
        var altura = Integer.parseInt(consola.nextLine());

        // Realizamos el calculo del area
        var areaRectangulo = base * altura;
        System.out.println("areaRectangulo = " + areaRectangulo);

        // Realizamos el perimetro
        var perimetro = 2 * (base + altura);
        System.out.println("perimetro = " + perimetro);
    }
}
