package com.sparta.SimulationProject.Model;

import com.sparta.SimulationProject.RandomGenerator;

import java.util.ArrayList;
import java.util.List;

public class GenerateTrainees {
    private static int traineeID;

    public static List<Trainee> generateTrainees(int newTraineeCount) {
        List<Trainee> trainees = new ArrayList<>();
        for (int i = 0; i < newTraineeCount; i++) {
            trainees.add(new Trainee(traineeID++, CourseType.getRandomCourseType()));
        }
        return trainees;
    }
}
