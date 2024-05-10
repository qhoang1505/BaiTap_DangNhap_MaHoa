module com.example.ss {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;
    requires java.datatransfer;
    requires mysql.connector.java;


    exports View to javafx.fxml, javafx.graphics;
    opens View to javafx.fxml;
    exports Controller.Login to javafx.fxml, javafx.graphics;
    opens Controller.Login to javafx.fxml;
    exports Model.Person to javafx.fxml, javafx.graphics;
    opens Model.Person to javafx.base, javafx.fxml;
}