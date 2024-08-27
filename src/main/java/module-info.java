module com.example.palindromechecker {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.palindromechecker to javafx.fxml;
    exports com.example.palindromechecker;
    exports com.example.palindromechecker.controllers;
    opens com.example.palindromechecker.controllers to javafx.fxml;
}