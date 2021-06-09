package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.CourseType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TechCentreTest {
    TechCentre techCentre;

    @BeforeEach
    void setup() {
        techCentre = new TechCentre(CourseType.CSharp);
    }

    @Test
    @DisplayName("Test should return the max capacity of a training centre")
    public void shouldReturn100() {
        Assertions.assertEquals(100, techCentre.getMAX_CAPACITY());
    }

    @Test
    @DisplayName("Test should return the default number of trainees (which is 0)")
    public void shouldReturn0() {
        Assertions.assertEquals(0, techCentre.getNumberOfTraineesInCentre());
    }

    @Test
    @DisplayName("Test should return the number of trainees after trainees have been added")
    public void shouldReturn15() {
        techCentre.addTrainees(15);
        Assertions.assertEquals(15, techCentre.getNumberOfTraineesInCentre());
    }

    @Test
    @DisplayName("Test should return false when the training centre is not full")
    public void shouldReturnFalse() {
        assertFalse(techCentre.isFull());
    }

    @Test
    @DisplayName("Test should return true when the training centre is full")
    public void shouldReturnTrue() {
        techCentre.setFull(true);
        assertTrue(techCentre.isFull());

    }
}