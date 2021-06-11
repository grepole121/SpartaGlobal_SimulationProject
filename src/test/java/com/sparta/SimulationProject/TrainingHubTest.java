package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.CentreType;
import com.sparta.SimulationProject.Model.CourseType;
import com.sparta.SimulationProject.Model.Trainee;
import com.sparta.SimulationProject.Model.TrainingHub;
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

    @Test
    @DisplayName("Test should return the number of trainees after trainees have been added")
    public void shouldReturn1() {
        Trainee trainee = new Trainee(1, CourseType.CSHARP);
        trainingHub.addTrainees(trainee);
        Assertions.assertEquals(1, trainingHub.getNumberOfTraineesInCentre());
    }

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

    @Test
    @DisplayName("Test should return true when centre has less than 10 trainees")
    public void shouldReturnTrueIfTraineesLessThanTen() {
        assertTrue(trainingHub.lowCapacity());
    }

    @Test
    @DisplayName("Test should return false when centre has 10 or more trainees")
    public void shouldReturnFalseIfTraineesMoreThanTen() {
        for (int i = 0; i < 15; i++) {
            trainingHub.addTrainees(new Trainee(i, CourseType.getRandomCourseType()));
        }
        assertFalse(trainingHub.lowCapacity());
    }

    @Test
    @DisplayName("Test should return the correct centre type (Tech Centre in this case)")
    public void shouldReturnCentreType() {
        Assertions.assertEquals(CentreType.TRAININGHUB, trainingHub.getCentreType());
    }

//    @Test
//    @DisplayName("Test should return the list of current trainees")
//    public void shouldReturnCurrentTrainees() {
//        Trainee trainee = new Trainee(1, CourseType.CSHARP);
//        trainingHub.addTrainees(trainee);
//        List<Trainee> trainees = new ArrayList<>();
//        trainees.add(trainee);
//        Assertions.assertEquals(trainees, trainingHub.getCurrentTrainees());
//    }
}
