package com.sparta.SimulationProject;

import java.util.HashMap;

public class Printer {


    public static void print(String message) {
        System.out.println(message);
    }

    public static String print(HashMap<Integer, int[]> simulationData) {
        String output = "";
        for (int i = 1; i <= simulationData.size(); i++) {
            int[] open = FinalData.getOpenCentres(i);
            int[] full = FinalData.getFullCentres(i);
            int[] closed = FinalData.getClosedCentres(i);
            int[] training = FinalData.getTraineesTraining(i);
            int[] waiting = FinalData.getTraineesOnWaitingList(i);
            System.out.println("---Month " + i + "---");
            System.out.println("Open Centres: \n" + "Training hub : " + open[0] + "\n" + "Training Centre : " + open[1] + "\n" + "Bootcamp : " + open[2]);
            System.out.println("Full Centres: \n" + "Training hub : " + full[0] + "\n" + "Training Centre : " + full[1] + "\n" + "Bootcamp : " + full[2]);
            System.out.println("Closed Centres: \n" + "Training hub : " + closed[0] + "\n" + "Training Centre : " + closed[1] + "\n" + "Bootcamp : " + closed[2]);
            System.out.println("Trainees in Training: \n" + "JAVA : " + training[0] + "\n" + "CSHARP : " + training[1] + "\n" + "DEVOPS : " + training[2] + "\n" + "DATA : " + training[3] + "\n" + "BUSINESS : " + training[4]);
            System.out.println("Trainees on the Waiting List: \n" + "JAVA : " + waiting[0] + "\n" + "CSHARP : " + waiting[1] + "\n" + "DEVOPS : " + waiting[2] + "\n" + "DATA : " + waiting[3] + "\n" + "BUSINESS : " + waiting[4]);
            output += ("---Month " + i + "---");
            output += ("Open Centres: \n" + "Training hub : " + open[0] + "\n" + "Training Centre : " + open[1] + "\n" + "Bootcamp : " + open[2]);
            output += ("Full Centres: \n" + "Training hub : " + full[0] + "\n" + "Training Centre : " + full[1] + "\n" + "Bootcamp : " + full[2]);
            output += ("Closed Centres: \n" + "Training hub : " + closed[0] + "\n" + "Training Centre : " + closed[1] + "\n" + "Bootcamp : " + closed[2]);
            output += ("Trainees in Training: \n" + "JAVA : " + training[0] + "\n" + "CSHARP : " + training[1] + "\n" + "DEVOPS : " + training[2] + "\n" + "DATA : " + training[3] + "\n" + "BUSINESS : " + training[4]);
            output += ("Trainees on the Waiting List: \n" + "JAVA : " + waiting[0] + "\n" + "CSHARP : " + waiting[1] + "\n" + "DEVOPS : " + waiting[2] + "\n" + "DATA : " + waiting[3] + "\n" + "BUSINESS : " + waiting[4]);
        }
        return output;
    }

    public static String printFinalMonth(HashMap<Integer, int[]> simulationData) {
        String output = "";
        int finalMonth = simulationData.size();
        int[] open = FinalData.getOpenCentres(finalMonth);
        int[] full = FinalData.getFullCentres(finalMonth);
        int[] closed = FinalData.getClosedCentres(finalMonth);
        int[] training = FinalData.getTraineesTraining(finalMonth);
        int[] waiting = FinalData.getTraineesOnWaitingList(finalMonth);
        System.out.println("---Final Month " + simulationData.size() + "---\n");
        System.out.println("Open Centres: \n" + "Training hub : " + open[0] + "\n" + "Tech Centre : " + open[1] + "\n" + "Bootcamp : " + open[2]);
        System.out.println("Full Centres: \n" + "Training hub : " + full[0] + "\n" + "Tech Centre : " + full[1] + "\n" + "Bootcamp : " + full[2]);
        System.out.println("Closed Centres: \n" + "Training hub : " + closed[0] + "\n" + "Tech Centre : " + closed[1] + "\n" + "Bootcamp : " + closed[2]);
        System.out.println("Trainees in Training: \n" + "JAVA : " + training[0] + "\n" + "CSHARP : " + training[1] + "\n" + "DEVOPS : " + training[2] + "\n" + "DATA : " + training[3] + "\n" + "BUSINESS : " + training[4]);
        System.out.println("Trainees on the Waiting List: \n" + "JAVA : " + waiting[0] + "\n" + "CSHARP : " + waiting[1] + "\n" + "DEVOPS : " + waiting[2] + "\n" + "DATA : " + waiting[3] + "\n" + "BUSINESS : " + waiting[4]);

        output += ("---Final Month " + simulationData.size() + "---\n");
        output += ("Open Centres: \n" + "Training hub : " + open[0] + "\n" + "Tech Centre : " + open[1] + "\n" + "Bootcamp : " + open[2]);
        output += ("Full Centres: \n" + "Training hub : " + full[0] + "\n" + "Tech Centre : " + full[1] + "\n" + "Bootcamp : " + full[2]);
        output += ("Closed Centres: \n" + "Training hub : " + closed[0] + "\n" + "Tech Centre : " + closed[1] + "\n" + "Bootcamp : " + closed[2]);
        output += ("Trainees in Training: \n" + "JAVA : " + training[0] + "\n" + "CSHARP : " + training[1] + "\n" + "DEVOPS : " + training[2] + "\n" + "DATA : " + training[3] + "\n" + "BUSINESS : " + training[4]);
        output += ("Trainees on the Waiting List: \n" + "JAVA : " + waiting[0] + "\n" + "CSHARP : " + waiting[1] + "\n" + "DEVOPS : " + waiting[2] + "\n" + "DATA : " + waiting[3] + "\n" + "BUSINESS : " + waiting[4]);
        return output;
    }

}
