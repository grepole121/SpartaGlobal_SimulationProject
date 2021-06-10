package com.sparta.SimulationProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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



