package SimulationProject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

import static SimulationProject.Results.ResultsScene;

import static SimulationProject.WelcomePage.outputSelection;

public class LengthOfTime {
    static String simulationResult;
    static StartGUI v = new StartGUI();
    public static Scene LengthOfTimeScene(Stage primaryStage){
    Image spartaLogo = new Image("https://www.gradjobs.co.uk/documents/company-logo/sparta-logo-4020.png");
    ImageView spartaLogoView = new ImageView(spartaLogo);
    spartaLogoView.setX(5);
    spartaLogoView.setY(5);
    spartaLogoView.setFitHeight(100);
    spartaLogoView.setFitWidth(163);
    Group lengthOfTime = new Group();
    Label introduction = new Label("How long would you Like the simulation to run?");
    introduction.setFont(new Font(20));
    introduction.relocate(100,100);
    Label howToEnterTime = new Label("How would you like to enter the length of time?");
    howToEnterTime.setFont(new Font(15));
    howToEnterTime.relocate(150,175);
    ObservableList<String> entryOptionsList= FXCollections.observableArrayList("Years","Months","Years and Months");
    final ComboBox entryOptions = new ComboBox(entryOptionsList);
    entryOptions.relocate(225,200);
    TextField years = new TextField();
    years.relocate(125,260);
    Label yearsLabel = new Label("Years:");
    yearsLabel.setFont(new Font(15));
    yearsLabel.relocate(125,235);
    TextField months = new TextField();
    months.relocate(325,260);
    Label monthsLabel = new Label("Months:");
    monthsLabel.setFont(new Font(15));
    monthsLabel.relocate(325,235);
    Button runSimulationButton= new Button("Run Simulation");
    runSimulationButton.relocate(265,350);
    runSimulationButton.setOnAction(e->{
        try {
            if (entryOptions.getValue() == null){
                {v.generateView(primaryStage, LengthOfTimeSceneFailedOptions(primaryStage));}

            }

            else if (entryOptions.getValue()=="Months") {
                if (months.getCharacters().length()==0){v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));}
                else if (months.getCharacters().toString().matches("[0-9]*")) {
                    if (Integer.parseInt(months.getCharacters().toString()) > 0) {
                        int[] yearsAndMonths=new int[2];
                        yearsAndMonths[0]=0;
                        yearsAndMonths[1]=Integer.parseInt(months.getCharacters().toString());
                        simulationResult=Starter.start(yearsAndMonths,outputSelection);
                        v.generateView(primaryStage, ResultsScene(primaryStage));

                    } else {
                        v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));
                    }
                }else{v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));}
            }
            else if (entryOptions.getValue()== "Years"){
                if (years.getCharacters().length()==0){v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));}
                else if (years.getCharacters().toString().matches("[0-9]*")) {
                    if (Integer.parseInt(years.getCharacters().toString()) > 0) {
                        int[] yearsAndMonths=new int[2];
                        yearsAndMonths[1]=0;
                        yearsAndMonths[0]=Integer.parseInt(years.getCharacters().toString());
                        simulationResult=Starter.start(yearsAndMonths,outputSelection);
                        v.generateView(primaryStage, ResultsScene(primaryStage));
                    } else {
                        v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));
                    }
                }else{v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));}
            }
            else {
                if (years.getCharacters().length()==0||months.getCharacters().length()==0){v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));}
                else if(months.getCharacters().toString().matches("[0-9]*") && years.getCharacters().toString().matches("[0-9]*")){
                    int[] yearsAndMonths=new int[2];

                    yearsAndMonths[0]= Integer.parseInt(years.getCharacters().toString());
                    yearsAndMonths[1]=Integer.parseInt(months.getCharacters().toString());
                    simulationResult=Starter.start(yearsAndMonths,outputSelection);
                    v.generateView(primaryStage, ResultsScene(primaryStage));}
                else{v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));}
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    });
        Button back = new Button("<- Back");
        back.relocate(200,350);
        back.setOnAction(e->{
            try {
                v.generateView(primaryStage,WelcomePage.welcomePage(primaryStage));
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
    lengthOfTime.getChildren().addAll(entryOptions,years
            ,months,introduction,yearsLabel,monthsLabel,
            howToEnterTime,runSimulationButton,spartaLogoView,back);
    Scene scene = new Scene(lengthOfTime,600,400);
    return scene;
}
    private static Scene LengthOfTimeSceneFailedValues(Stage primaryStage) {
        Image spartaLogo = new Image("https://www.gradjobs.co.uk/documents/company-logo/sparta-logo-4020.png");
        ImageView spartaLogoView = new ImageView(spartaLogo);
        spartaLogoView.setX(5);
        spartaLogoView.setY(5);
        spartaLogoView.setFitHeight(100);
        spartaLogoView.setFitWidth(163);
        Group lengthOfTime = new Group();
        Label introduction = new Label("How long would you Like the simulation to run?");
        introduction.setFont(new Font(20));
        introduction.relocate(100,100);
        Label howToEnterTime = new Label("How would you like to enter the length of time?");
        howToEnterTime.setFont(new Font(15));
        howToEnterTime.relocate(150,175);
        ObservableList<String> entryOptionsList= FXCollections.observableArrayList("Years","Months","Years and Months");
        final ComboBox entryOptions = new ComboBox(entryOptionsList);
        entryOptions.relocate(225,200);
        TextField years = new TextField();
        years.relocate(125,260);
        Label yearsLabel = new Label("Years:");
        yearsLabel.setFont(new Font(15));
        yearsLabel.relocate(125,235);
        TextField months = new TextField();
        months.relocate(325,260);
        Label monthsLabel = new Label("Months:");
        monthsLabel.setFont(new Font(15));
        monthsLabel.relocate(325,235);
        Button runSimulationButton= new Button("Run Simulation");
        runSimulationButton.relocate(265,350);
        Label warning =new Label("Please enter positive integer values for month/year");
        warning.setFont(new Font(15));
        warning.relocate(125,325);
        warning.setTextFill(Color.rgb(255,0,0));
        runSimulationButton.setOnAction(e->{
            try {
                if (entryOptions.getValue() == null){
                    {v.generateView(primaryStage, LengthOfTimeSceneFailedOptions(primaryStage));}

                }

                else if (entryOptions.getValue()=="Months") {
                    if (months.getCharacters().length()==0){v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));}
                    else if (months.getCharacters().toString().matches("[0-9]*")) {
                        if (Integer.parseInt(months.getCharacters().toString()) > 0) {
                            int[] yearsAndMonths=new int[2];
                            yearsAndMonths[0]=0;
                            yearsAndMonths[1]=Integer.parseInt(months.getCharacters().toString());
                            simulationResult=Starter.start(yearsAndMonths,outputSelection);
                            v.generateView(primaryStage, ResultsScene(primaryStage));
                        } else {
                            v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));
                        }
                    }else{v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));}
                }
                else if (entryOptions.getValue()== "Years"){
                    if (years.getCharacters().length()==0){v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));}
                    else if (years.getCharacters().toString().matches("[0-9]*")) {
                        if (Integer.parseInt(years.getCharacters().toString()) > 0) {
                            int[] yearsAndMonths=new int[2];
                            yearsAndMonths[1]=0;
                            yearsAndMonths[0]=Integer.parseInt(years.getCharacters().toString());
                            simulationResult= Starter.start(yearsAndMonths,outputSelection);
                            v.generateView(primaryStage, ResultsScene(primaryStage));
                        } else {
                            v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));
                        }
                    }else{v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));}
                }
                else {
                    if (years.getCharacters().length()==0||months.getCharacters().length()==0){v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));}
                    else if(months.getCharacters().toString().matches("[0-9]*") && years.getCharacters().toString().matches("[0-9]*")){
                        int[] yearsAndMonths=new int[2];

                        yearsAndMonths[0]= Integer.parseInt(years.getCharacters().toString());
                        yearsAndMonths[1]=Integer.parseInt(months.getCharacters().toString());
                        simulationResult= Starter.start(yearsAndMonths,outputSelection);
                        v.generateView(primaryStage, ResultsScene(primaryStage));}
                    else{v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));}
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        Button back = new Button("<- Back");
        back.relocate(200,350);
        back.setOnAction(e->{
            try {
                v.generateView(primaryStage,WelcomePage.welcomePage(primaryStage));
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        lengthOfTime.getChildren().addAll(entryOptions,years
                ,months,introduction,yearsLabel,monthsLabel,
                howToEnterTime,runSimulationButton,spartaLogoView,warning,back);
        Scene scene = new Scene(lengthOfTime,600,400);
        return scene;
    }


    private static Scene LengthOfTimeSceneFailedOptions(Stage primaryStage) {
        Image spartaLogo = new Image("https://www.gradjobs.co.uk/documents/company-logo/sparta-logo-4020.png");
        ImageView spartaLogoView = new ImageView(spartaLogo);
        spartaLogoView.setX(5);
        spartaLogoView.setY(5);
        spartaLogoView.setFitHeight(100);
        spartaLogoView.setFitWidth(163);
        Group lengthOfTime = new Group();
        Label introduction = new Label("How long would you Like the simulation to run?");
        introduction.setFont(new Font(20));
        introduction.relocate(100,100);
        Label howToEnterTime = new Label("How would you like to enter the length of time?");
        howToEnterTime.setFont(new Font(15));
        howToEnterTime.relocate(150,175);
        ObservableList<String> entryOptionsList= FXCollections.observableArrayList("Years","Months","Years and Months");
        final ComboBox entryOptions = new ComboBox(entryOptionsList);
        entryOptions.relocate(225,200);
        TextField years = new TextField();
        years.relocate(125,260);
        Label yearsLabel = new Label("Years:");
        yearsLabel.setFont(new Font(15));
        yearsLabel.relocate(125,235);
        TextField months = new TextField();
        months.relocate(325,260);
        Label monthsLabel = new Label("Months:");
        monthsLabel.setFont(new Font(15));
        monthsLabel.relocate(325,235);
        Button runSimulationButton= new Button("Run Simulation");
        runSimulationButton.relocate(265,350);
        Label warning =new Label("Please select an option for how you want to enter data");
        warning.setFont(new Font(15));
        warning.relocate(125,325);
        warning.setTextFill(Color.rgb(255,0,0));
        runSimulationButton.setOnAction(e->{
            try {
                if (entryOptions.getValue() == null){
                    {v.generateView(primaryStage, LengthOfTimeSceneFailedOptions(primaryStage));}

                }

                else if (entryOptions.getValue()=="Months") {
                    if (months.getCharacters().length()==0){v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));}
                    else if (months.getCharacters().toString().matches("[0-9]*")) {
                        if (Integer.parseInt(months.getCharacters().toString()) > 0) {
                            int[] yearsAndMonths=new int[2];
                            yearsAndMonths[0]=0;
                            yearsAndMonths[1]=Integer.parseInt(months.getCharacters().toString());
                            simulationResult=Starter.start(yearsAndMonths,outputSelection);
                            v.generateView(primaryStage, ResultsScene(primaryStage));
                        } else {
                            v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));
                        }
                    }else{v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));}
                }
                else if (entryOptions.getValue()== "Years"){
                    if (years.getCharacters().length()==0){v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));}
                    else if (years.getCharacters().toString().matches("[0-9]*")) {
                        if (Integer.parseInt(years.getCharacters().toString()) > 0) {
                            int[] yearsAndMonths=new int[2];
                            yearsAndMonths[1]=0;
                            yearsAndMonths[0]=Integer.parseInt(years.getCharacters().toString());
                            simulationResult=Starter.start(yearsAndMonths,outputSelection);
                            v.generateView(primaryStage, ResultsScene(primaryStage));
                        } else {
                            v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));
                        }
                    }else{v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));}
                }
                else {
                    if (years.getCharacters().length()==0||months.getCharacters().length()==0){v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));}
                    else if(months.getCharacters().toString().matches("[0-9]*") && years.getCharacters().toString().matches("[0-9]*")){
                        int[] yearsAndMonths=new int[2];

                        yearsAndMonths[0]= Integer.parseInt(years.getCharacters().toString());
                        yearsAndMonths[1]=Integer.parseInt(months.getCharacters().toString());
                        simulationResult=Starter.start(yearsAndMonths,outputSelection);
                        v.generateView(primaryStage, ResultsScene(primaryStage));}
                    else{v.generateView(primaryStage, LengthOfTimeSceneFailedValues(primaryStage));}
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        Button back = new Button("<- Back");
        back.relocate(200,350);
        back.setOnAction(e->{
            try {
                v.generateView(primaryStage,WelcomePage.welcomePage(primaryStage));
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        lengthOfTime.getChildren().addAll(entryOptions,years
                ,months,introduction,yearsLabel,monthsLabel,
                howToEnterTime,runSimulationButton,spartaLogoView,warning,back);
        Scene scene = new Scene(lengthOfTime,600,400);
        return scene;
    }

}
