public class ReglasNombresVariables {
    public static void main(String[] args) {
        //Reglas nombres variables
        String nombreCompleto = " Juan Carlos"; // Correcto, y buenas practicas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = " Juan Carlor 2 "; // Correcto no aplica las buenas practicas
        System.out.println("NombreCompleto = " + NombreCompleto);
        //String nombre-cliente = "Juan"; // Incorrecto
        String nombre_cliente = "Juan"; // Correcto, no aplica buenas practicas
        String _apellido = "Perez"; // Correcto y aceptable
        String $apellido = "Juarez"; // Correcto y aceptable
        int totPzs = 10; // Correcto, no aplica buenas practicas
        int totalPiezas = 10; // Correcto, aplica buenas practicas
        boolean casado = true; // Correcto, aun puede mejorar
        boolean esCasado = true; // Correcto, aplica buenas practicas
        boolean isCasado = true; // Correcto, aplica buenas practicas *
        boolean isSaldo = true; // Correcto, aplica buenas practicas
        boolean hasSaldo = true; // Correcto, aplica buenas practicas *
    }
}
