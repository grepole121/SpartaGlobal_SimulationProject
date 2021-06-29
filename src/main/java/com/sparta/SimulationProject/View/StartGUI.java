package com.sparta.SimulationProject.View;

import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartGUI {
    public void generateView(Stage primaryStage, Scene scene) throws IOException {

        primaryStage.setTitle("Sparta Simulation");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
