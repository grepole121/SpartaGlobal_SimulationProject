package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.Centre;
import com.sparta.SimulationProject.Model.CourseType;

public class TechCentre implements Centre {

    private int numberOfTraineesInCentre;
    private final int MAX_CAPACITY = 200;
    private final CourseType courseType;
    private boolean full = false;

    public TechCentre (CourseType courseType) {
        this.numberOfTraineesInCentre = 0;
        this.courseType = courseType;
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

    @Override
    public boolean lowCapacity() {
        return numberOfTraineesInCentre < 10;
    }

}
