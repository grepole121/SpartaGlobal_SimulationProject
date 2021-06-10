package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.Centre;

public class Bootcamp implements Centre {

    private int numberOfTraineesInCentre = 0;
    private final int MAX_CAPACITY = 500;
    private int counterLowCapacity = 0;
    private boolean full = false;

    public Bootcamp() {
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

    public boolean lowCapacity(){
        if(numberOfTraineesInCentre < 10 && counterLowCapacity == 3){
            return true;
        } else if (numberOfTraineesInCentre < 10) {
            counterLowCapacity++;
        } else {
            counterLowCapacity =0;
        }
        return false;
    }
}
