package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.Bootcamp;
import com.sparta.SimulationProject.Model.CentreType;
import com.sparta.SimulationProject.Model.CourseType;
import com.sparta.SimulationProject.Model.Trainee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BootcampTest {
    Bootcamp bootCamp;

    @BeforeEach
    void setup() {
        bootCamp = new Bootcamp();
    }

    @Test
    @DisplayName("Test should return the max capacity of a training centre")
    public void shouldReturn100() {
        Assertions.assertEquals(500, bootCamp.getMAX_CAPACITY());
    }

    @Test
    @DisplayName("Test should return the default number of trainees (which is 0)")
    public void shouldReturn0() {
        Assertions.assertEquals(0, bootCamp.getNumberOfTraineesInCentre());
    }

    @Test
    @DisplayName("Test should return the number of trainees after trainees have been added")
    public void shouldReturn1() {
        Trainee trainee = new Trainee(1, CourseType.CSHARP);
        bootCamp.addTrainees(trainee);
        Assertions.assertEquals(1, bootCamp.getNumberOfTraineesInCentre());
    }

    @Test
    @DisplayName("Test should return false when the training centre is not full")
    public void shouldReturnFalse() {
        assertFalse(bootCamp.isFull());
    }

    @Test
    @DisplayName("Test should return true when the training centre is full")
    public void shouldReturnTrue() {
        bootCamp.setFull(true);
        assertTrue(bootCamp.isFull());

    }

    @Test
    @DisplayName("Test should return true when the bootcamp's number of trainees is less than 10 for 3 months")
    public void shouldReturnTrueAfterThreeMonths() {
        Trainee trainee = new Trainee(1, CourseType.CSHARP);
        bootCamp.addTrainees(trainee);
        bootCamp.lowCapacity();
        bootCamp.lowCapacity();
        assertTrue(bootCamp.lowCapacity());
    }

    @Test
    @DisplayName("Test should return false when the bootcamp's number of trainees is less than 10 but for less than 3 months")
    public void shouldReturnFalseBeforeThreeMonths() {
        Trainee trainee = new Trainee(1, CourseType.CSHARP);
        bootCamp.addTrainees(trainee);
        bootCamp.lowCapacity();
        assertFalse(bootCamp.lowCapacity());
    }

    @Test
    @DisplayName("Test should return false when the bootcamp's number of trainees is 10 or higher")
    public void shouldReturnFalseIfTraineesMoreThanTen() {
        for (int i = 0; i < 15; i++) {
            bootCamp.addTrainees(new Trainee(i, CourseType.getRandomCourseType()));
        }
        assertFalse(bootCamp.lowCapacity());
    }

    @Test
    @DisplayName("Test should return the correct centre type (bootcamp in this case)")
    public void shouldReturnCentreType() {
        Assertions.assertEquals(CentreType.BOOTCAMP, bootCamp.getCentreType());
    }

//    @Test
//    @DisplayName("Test should return the list of current trainees")
//    public void shouldReturnCurrentTrainees() {
//        Trainee trainee = new Trainee(1, CourseType.CSHARP);
//        bootCamp.addTrainees(trainee);
//        List<Trainee> trainees = new ArrayList<>();
//        trainees.add(trainee);
//        Assertions.assertEquals(trainees, bootCamp.getCurrentTrainees());
//    }
}
