module co.edu.uniquindio.poo.notificacionesactividad {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.notificacionesactividad to javafx.fxml;
    exports co.edu.uniquindio.poo.notificacionesactividad;
}