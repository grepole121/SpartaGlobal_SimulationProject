package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.Centre;

public class TrainingCentre extends Centre {
    private final int MAX_CAPACITY = 100;
    private int numberOfTraineesInCentre;


    private boolean full = false;

    public TrainingCentre() {
    }

    @Override
    public int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }
    @Override
    public int getNumberOfTraineesInCentre() {
        return numberOfTraineesInCentre;
    }
    @Override
    public int newTraineeIntake() {
        return RandomGenerator.randomTraineeIntake();
    }
    @Override
    public void addTrainees(int traineesEnrolled) {
        numberOfTraineesInCentre += traineesEnrolled;
    }
    @Override
    public boolean isFull() {
        return full;
    }
    @Override
    public void setFull(boolean full) {
        this.full = full;
    }
}
