package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.CentreType;
import com.sparta.SimulationProject.Model.CourseType;
import com.sparta.SimulationProject.Model.Trainee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TechCentreTest {
    TechCentre techCentre;

    @BeforeEach
    void setup() {
        techCentre = new TechCentre(CourseType.CSHARP);
    }

    @Test
    @DisplayName("Test should return the max capacity of a training centre")
    public void shouldReturn100() {
        Assertions.assertEquals(200, techCentre.getMAX_CAPACITY());
    }

    @Test
    @DisplayName("Test should return the default number of trainees (which is 0)")
    public void shouldReturn0() {
        Assertions.assertEquals(0, techCentre.getNumberOfTraineesInCentre());
    }

    @Test
    @DisplayName("Test should return the number of trainees after trainees have been added")
    public void shouldReturn1() {
        Trainee trainee = new Trainee(1, CourseType.CSHARP);
        techCentre.addTrainees(trainee);
        Assertions.assertEquals(1, techCentre.getNumberOfTraineesInCentre());
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

    @Test
    @DisplayName("Test should return true when centre has less than 10 trainees")
    public void shouldReturnTrueIfTraineesLessThanTen() {
        assertTrue(techCentre.lowCapacity());
    }

    @Test
    @DisplayName("Test should return false when centre has 10 or more trainees")
    public void shouldReturnFalseIfTraineesMoreThanTen() {
        for (int i = 0; i < 15; i++) {
            techCentre.addTrainees(new Trainee(i, CourseType.getRandomCourseType()));
        }
        assertFalse(techCentre.lowCapacity());
    }

    @Test
    @DisplayName("Test should return the correct centre type (Tech Centre in this case)")
    public void shouldReturnCentreType() {
        Assertions.assertEquals(CentreType.TECHCENTRE, techCentre.getCentreType());
    }

    @Test
    @DisplayName("Test should return the course type taught at this centre")
    public void shouldReturnCourseType() {
        Assertions.assertEquals(CourseType.CSHARP, techCentre.getCourseType());
    }

//    @Test
//    @DisplayName("Test should return the list of current trainees")
//    public void shouldReturnCurrentTrainees() {
//        Trainee trainee = new Trainee(1, CourseType.CSHARP);
//        techCentre.addTrainees(trainee);
//        List<Trainee> trainees = new ArrayList<>();
//        trainees.add(trainee);
//        Assertions.assertEquals(trainees, techCentre.getCurrentTrainees());
//    }
}