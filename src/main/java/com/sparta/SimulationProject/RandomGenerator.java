package com.sparta.SimulationProject;

import java.util.Random;

public class RandomGenerator {

    public static int randomTraineeIntake(){
        Random rand = new Random();
        return rand.nextInt(20);
    }

    public static int newTrainees(){
        Random rand = new Random();
        return (rand.nextInt(10) + 20);
    }
}
