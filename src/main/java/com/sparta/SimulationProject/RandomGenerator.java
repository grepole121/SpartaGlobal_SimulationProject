package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.Trainee;

import java.util.List;
import java.util.Random;

public class RandomGenerator {

    public static int randomTraineeIntake(){
        Random rand = new Random();
        return rand.nextInt(20);
    }

    public static List<Trainee> newTrainees(){
        Random rand = new Random();
        return new List<Trainee>();
    }
}
