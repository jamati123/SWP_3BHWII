module com.example.abschlusssachen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.abschlusssachen to javafx.fxml;
    exports com.example.abschlusssachen;
}