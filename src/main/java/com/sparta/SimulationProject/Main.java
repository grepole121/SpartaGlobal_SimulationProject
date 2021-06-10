package SimulationProject;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
 StartGUI v = new StartGUI();
    public static void main(String[] args) {
    launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        v.generateView(primaryStage,WelcomePage.welcomePage(primaryStage));
    }

}
