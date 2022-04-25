module com.example.brainboxproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.brainboxproject to javafx.fxml;
    exports com.example.brainboxproject;
}