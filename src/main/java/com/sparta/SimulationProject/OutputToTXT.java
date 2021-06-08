package com.sparta.SimulationProject;

import java.io.*;
import java.util.HashMap;

public class OutputToTXT {

    public static void outputToTXT(HashMap<Integer, int[]> simulationData) {
        try (BufferedWriter outputToTXT = new BufferedWriter(new FileWriter("resources/SimulationOutput"))){
            for (int i= 1; i< simulationData.size();i++){
                int[]dataForMonth = simulationData.get(i);
            outputToTXT.write("---Month "+i+"---\n");
            outputToTXT.write("Open Centres: "+ dataForMonth[0]+"\n");
            outputToTXT.write("Closed Centres: "+ dataForMonth[1]+"\n");
            outputToTXT.write("Trainees in training: "+ dataForMonth[2]+"\n");
            outputToTXT.write("Trainees on waiting list: "+ dataForMonth[3]+"\n\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



