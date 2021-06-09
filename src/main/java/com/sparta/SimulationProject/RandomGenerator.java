package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.Centre;
import com.sparta.SimulationProject.Model.CentreType;
import com.sparta.SimulationProject.Model.GenerateTrainees;
import com.sparta.SimulationProject.Model.Trainee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {

    static int numberOfBootcamps = 0;
    static List<Centre> centres = new ArrayList<>();
    static int CentreNumber = 0;

    public static int randomTraineeIntake(){
        Random rand = new Random();
        return rand.nextInt(20);
    }

    public static List<Trainee> newTrainees(){
        Random rand = new Random();
        return GenerateTrainees.generateTrainees((rand.nextInt(10) + 20));
    }

    public static CentreType[] randomCentre() {
        CentreType type = CentreType.getRandomCentreType();
        if( type.equals(CentreType.TRAININGHUB)){
            centres.add(Centre CentreNumber = new trainingHub());
            CentreNumber++;
            centres.add(Centre CentreNumber = new trainingHub);
            CentreNumber++;
            centres.add(Centre CentreNumber = new trainingHub);
            CentreNumber++;
        }
        else if (type.equals(CentreType.TECHCENTRE)){
            centres.add(Centre CentreNumber = new techCentre);
        }
        else if (type.equals(CentreType.BOOTCAMP) && numberOfBootcamps < 2){
            centres.add(Centre CentreNumber = new bootCamp);
            CentreNumber++;
            numberOfBootcamps++;
        }
        else{
            randomCentre();
        }
    }
}


