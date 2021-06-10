package com.sparta.SimulationProject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;


public class WelcomePage {
    static StartGUI v = new StartGUI();
    static int[] outputSelection = new int[2];
    public static Scene welcomePage(Stage primaryStage) throws Exception{
        Image spartaLogo = new Image("https://www.gradjobs.co.uk/documents/company-logo/sparta-logo-4020.png");
        ImageView spartaLogoView = new ImageView(spartaLogo);
        spartaLogoView.setX(5);
        spartaLogoView.setY(5);
        spartaLogoView.setFitHeight(100);
        spartaLogoView.setFitWidth(163);
        ObservableList<String> whatDataOptions= FXCollections.observableArrayList("Final Month Only",
                "All Months");
        final ComboBox whatDataOptionsBox = new ComboBox(whatDataOptions);
        Group g=new Group();
        whatDataOptionsBox.relocate(225, 200);
        ObservableList<String> dataAccessOptions= FXCollections.observableArrayList("Print to Screen",
                "Save To Text File","Both");
        final ComboBox dataAccessOptionsBox= new ComboBox(dataAccessOptions);
        dataAccessOptionsBox.relocate(225,300);
        Button b = new Button("Next ->");
        b.relocate(275, 400);
        b.setOnAction(e->{
            try {
                if (dataAccessOptionsBox.getValue() != null && whatDataOptionsBox.getValue() != null){
                    v.generateView(primaryStage, LengthOfTime.LengthOfTimeScene(primaryStage));
                    if (whatDataOptionsBox.getValue()=="Final Month Only"){outputSelection[0]=2;}
                    else{outputSelection[0]=1;}
                    if (dataAccessOptionsBox.getValue()=="Print to Screen"){outputSelection[1]=1;}
                    if (dataAccessOptionsBox.getValue()=="Save To Text File"){outputSelection[1]=2;}
                    else{outputSelection[1]=3;}
                }
                else {v.generateView(primaryStage, FailedStartUpScene(primaryStage));}
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        Label welcome = new Label("Welcome To The Sparta Trainee Simulation");
        welcome.setFont(new Font(20));
        welcome.relocate(105,100);

        Label whatData = new Label("What Data Would you like the simulation to Output?");
        whatData.setFont(new Font(15));
        whatData.relocate(125,175);

        Label dataAccess = new Label("How Would You Like The Simulation to Output the Data?");
        dataAccess.setFont(new Font(15));
        dataAccess.relocate(115,275);
        g.getChildren().addAll(whatDataOptionsBox,dataAccessOptionsBox,b,welcome,whatData,dataAccess,spartaLogoView);
        Scene scene= new Scene(g,600,550);
        return scene;


    }
    public static Scene FailedStartUpScene(Stage primaryStage) throws Exception{
        Image spartaLogo = new Image("https://www.gradjobs.co.uk/documents/company-logo/sparta-logo-4020.png");
        ImageView spartaLogoView = new ImageView(spartaLogo);
        spartaLogoView.setX(5);
        spartaLogoView.setY(5);
        spartaLogoView.setFitHeight(100);
        spartaLogoView.setFitWidth(163);

        ObservableList<String> whatDataOptions= FXCollections.observableArrayList("Final Month Only",
                "All Months");
        final ComboBox whatDataOptionsBox = new ComboBox(whatDataOptions);
        Group g=new Group();
        whatDataOptionsBox.relocate(225, 200);
        ObservableList<String> dataAccessOptions= FXCollections.observableArrayList("Print to Screen",
                "Save To Text File","Both");
        final ComboBox dataAccessOptionsBox= new ComboBox(dataAccessOptions);
        dataAccessOptionsBox.relocate(225,300);
        Button b = new Button("Next ->");
        b.relocate(275, 400);
        b.setOnAction(e->{
            try {
                if (dataAccessOptionsBox.getValue() != null && whatDataOptionsBox.getValue() != null){
                    v.generateView(primaryStage, LengthOfTime.LengthOfTimeScene(primaryStage));
                    if (whatDataOptionsBox.getValue()=="Final Month Only"){outputSelection[0]=2;}
                    else{outputSelection[0]=1;}
                    if (dataAccessOptionsBox.getValue()=="Print to Screen"){outputSelection[1]=1;}
                    if (dataAccessOptionsBox.getValue()=="Save To Text File"){outputSelection[1]=2;}
                    else{outputSelection[1]=3;}
                }
                else {v.generateView(primaryStage, FailedStartUpScene(primaryStage));}
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        Label welcome = new Label("Welcome To The Sparta Trainee Simulation");
        welcome.setFont(new Font(20));
        welcome.relocate(105,100);

        Label whatData = new Label("What Data Would you like the simulation to Output?");
        whatData.setFont(new Font(15));
        whatData.relocate(125,175);

        Label dataAccess = new Label("How Would You Like The Simulation to Output the Data?");
        dataAccess.setFont(new Font(15));
        dataAccess.relocate(115,275);
        Label warning =new Label("Please select a value for each box");
        warning.setFont(new Font(15));
        warning.relocate(200,375);
        warning.setTextFill(Color.rgb(255,0,0));
        g.getChildren().addAll(whatDataOptionsBox,dataAccessOptionsBox,b,welcome,whatData,dataAccess,warning,spartaLogoView);
        Scene scene= new Scene(g,600,550);
        v.generateView(primaryStage,scene);


        return scene;
    }
}
