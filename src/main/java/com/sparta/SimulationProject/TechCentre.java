package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.Centre;
import com.sparta.SimulationProject.Model.CentreType;
import com.sparta.SimulationProject.Model.CourseType;
import com.sparta.SimulationProject.Model.Trainee;

import java.util.ArrayList;
import java.util.List;

public class TechCentre implements Centre {

    private int numberOfTraineesInCentre;
    private final int MAX_CAPACITY = 200;
    private final CentreType centreType = CentreType.TECHCENTRE;
    private final CourseType courseType;
    private boolean full = false;
    private List<Trainee> currentTrainees = new ArrayList<>();



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

    @Override
    public boolean lowCapacity() {
        return currentTrainees.size() < 10;
    }

    @Override
    public CentreType getCentreType() {
        return this.centreType;
    }

    public CourseType getCourseType() {
        return this.courseType;
    }


    @Override
    public List<Trainee> getTrainees() {
        return currentTrainees;
    }
}
