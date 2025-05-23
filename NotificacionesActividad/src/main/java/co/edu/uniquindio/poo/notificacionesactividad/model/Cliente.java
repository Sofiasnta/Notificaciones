package co.edu.uniquindio.poo.model;

public class Cliente extends Usuario {

    public Cliente(String nombre, String email, boolean blocked) {
        super(nombre, email, blocked);
    }

    protected String getHeader() { return "Hola Cliente,"; }
    protected String personalizeMessage(String message) { return message; }
    protected String getFooter() { return "Gracias por usar la aplicación."; }

}
