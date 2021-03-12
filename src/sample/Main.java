package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    private sample.Controller Controller;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main_view.fxml"));

        Scene scene = new Scene(root, 700, 400);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
       //primaryStage.setMinWidth(400);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
