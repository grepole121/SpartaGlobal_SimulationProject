package com.sparta.SimulationProject.View;

import com.sparta.SimulationProject.Controller.WelcomePage;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
 StartGUI v = new StartGUI();
    public static void main(String[] args) {
    launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        v.generateView(primaryStage, WelcomePage.welcomePage(primaryStage));
    }

}
