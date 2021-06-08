package com.sparta.SimulationProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Simulation {
    private int numberOfTrainingCentres;
    private int numberOfTrainees;
    private int numberOfTraineesOnWaitingList;
    private List<TrainingCentre> trainingCentreList = new ArrayList<>();
    private final int maxCapacity = 100;

    public HashMap<Integer, int[]> runSimulation(int lengthOfTime){
        HashMap<Integer, int[]> result = new HashMap<>();

//        First training centre created at month 1
//        Every month, a random number of trainees are generated wanting to be trained (20 -30)
//        Every 2 months, Sparta global opens a training centre. They open instantly and can take trainees every month

//        Ask if trainees created at month 0
        numberOfTraineesOnWaitingList += RandomClass.newTrainees();

        for (int i = 1; i < lengthOfTime; i++) {
            numberOfTraineesOnWaitingList += RandomClass.newTrainees();
            if (i % 2 == 1){
                numberOfTrainingCentres++;
                trainingCentreList.add(new TrainingCentre());
            }
            for (TrainingCentre trainingCentre: trainingCentreList){
                if (!trainingCentre.isFull()){
                    int newTraineeIntake = trainingCentre.newTraineeIntake();
                    int traineesInCentre = trainingCentre.getTrainees();
                    int freeSpace = maxCapacity - traineesInCentre;
                    if (freeSpace < newTraineeIntake){
                        trainingCentre.addTrainees(freeSpace);
                        numberOfTraineesOnWaitingList -= freeSpace;
                    }else{
                        trainingCentre.addTrainees(newTraineeIntake);
                        numberOfTraineesOnWaitingList -= newTraineeIntake;
                    }
                }
            }
        }

        return result;
    }
}
