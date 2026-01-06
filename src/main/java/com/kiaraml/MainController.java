package com.kiaraml;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MainController {
    @FXML
    private Pane iconPane;

    @FXML
    private void generateIcon() {
        iconPane.getChildren().clear();
        Circle circle = new Circle(50);
        circle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        circle.setCenterX(100);
        circle.setCenterY(100);

        iconPane.getChildren().add(circle);

    }
}
