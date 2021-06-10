package com.sparta.SimulationProject;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class RandomGeneratorTest {

//    @Test
//    @DisplayName("TestRandomTraineesWithinBounds")
//    public void TestRandomTraineesWithinBounds() {
//        boolean withinBounds = true;
//        for(int i = 0 ; i < 30;i++){
//        int f = RandomGenerator.newTrainees();
//        if(f > 30 || f < 20){
//            withinBounds = false;
//       }
//    }
    //       Assertions.assertEquals(true, withinBounds);}


//    @Test
//    @DisplayName("TestRandomTraineesOutsideBounds")
//    public void TestRandomTraineesOutsideBounds() {
//        boolean withinBounds = false;
//        for(int i = 0 ; i < 30;i++){
//            int f = RandomGenerator.newTrainees();
//            if(f <= 30 && f >= 20){
//                withinBounds = true;
//            }
//        }
//        Assertions.assertEquals(true, withinBounds);}


    @Test
    @DisplayName("TestRandomIntakeWithinBounds")
    public void TestRandomIntakeWithinBounds() {
        boolean withinBounds = true;
        for (int i = 0; i < 30; i++) {
            int f = RandomGenerator.randomTraineeIntake();
            if (f > 20 || f < 0) {
                withinBounds = false;
            }
        }
        Assertions.assertEquals(true, withinBounds);
    }


    @Test
    @DisplayName("TestRandomIntakeOutsideBounds")
    public void TestRandomIntakeOutsideBounds() {
        boolean withinBounds = false;
        for (int i = 0; i < 30; i++) {
            int f = RandomGenerator.randomTraineeIntake();
            if (f <= 20 && f >= 0) {
                withinBounds = true;
            }
        }
        Assertions.assertEquals(true, withinBounds);
    }
}