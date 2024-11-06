public class GeneradorEmail {
    public static void main(String[] args) {
        System.out.println("*** Generador de Email ***");
        var nombreUsuario = "Milena Aguilar Parra";
        var nombreUsuarioNorma = nombreUsuario.toLowerCase().replace(" ", ".");
        //System.out.println("nombreUsuarioNorma = " + nombreUsuarioNorma);
        var nombreEmpresa= "Global Splytin";
        var extensionDominio = ".com.es";
        var emailDominoNorma = "@"+nombreEmpresa.toLowerCase().replace(" ", "") + extensionDominio;
        //System.out.println("emailDominoNorma = " + emailDominoNorma);
        var emailFinal = nombreUsuarioNorma.concat(emailDominoNorma);
        System.out.println("emailFinal = " + emailFinal);


    }
}
