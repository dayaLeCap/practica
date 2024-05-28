module com.example.practicas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.practicas to javafx.fxml;
    exports com.example.practicas;
}