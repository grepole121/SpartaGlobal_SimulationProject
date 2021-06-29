package com.sparta.SimulationProject.Model;

import java.util.Random;

public enum CentreType {
    TRAININGHUB, TECHCENTRE, BOOTCAMP;

    public static CentreType getRandomCentreType() {
        Random random = new Random();
        int centreType = random.nextInt(3);
        if (centreType == 2) {
            return BOOTCAMP;
        } else if (centreType == 1) {
            return TECHCENTRE;
        } else {
            return TRAININGHUB;
        }
    }
}