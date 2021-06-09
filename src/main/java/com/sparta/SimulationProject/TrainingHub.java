package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.Centre;
import com.sparta.SimulationProject.Model.CentreType;
import com.sparta.SimulationProject.Model.Trainee;

import java.util.ArrayList;
import java.util.List;

public class TrainingHub implements Centre {

    private int numberOfTraineesInCentre;
    private final int MAX_CAPACITY = 100;
    private final CentreType centreType = CentreType.TRAININGHUB;
    private boolean full = false;
    private List<Trainee> currentTrainees = new ArrayList<>();

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

    @Override
    public CentreType getCentreType() {
        return centreType;
    }
}
