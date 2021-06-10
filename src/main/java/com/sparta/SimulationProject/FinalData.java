package com.sparta.SimulationProject;

import java.util.HashMap;

public class FinalData {
    private static HashMap<Integer, int[]> closedCentres = new HashMap<>();

    private static HashMap<Integer, int[]> openCentres = new HashMap<>();

    private static HashMap<Integer, int[]> fullCentres = new HashMap<>();

    private static HashMap<Integer, int[]> traineesTraining = new HashMap<>();

    private static HashMap<Integer, int[]> traineesOnWaitingList = new HashMap<>();

    public static HashMap<Integer, int[]> getClosedCentres() {

        return closedCentres;
    }
    public static int[] getClosedCentres(int i) {

        int[] dataForMonth = closedCentres.get(i);
        return dataForMonth;
    }
    public static void addToClosedCentres(HashMap<Integer, int[]> closedCentresInput) {
        closedCentres.putAll(closedCentresInput);
    }

    public static HashMap<Integer, int[]> getOpenCentres() {

        return openCentres;
    }
    public static int[] getOpenCentres(int i) {

        int[] dataForMonth = openCentres.get(i);
        return dataForMonth;
    }

    public static void addToOpenCentres(HashMap<Integer, int[]> openCentresInput) {
        openCentres.putAll(openCentresInput);
    }

    public static HashMap<Integer, int[]> getFullCentres() {

        return fullCentres;
    }
    public static int[] getFullCentres(int i) {

        int[] dataForMonth = fullCentres.get(i);
        return dataForMonth;
    }

    public static void addToFullCentres(HashMap<Integer, int[]> fullCentresInput) {
        fullCentres.putAll(fullCentresInput);
    }

    public static HashMap<Integer, int[]> getTraineesTraining() {

        return traineesTraining;
    }
    public static int[] getTraineesTraining(int i) {

        int[] dataForMonth = traineesTraining.get(i);
        return dataForMonth;
    }

    public static void addToTraineesTraining(HashMap<Integer, int[]> traineesTrainingInput) {
        traineesTraining.putAll(traineesTrainingInput);
    }

    public static HashMap<Integer, int[]> getTraineesOnWaitingList() {
        return traineesOnWaitingList;
    }
    public static int[] getTraineesOnWaitingList(int i) {
        int[] dataForMonth = traineesOnWaitingList.get(i);
        return dataForMonth;
    }

    public static void addToTraineesOnWaitingList(HashMap<Integer, int[]> traineesOnWaitingListInput) {
        traineesOnWaitingList.putAll(traineesOnWaitingListInput);
    }


}

