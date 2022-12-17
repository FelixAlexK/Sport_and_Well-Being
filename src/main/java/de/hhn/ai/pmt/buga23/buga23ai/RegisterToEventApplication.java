package de.hhn.ai.pmt.buga23.buga23ai;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterToEventApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RegisterToEventApplication.class.getResource("register-to-event-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 700);
        primaryStage.setTitle("Register to Event");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
