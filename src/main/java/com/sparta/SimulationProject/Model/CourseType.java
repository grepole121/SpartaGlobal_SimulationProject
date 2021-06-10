package com.sparta.SimulationProject.Model;

import java.util.Random;

public enum CourseType {
    JAVA, CSHARP, DEVOPS, DATA, BUSINESS;

    public static CourseType getRandomCourseType() {
        Random random = new Random();
        int x = random.nextInt(5);
        switch (x) {

            case 0:
                return JAVA;

            case 1:
                return CSHARP;

            case 2:
                return DEVOPS;

            case 3:
                return DATA;

            case 4:
                return BUSINESS;

        }
        return null;
    }


}


