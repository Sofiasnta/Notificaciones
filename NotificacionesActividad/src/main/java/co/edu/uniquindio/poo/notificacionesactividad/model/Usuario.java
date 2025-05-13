package co.edu.uniquindio.poo.model;

public abstract class Usuario {

    protected String nombre;
    protected String email;
    protected boolean blocked;

    public Usuario(String nombre, String email, boolean blocked) {
        this.nombre = nombre;
        this.email = email;
        this.blocked = blocked;
    }

    public String getNombre() {
        return nombre;
    }
    public String getEmail() { return email; }
    public boolean isBlocked() { return blocked; }


    public final String formatMessage(String Message) {
        return getHeader() + "\n" + personalizeMessage(Message) + "\n" + getFooter();
    }

    protected abstract String getHeader();
    protected abstract String personalizeMessage(String message);
    protected abstract String getFooter();


}
