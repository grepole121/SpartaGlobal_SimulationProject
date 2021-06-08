package com.sparta.SimulationProject;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TrainingCentreTest {
    TrainingCentre trainingCentre;

    @BeforeEach
    void setup() {
        trainingCentre = new TrainingCentre();
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

    @Test
    @DisplayName("Test should return the number of trainees after trainees have been added")
    public void shouldReturn15() {
        trainingCentre.addTrainees(15);
        Assertions.assertEquals(15, trainingCentre.getNumberOfTraineesInCentre());
    }

    @Test
    @DisplayName("Test should return false when the training centre is not full")
    public void shouldReturnFalse() {
        assertFalse(trainingCentre.isFull());
    }

    @Test
    @DisplayName("Test should return true when the training centre is full")
    public void shouldReturnTrue() {
        trainingCentre.addTrainees(100);
        assertTrue(trainingCentre.isFull());
    }
}
