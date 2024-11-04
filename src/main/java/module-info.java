module proyecto.proyecto {
    requires javafx.controls;
    requires javafx.fxml;


    opens proyecto.proyecto to javafx.fxml;
    exports proyecto.proyecto;
}