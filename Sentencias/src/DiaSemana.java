public class DiaSemana {
    public static void main(String[] args) {

        var dia = 8; // Suponiendo que 1 - Lunes

        switch (dia) {
            case 1 -> System.out.println("Lunes");

            case 2 -> System.out.println("Martes");

            case 3 -> System.out.println("Miercoles");

            case 4 -> System.out.println("Jueves");

            case 5 -> System.out.println("Viernes");

            case 6 -> System.out.println("Sábado");

            case 7 -> System.out.println("Domingo");

            default -> System.out.println("Opcion inválida " + dia);
        }

    }
}
