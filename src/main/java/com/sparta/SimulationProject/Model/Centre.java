package com.sparta.SimulationProject.Model;


import com.sparta.SimulationProject.RandomGenerator;

import java.util.List;

public interface Centre {

//    final int MAX_CAPACITY = 100;
//    int numberOfTraineesInCentre = 0;
//    boolean full = false;

    int getMAX_CAPACITY();

    int getNumberOfTraineesInCentre();

    int newTraineeIntake();

    void addTrainees(Trainee traineesEnrolled);

    boolean isFull();

    void setFull(boolean full);

    boolean lowCapacity();

    CentreType getCentreType();

    CourseType getCourseType();

    List<Trainee> getTrainees();
}
