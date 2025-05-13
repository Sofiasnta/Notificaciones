package co.edu.uniquindio.poo.model;

public class Invitado extends Usuario {
    public Invitado(String nombre, String email, boolean blocked) {
        super(nombre, email, blocked);
    }


    protected String getHeader() { return "Hola Invitado,"; }
    protected String personalizeMessage(String message) { return message; }
    protected String getFooter() { return "Gracias por usar la aplicación."; }

}

