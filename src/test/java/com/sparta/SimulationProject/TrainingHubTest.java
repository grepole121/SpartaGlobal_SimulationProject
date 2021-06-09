package com.sparta.SimulationProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainingHubTest {
    TrainingHub trainingHub;

    @BeforeEach
    void setup() {
        trainingHub = new TrainingHub();
    }

    @Test
    @DisplayName("Test should return the max capacity of a training centre")
    public void shouldReturn100() {
        Assertions.assertEquals(100, trainingHub.getMAX_CAPACITY());
    }

    @Test
    @DisplayName("Test should return the default number of trainees (which is 0)")
    public void shouldReturn0() {
        Assertions.assertEquals(0, trainingHub.getNumberOfTraineesInCentre());
    }

//    @Test
//    @DisplayName("Test should return the number of trainees after trainees have been added")
//    public void shouldReturn15() {
//        trainingHub.addTrainees(15);
//        Assertions.assertEquals(15, trainingHub.getNumberOfTraineesInCentre());
//    }

    @Test
    @DisplayName("Test should return false when the training centre is not full")
    public void shouldReturnFalse() {
        assertFalse(trainingHub.isFull());
    }

    @Test
    @DisplayName("Test should return true when the training centre is full")
    public void shouldReturnTrue() {
        trainingHub.setFull(true);
        assertTrue(trainingHub.isFull());

    }
}
