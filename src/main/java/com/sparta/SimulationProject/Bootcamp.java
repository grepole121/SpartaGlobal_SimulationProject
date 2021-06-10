package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.Centre;
import com.sparta.SimulationProject.Model.CentreType;
import com.sparta.SimulationProject.Model.CourseType;
import com.sparta.SimulationProject.Model.Trainee;

import java.util.ArrayList;
import java.util.List;

public class Bootcamp implements Centre {

    private int numberOfTraineesInCentre;
    private final int MAX_CAPACITY = 500;
    private final CentreType centreType = CentreType.BOOTCAMP;
    private int counterLowCapacity = 0;
    private boolean full = false;
    private List<Trainee> currentTrainees = new ArrayList<>();
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

    public boolean lowCapacity(){
        if(numberOfTraineesInCentre < 10 && counterLowCapacity == 2){
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
<<<<<<< HEAD
    public List<Trainee> getCurrentTrainees() {
=======
    public CourseType getCourseType() {
        return null;
    }

    @Override
    public List<Trainee> getTrainees() {
>>>>>>> origin/dev-tom-update
        return currentTrainees;
    }
}
