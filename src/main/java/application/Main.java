package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/primary.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
     //   scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
        stage.show();
    }
}
