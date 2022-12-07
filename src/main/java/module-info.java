module com.operadores.ejercicio1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.operadores.ejercicio1 to javafx.fxml;
    exports com.operadores.ejercicio1;
}