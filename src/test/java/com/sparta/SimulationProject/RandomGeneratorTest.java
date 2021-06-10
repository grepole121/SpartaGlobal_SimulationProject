//package com.sparta.SimulationProject;
//
//
//import com.sparta.SimulationProject.Model.Centre;
//import com.sparta.SimulationProject.Model.Trainee;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//
//public class RandomGeneratorTest {
//
//
//    @Test
//    @DisplayName("TestRandomTraineesWithinBounds")
//    public void TestRandomTraineesWithinBounds() {
//        boolean withinBounds = false;
//        List<Trainee> f = RandomGenerator.newTrainees();
//        if (f.size() >= 10 && f.size() <= 30) {
//            withinBounds = true;
//        }
//        Assertions.assertEquals(true, withinBounds);
//    }
//
//
//
//    @Test
//    @DisplayName("TestRandomTraineesOutsideBounds")
//    public void TestRandomTraineesOutsideBounds() {
//        boolean withinBounds = false;
//        List<Trainee> f = RandomGenerator.newTrainees();
//        if(f.size() <= 30 && f.size() >= 20){
//            withinBounds = true;
//        }
//        Assertions.assertEquals(true, withinBounds);
//    }
//
//    @Test
//    @DisplayName("Test that randomCntre returns not null")
//    public void TestRandomCentre() {
//        boolean returningCentre = false;
//        List<Centre> centre = RandomGenerator.randomCentre();
//        for (Centre i : centre) {
//            if (i != null) {
//                returningCentre = true;
//            } else {
//                returningCentre = false;
//                break;
//            }
//        }
//        Assertions.assertEquals(true, returningCentre);
//    }
//
//
//
//
//    @Test
//    @DisplayName("TestRandomIntakeWithinBounds")
//    public void TestRandomIntakeWithinBounds() {
//        boolean withinBounds = true;
//        for (int i = 0; i < 30; i++) {
//            int f = RandomGenerator.randomTraineeIntake();
//            if (f > 20 || f < 0) {
//                withinBounds = false;
//            }
//        }
//        Assertions.assertEquals(true, withinBounds);
//    }
//
//
//    @Test
//    @DisplayName("TestRandomIntakeOutsideBounds")
//    public void TestRandomIntakeOutsideBounds() {
//        boolean withinBounds = false;
//        for (int i = 0; i < 30; i++) {
//            int f = RandomGenerator.randomTraineeIntake();
//            if (f <= 20 && f >= 0) {
//                withinBounds = true;
//            }
//        }
//        Assertions.assertEquals(true, withinBounds);
//    }
//}