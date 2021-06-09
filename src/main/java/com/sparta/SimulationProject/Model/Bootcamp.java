package com.sparta.SimulationProject.Model;

public class Bootcamp extends Centre{

    private int numberOfTraineesInCentre = 0;
    private final int MAX_CAPACITY = 200;
    private int counterLowCapacity = 0;

    public Bootcamp() {
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
