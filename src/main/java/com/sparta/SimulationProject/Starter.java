package com.sparta.SimulationProject;

import java.util.HashMap;

import static com.sparta.SimulationProject.FinalData.getClosedCentres;

public class Starter {

    static private int time;

    public static void start() {
        Printer.print("Press 1 for years, Press 2 for months, Press 3 for a mix : ");
        int selection = UserInput.inputInt();
        if (selection == 1) {
            Printer.print("Input years : ");
            time = 12 * UserInput.inputInt();
        } else if (selection == 2) {
            Printer.print("Input months : ");
            time = UserInput.inputInt();
        } else if (selection == 3) {
            Printer.print("Input years : ");
            int years = UserInput.inputInt();
            Printer.print("Input months : ");
            int months = UserInput.inputInt();
            time = months + (12 * years);
        } else {
            Printer.print("Congratulations you are incompetent");
        }

        Simulation sim = new Simulation();
        //HashMap<Integer, int[]> data = sim.runSimulation(time);
        sim.runSimulation(time);
        HashMap<Integer,int[]> output= FinalData.getTraineesTraining();
        Printer.print(output);

        boolean finalMonth = false;
        Printer.print("Press 1 for printing month breakdown, Press 2 for printing just the final month: ");
        int selectionOutputMonth = UserInput.inputInt();
        if (selectionOutputMonth == 1) {
            finalMonth = false;
        } else if (selectionOutputMonth == 2) {
            finalMonth = true;
        } else {
            Printer.print("Congratulations you are incompetent");
        }

//        Printer.print("Press 1 for printing to console, Press 2 for outputting to text file, Press 3 for a both: ");
//        int selectionOutput = UserInput.inputInt();
//        if (selectionOutput == 1) {
//            if (finalMonth) {
//                Printer.printFinalMonth(data);
//                OutputToTXT.outputToTXTFinalMonth(data);
//            } else {
//                Printer.print(data);
//                OutputToTXT.outputToTXT(data);
//            }
//        } else if (selectionOutput == 2) {
//            OutputToTXT.outputToTXT(data);
//        } else if (selectionOutput == 3) {
//
//            if (finalMonth) {
//                Printer.printFinalMonth(data);
//                OutputToTXT.outputToTXTFinalMonth(data);
//            } else {
//                OutputToTXT.outputToTXT(data);
//                Printer.print(data);
//            }
//        } else {
//            Printer.print("Congratulations you are incompetent");
//        }


    }
}
