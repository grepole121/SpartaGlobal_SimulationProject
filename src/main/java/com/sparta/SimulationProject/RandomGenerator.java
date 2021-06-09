package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.CentreType;
import com.sparta.SimulationProject.Model.GenerateTrainees;
import com.sparta.SimulationProject.Model.Trainee;

import java.util.List;
import java.util.Random;

public class RandomGenerator {

    public static int randomTraineeIntake(){
        Random rand = new Random();
        return rand.nextInt(20);
    }

    public static List<Trainee> newTrainees() {
        Random rand = new Random();
        return GenerateTrainees.generateTrainees((rand.nextInt(10) + 20));

    }

    public static String randomCentre() {
        return CentreType.getRandomCentreType();
    }
}


