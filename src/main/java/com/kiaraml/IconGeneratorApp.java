package com.kiaraml;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class IconGeneratorApp extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        /*
        Circle icon = new Circle(60, Color.CORNFLOWERBLUE);
        StackPane root = new StackPane(icon);
        Scene scene = new Scene(root, 300, 300);

        stage.setTitle("Icon Generator!");
        stage.setScene(scene);
        stage.show();

         */
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/com.kiaraml/main-view.fxml")
        );

        Scene scene = new Scene(loader.load(), 800, 500);
        stage.setTitle("Icon Generator");
        stage.setScene(scene);
        stage.show();
    }

    /*
    public static void main(String[] args) {
        //launch();

    }

     */
}
