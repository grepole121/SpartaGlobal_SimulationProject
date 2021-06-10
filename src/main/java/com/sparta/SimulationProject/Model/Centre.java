package com.sparta.SimulationProject.Model;


import com.sparta.SimulationProject.RandomGenerator;

import java.util.List;

public interface Centre {

//    final int MAX_CAPACITY = 100;
//    int numberOfTraineesInCentre = 0;
//    boolean full = false;

    public int getMAX_CAPACITY();
    public int getNumberOfTraineesInCentre();
    public int newTraineeIntake();
    public void addTrainees(Trainee traineesEnrolled);
    public boolean isFull();
    public void setFull(boolean full);
    public boolean lowCapacity();
    public CentreType getCentreType();
    public CourseType getCourseType();
    public List<Trainee> getTrainees();
}
