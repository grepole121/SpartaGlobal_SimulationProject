package com.sparta.SimulationProject;

import java.util.HashMap;

public class Starter {

static private int time;

    public static void start(){
        Printer.print("Press 1 for years, Press 2 for months, Press 3 for a mix : ");
        int selection = UserInput.inputInt();
        if(selection == 1){
            time = 12*UserInput.inputInt();
        }
        else if(selection == 2){
            time = UserInput.inputInt();
        }
        else if(selection == 3){
            Printer.print("Input years : ");
            int years = UserInput.inputInt();
            Printer.print("Input months : ");
            int months = UserInput.inputInt();
            time = months + (12*years);
        }
        else{
            Printer.print("Congratulations you are incompetent");
        }
        Simulation sim = new Simulation();
        HashMap<Integer,int[]> data = sim.runSimulation(time);
        OutputToTXT.outputToTXT(data);
        Printer.print(data);
    }
}
