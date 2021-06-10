package com.sparta.SimulationProject;

import java.util.HashMap;

public class Printer {


    public static void print(String message) {
        System.out.println(message);
    }

    public static void print(HashMap<Integer, int[]> simulationData) {
        for (int i = 1; i <= simulationData.size(); i++) {
            int[] dataForMonth = simulationData.get(i);
            System.out.println("---Month " + i + "---");
            System.out.println("Open Centres: " + dataForMonth[0]);
            System.out.println("Full Centres: " + dataForMonth[1]);
            System.out.println("Trainees in Training: " + dataForMonth[2]);
            System.out.println("Trainees on the Waiting List: " + dataForMonth[3] + "\n");
        }
    }

    public static void printFinalMonth (HashMap<Integer, int[]> simulationData) {
        int[] dataForFinalMonth = simulationData.get(simulationData.size());
        System.out.println("---Final Month " + simulationData.size() + "---\n"
                + "Open Centres: " + dataForFinalMonth[0] + "\n"
                + "Full Centres: " + dataForFinalMonth[1] + "\n"
                + "Trainees in Training: " + dataForFinalMonth[2] + "\n"
                + "Trainees on the Waiting List: " + dataForFinalMonth[3] + "\n");

    }
}
