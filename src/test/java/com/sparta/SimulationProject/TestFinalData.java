package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.FinalData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class TestFinalData {

//    private HashMap<Integer, int[]> closedCentres = new HashMap<>();
//
//    private HashMap<Integer, int[]> openCentres = new HashMap<>();
//
//    private HashMap<Integer, int[]> fullCentres = new HashMap<>();
//
//    private HashMap<Integer, int[]> traineesTraining = new HashMap<>();
//
//    private HashMap<Integer, int[]> traineesOnWaitingList = new HashMap<>();


    @Test
    @DisplayName("Test adding and retrieving from closed centres")
    public void testClosedCentres() {
        HashMap<Integer, int[]> test = new HashMap<>();
        int[] input = {1, 2, 3};
        test.put(1, input);
        FinalData.addToClosedCentres(test);
        HashMap<Integer, int[]> output = FinalData.getClosedCentres();
        int[] out = output.get(1);
        Assertions.assertEquals(input, out);
    }

//    @Test
//    @DisplayName("Test adding and retrieving from open centres")
//    public void testOpenCentres() {
//        HashMap<Integer, int[]> test = new HashMap<>();
//        int[] input = {1,2,3};
//        test.put(1, input);
//        FinalData.addToOpenCentres(test);
//        HashMap<Integer, int[]> output = FinalData.getOpenCentres();
//        int[] out = output.get(1);
//        Assertions.assertEquals(input, out);
//    }
//
//    @Test
//    @DisplayName("Test adding and retrieving from open centres")
//    public void testFullCentres() {
//        HashMap<Integer, int[]> test = new HashMap<>();
//        int[] input = {1,2,3};
//        test.put(1, input);
//        FinalData.addToFullCentres(test);
//        HashMap<Integer, int[]> output = FinalData.getFullCentres();
//        int[] out = output.get(1);
//        Assertions.assertEquals(input, out);
//    }

    @Test
    @DisplayName("Test adding and retrieving from open centres")
    public void testTraineesTraining() {
        HashMap<Integer, int[]> test = new HashMap<>();
        int[] input = {1, 2, 3};
        test.put(1, input);
        FinalData.addToTraineesTraining(test);
        HashMap<Integer, int[]> output = FinalData.getTraineesTraining();
        int[] out = output.get(1);
        Assertions.assertEquals(input, out);
    }

//    @Test
//    @DisplayName("Test adding and retrieving from open centres")
//    public void testTraineesOnWaitingList() {
//        HashMap<Integer, int[]> test = new HashMap<>();
//        int[] input = {1,2,3};
//        test.put(1, input);
//        FinalData.addToTraineesOnWaitingList(test);
//        HashMap<Integer, int[]> output = FinalData.getTraineesOnWaitingList();
//        int[] out = output.get(1);
//        Assertions.assertEquals(input, out);
//    }
}
