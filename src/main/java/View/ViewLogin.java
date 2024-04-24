package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewLogin extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(ViewLogin.class.getResource("/LoginScreen/Login.fxml"));

        Scene scenelogin = new Scene(fxmlLoader.load(), 1126, 638);
        stage.setTitle("Login Home");
        stage.setScene(scenelogin);
        stage.show();
        stage.setResizable(false);
    }
}
