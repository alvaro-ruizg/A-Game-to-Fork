module com.ieselgrao.gametofork {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ieselgrao.gametofork to javafx.fxml;
    exports com.ieselgrao.gametofork;
}