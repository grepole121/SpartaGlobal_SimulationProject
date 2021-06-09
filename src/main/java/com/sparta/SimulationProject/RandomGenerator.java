package com.sparta.SimulationProject;


import com.sparta.SimulationProject.Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {

    static int numberOfBootcamps = 0;



    public static int randomTraineeIntake(){
        Random rand = new Random();
        return rand.nextInt(20);
    }

    public static List<Trainee> newTrainees(){
        Random rand = new Random();
        return GenerateTrainees.generateTrainees((rand.nextInt(10) + 20));
    }

    public static List<Centre> randomCentre() {
        List<Centre> centres = new ArrayList<>();
        CentreType type = CentreType.getRandomCentreType();
        if( type.equals(CentreType.TRAININGHUB)){
            centres.add( new TrainingHub());
            centres.add( new TrainingHub());
            centres.add( new TrainingHub());
        }
        else if (type.equals(CentreType.TECHCENTRE)){
            centres.add( new TechCentre(CourseType.getRandomCourseType()));
        }
        else if (type.equals(CentreType.BOOTCAMP) && numberOfBootcamps < 2){
            centres.add(new Bootcamp());
            numberOfBootcamps++;
        }
        else{
            return randomCentre();
        }
        return centres;
    }
}


