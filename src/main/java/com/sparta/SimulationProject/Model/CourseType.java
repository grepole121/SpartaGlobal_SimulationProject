package com.sparta.SimulationProject.Model;

import java.util.Random;

public enum CourseType {
    JAVA,CSHARP,DEVOPS,DATA,BUSINESS;

    public static String getRandomCourseType() {
        Random random = new Random();
        return (values()[random.nextInt(values().length)]).toString();
    }


}


