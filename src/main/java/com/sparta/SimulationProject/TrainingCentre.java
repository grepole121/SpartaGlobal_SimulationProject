package com.sparta.SimulationProject;

public class TrainingCentre {
    private final int MAX_CAPACITY = 100;
    private int numberOfTraineesInCentre;


    private boolean full = false;

    public TrainingCentre() {
    }

    public int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }

    public int getNumberOfTraineesInCentre() {
        return numberOfTraineesInCentre;
    }

    public int newTraineeIntake() {
        return RandomGenerator.randomTraineeIntake();
    }

    public void addTrainees(int traineesEnrolled) {
        numberOfTraineesInCentre += traineesEnrolled;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }
}
