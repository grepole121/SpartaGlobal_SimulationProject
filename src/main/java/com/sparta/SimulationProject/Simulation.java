package com.sparta.SimulationProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Simulation {
    private int numberOfTrainingCentres; // not neccesarry unless other code accesses it.
    private int numberOfTraineesTotal;
    private int numberOfTraineesCurrentlyTraining;
    private int numberOfTraineesOnWaitingList;
    private int numberOfFullTrainingcentres;
    private List<TrainingCentre> trainingCentreList = new ArrayList<>();//can use list.size() for number of open centres
    private final int maxCapacity = 100;

    public HashMap<Integer, int[]> runSimulation(int lengthOfTime) {
        HashMap<Integer, int[]> result = new HashMap<>();

//        First training centre created at month 1
//        Every month, a random number of trainees are generated wanting to be trained (20 -30)
//        Every 2 months, Sparta global opens a training centre. They open instantly and can take trainees every month

//        Ask if trainees created at month 0
        numberOfTraineesOnWaitingList += RandomClass.newTrainees();

        for (int i = 1; i < lengthOfTime; i++) {

            // wipes every iteration to start fresh
            int[] monthlyResult = new int[];

            // numberOfTraineesOnWaitingList +=  RandomClass.newTrainees();
            int tempNewTrainees = RandomClass.newTrainees();
            numberOfTraineesTotal += tempNewTrainees;
            numberOfTraineesOnWaitingList += tempNewTrainees;

            if (i % 2 == 1) {
                numberOfTrainingCentres++;
                trainingCentreList.add(new TrainingCentre());
            }
            for (TrainingCentre trainingCentre : trainingCentreList) {
                if (!trainingCentre.isFull()) {
                    int newTraineeIntake = trainingCentre.newTraineeIntake();
                    int traineesInCentre = trainingCentre.getTrainees();
                    int freeSpace = maxCapacity - traineesInCentre;
                    if (freeSpace < newTraineeIntake) {
                        trainingCentre.addTrainees(freeSpace);
                        numberOfTraineesOnWaitingList -= freeSpace;
                        //method name needs replaceing to correct method name
                        trainingCentre.setIsFull(true);
                        numberOfFullTrainingcentres++;

                    } else {
                        trainingCentre.addTrainees(newTraineeIntake);
                        numberOfTraineesOnWaitingList -= newTraineeIntake;
                    }
                }
            }
            numberOfTraineesCurrentlyTraining = numberOfTraineesTotal - numberOfTraineesOnWaitingList;
            // results to be displayed are num open centers, num full centers, num trainees currently training, num trainees on waiting list
            monthlyResult[0] = numberOfTrainingCentres;
            monthlyResult[1] = numberOfFullTrainingcentres;
            monthlyResult[2] = numberOfTraineesCurrentlyTraining;
            monthlyResult[3] = numberOfTraineesOnWaitingList;


            result.put(i, monthlyResult)

        }

        return result;
    }


}
