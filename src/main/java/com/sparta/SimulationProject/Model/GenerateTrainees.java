package com.sparta.SimulationProject.Model;

import java.util.ArrayList;
import java.util.List;

public class GenerateTrainees {
    private static int traineeID;


    public static List<Trainee> generateTrainees(int newTraineeCount){
        List<Trainee> trainees = new ArrayList<>();
        trainees.add(new Trainee(traineeID++, CourseType.CSharp));
        return trainees;
    }
}
