package com.sparta.SimulationProject;

import java.util.HashMap;

public class Printer {


    public static void  print(String message){
        System.out.println(message);
    }

    public static void print(HashMap<Integer,int[]> simulationData){
        for (int i= 1; i< simulationData.size();i++){
            int[]dataForMonth = simulationData.get(i);
            System.out.println("---Month "+i+"---");
            System.out.println("Open Centres: "+ dataForMonth[0]);
            System.out.println("Full Centres: "+ dataForMonth[1]);
            System.out.println("Trainees in Training: " + dataForMonth[2]);
            System.out.println("Trainees on the Waiting List: "+dataForMonth[3]+"\n");
        }
    }
}
