package com.sparta.SimulationProject;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import static com.sparta.SimulationProject.LengthOfTime.simulationResult;
import static com.sparta.SimulationProject.WelcomePage.outputSelection;

public class Results {
    static Main m = new Main();

    static Scene ResultsScene(Stage primaryStage) {
        Image spartaLogo = new Image("https://www.gradjobs.co.uk/documents/company-logo/sparta-logo-4020.png");
        ImageView spartaLogoView = new ImageView(spartaLogo);
        spartaLogoView.setX(5);
        spartaLogoView.setY(5);
        spartaLogoView.setFitHeight(100);
        spartaLogoView.setFitWidth(163);
        Group results = new Group();
        ScrollPane scrollPane = new ScrollPane();
        Label resultsPrint;
        Button exitButton = new Button("Exit");
        exitButton.setOnAction(e -> {
            System.exit(0);
        });
        exitButton.relocate(350, 450);
        Button runAgain = new Button("Run New Sim");
        runAgain.relocate(200, 450);
        runAgain.setOnAction(e -> {
            try {
                m.start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        if (outputSelection[1] == 2) {
            resultsPrint = new Label("Results Saved to Simulation Output TXT");
            resultsPrint.relocate(100, 100);
            resultsPrint.setFont(new Font(20));
            results.getChildren().addAll(spartaLogoView, resultsPrint, exitButton, runAgain);
        } else {
            resultsPrint = new Label(simulationResult);
            resultsPrint.relocate(100, 100);
            scrollPane.setContent(resultsPrint);
            scrollPane.setPrefViewportHeight(300);
            scrollPane.setPrefViewportWidth(250);
            scrollPane.relocate(175, 100);
            scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
            results.getChildren().addAll(spartaLogoView, scrollPane, exitButton, runAgain);
        }

        Scene scene = new Scene(results, 600, 500);
        return scene;
    }

}
