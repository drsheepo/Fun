module com.example.fun {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fun to javafx.fxml;
    exports com.example.fun;
}