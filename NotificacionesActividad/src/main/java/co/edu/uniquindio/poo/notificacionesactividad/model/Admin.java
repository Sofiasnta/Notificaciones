package co.edu.uniquindio.poo.model;

public class Admin extends Usuario {

    public Admin(String nombre, String email, boolean blocked) {
        super(nombre, email, blocked);
    }

    protected String getHeader() {
        return "[ADMINISTRADOR]";
    }

    protected String personalizeMessage(String message) {
        return "Administrador: " + message;
    }

    protected String getFooter() {
        return "-- Sistema --";
    }

}
