module com.example.conexion_base {
    requires javafx.controls;
    requires javafx.fxml;
    requires  org.mariadb.jdbc;
    requires java.sql;


    opens com.example.conexion_base to javafx.fxml;
    exports com.example.conexion_base;
}