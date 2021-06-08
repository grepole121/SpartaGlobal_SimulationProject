package com.sparta.SimulationProject;

public class TrainingCentre {
    private final int MAX_CAPACITY = 100;
    private int numberOfTraineesInCentre;

    public trainingCentre() {
    }

    public int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }

    public int getNumberOfTraineesInCentre() {
        return numberOfTraineesInCentre;
    }

//    public int newTraineeIntake() {
//        return RandomClass.randomTraineeIntake();
//    }

    public void addTrainees(int traineesEnrolled) {
        numberOfTraineesInCentre += traineesEnrolled;
    }

    public boolean isFull(){
        return numberOfTraineesInCentre == MAX_CAPACITY;
    }
}
