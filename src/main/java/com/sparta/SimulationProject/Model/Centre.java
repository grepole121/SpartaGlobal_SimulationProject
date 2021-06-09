package com.sparta.SimulationProject.Model;

public interface Centre {

    public int getMAX_CAPACITY();
    public int getNumberOfTraineesInCentre();
    public int newTraineeIntake();
    public void addTrainees(Trainee traineesEnrolled);
    public boolean isFull();
    public void setFull(boolean full);
    public Centre getCentreType();

}
