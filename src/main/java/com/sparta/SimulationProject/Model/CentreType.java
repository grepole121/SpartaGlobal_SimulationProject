package com.sparta.SimulationProject.Model;

import java.util.Random;

public enum CentreType {
    TRAININGHUB,TECHCENTRE,BOOTCAMP;

    public static String getRandomCentreType() {
        Random random = new Random();
        return (values()[random.nextInt(values().length)]).toString();
    }
}

