package com.sparta.SimulationProject.Model;

import com.sparta.SimulationProject.RandomGenerator;

public class Centre {

    final int MAX_CAPACITY = 100;
    int numberOfTraineesInCentre = 0;
    boolean full = false;

    public int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    };
    public int getNumberOfTraineesInCentre() {
        return numberOfTraineesInCentre;
    };
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
    public boolean lowCapacity() {
        if (numberOfTraineesInCentre < 10) {
            return true;
        } else {
            return false;
        }
    }


}
