package com.sparta.SimulationProject.View;

import com.sparta.SimulationProject.Util.Printer;

import java.io.*;

public class OutputToTXT {

    public static void outputToTXT() {
        try (BufferedWriter outputToTXT = new BufferedWriter(new FileWriter("resources/SimulationOutput"))) {
            outputToTXT.write(Printer.print());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void outputToTXTFinalMonth() {
        try (BufferedWriter outputToTXT = new BufferedWriter(new FileWriter("resources/SimulationOutput"))) {
            outputToTXT.write(Printer.printFinalMonth());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}



