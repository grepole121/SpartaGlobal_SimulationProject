package com.sparta.SimulationProject;


import com.sparta.SimulationProject.Model.Centre;
import com.sparta.SimulationProject.Model.TrainingHub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TrainingCentreTest {
    Centre trainingCentre;

    @BeforeEach
    void setup() {
        trainingCentre = new TrainingHub();
    }

    @Test
    @DisplayName("Test should return the max capacity of a training centre")
    public void shouldReturn100() {
        Assertions.assertEquals(100, trainingCentre.getMAX_CAPACITY());
    }

    @Test
    @DisplayName("Test should return the default number of trainees (which is 0)")
    public void shouldReturn0() {
        Assertions.assertEquals(0, trainingCentre.getNumberOfTraineesInCentre());
    }

//    @Test
//    @DisplayName("Test should return the number of trainees after trainees have been added")
//    public void shouldReturn15() {
//        trainingCentre.addTrainees(15);
//        Assertions.assertEquals(15, trainingCentre.getNumberOfTraineesInCentre());
//    }

    @Test
    @DisplayName("Test should return false when the training centre is not full")
    public void shouldReturnFalse() {
        assertFalse(trainingCentre.isFull());
    }

    @Test
    @DisplayName("Test should return true when the training centre is full")
    public void shouldReturnTrue() {
        trainingCentre.setFull(true);
        assertTrue(trainingCentre.isFull());
    }

    @Test
    @DisplayName("Test new trainee intake within bounds")
    public void TestRandomIntakeWithinBounds() {
        boolean withinBounds = true;
        for (int i = 0; i < 30; i++) {
            int f = trainingCentre.newTraineeIntake();
            if (f > 20 || f < 0) {
                withinBounds = false;
            }
        }
        Assertions.assertEquals(true, withinBounds);
    }


    @Test
    @DisplayName("Test new trainee intake outside bounds")
    public void TestRandomIntakeOutsideBounds() {
        boolean withinBounds = false;
        for (int i = 0; i < 30; i++) {
            int f = trainingCentre.newTraineeIntake();
            if (f <= 20 && f >= 0) {
                withinBounds = true;
            }
        }
        Assertions.assertEquals(true, withinBounds);
    }
}
