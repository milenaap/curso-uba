import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        // Si es mayor o igual a 6 y menor a 7 es una D

        var consola = new Scanner(System.in);

        System.out.println("Proporciona una calificación entre 0 y 10: ");
        var calificacion = Double.parseDouble(consola.nextLine());
        var calificacionLetra = "";

        // Revisamos si está en los siguientes rangos
        if (calificacion >= 9 && calificacion <= 10){
            calificacionLetra = "A";
        } else if (calificacion >= 8 && calificacion <9) {
            calificacionLetra = "B";
        } else if (calificacion >= 7 && calificacion <8) {
            calificacionLetra = "C";
        } else if (calificacion >= 6 && calificacion <7) {
            calificacionLetra = "D";
        } else if (calificacion >= 0 && calificacion <6) {
            calificacionLetra = "F";
        }else {
            calificacionLetra = "Calificacion incorrecta";
        }



        //imprimir el resultado
        System.out.printf("Calificación % .1f es equivalente a %s", calificacion, calificacionLetra);


    }
}
