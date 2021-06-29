package com.sparta.SimulationProject.Model;

import com.sparta.SimulationProject.Util.RandomGenerator;

import java.util.ArrayList;
import java.util.List;

public class Bootcamp implements Centre {


    private int numberOfTraineesInCentre = 0;
    private final int MAX_CAPACITY = 500;
    private final CentreType centreType = CentreType.BOOTCAMP;
    private int counterLowCapacity = 0;
    private boolean full = false;
    private final List<Trainee> currentTrainees = new ArrayList<>();

    public Bootcamp() {
    }

    @Override
    public int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }

    @Override
    public int getNumberOfTraineesInCentre() {
        return currentTrainees.size();
    }

    @Override
    public int newTraineeIntake() {
        return RandomGenerator.randomTraineeIntake();
    }

    @Override
    public void addTrainees(Trainee traineesEnrolled) {
        currentTrainees.add(traineesEnrolled);
        numberOfTraineesInCentre++;
    }

    @Override
    public boolean isFull() {
        return full;
    }

    @Override
    public void setFull(boolean full) {
        this.full = full;
    }


    public boolean lowCapacity() {
        if (numberOfTraineesInCentre < 10 && counterLowCapacity == 2) {

            return true;
        } else if (numberOfTraineesInCentre < 10 && counterLowCapacity < 2) {
            counterLowCapacity++;
        } else if (numberOfTraineesInCentre >= 10) {
            counterLowCapacity =0;

        }
        return false;
    }

    @Override
    public CentreType getCentreType() {
        return this.centreType;
    }

    @Override
    public CourseType getCourseType() {
        return null;
    }

    @Override
    public List<Trainee> getTrainees() {
        return currentTrainees;
    }
}
