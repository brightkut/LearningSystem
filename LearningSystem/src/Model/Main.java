package Model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.Connection;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../View/Home.fxml"));
        primaryStage.setTitle("Manage Schedule for Learning ");
        primaryStage.setScene(new Scene(root, 546, 400));
        primaryStage.show();
    }




    public static void main(String[] args) {
        launch(args);

    }
}
