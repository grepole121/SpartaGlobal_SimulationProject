package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.Centre;
import com.sparta.SimulationProject.Model.Trainee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Simulation {
    private int numberOfTrainingCentres;
    private int numberOfTraineesTotal;
    private int numberOfTraineesCurrentlyTraining;
    private int numberOfTraineesOnWaitingList;
    private int numberOfFullTrainingCentres;
    private List<TrainingCentre> trainingCentreList = new ArrayList<>();
    private LinkedList<Trainee> waitingList = new LinkedList<>();

    public HashMap<Integer, int[]> runSimulation(int lengthOfTime) {
        HashMap<Integer, int[]> result = new HashMap<>();

//        First training centre created at month 1
//        Every month, a random number of trainees are generated wanting to be trained (20 -30)
//        Every 2 months, Sparta global opens a training centre. They open instantly and can take trainees every month

//        Ask if trainees created at month 0
//        numberOfTraineesOnWaitingList += RandomGenerator.newTrainees();

        for (int i = 1; i <= lengthOfTime; i++) {

            // wipes every iteration to start fresh
            int[] monthlyResult = new int[4];

            // numberOfTraineesOnWaitingList +=  RandomClass.newTrainees();
            int tempNewTrainees = RandomGenerator.newTrainees();
            //waitingList = GenerateTrainees(tempNewTrainees);
            numberOfTraineesTotal += tempNewTrainees;
            numberOfTraineesOnWaitingList += tempNewTrainees;

            if (i % 2 == 1) {
                numberOfTrainingCentres++;
                trainingCentreList.add(new TrainingCentre());
            }
            for (Centre trainingCentre : trainingCentreList) {
                if (!trainingCentre.isFull()) {
                    int newTraineeIntake = trainingCentre.newTraineeIntake();
                    int traineesInCentre = trainingCentre.getNumberOfTraineesInCentre();
                    int freeSpace = trainingCentre.getMAX_CAPACITY() - traineesInCentre;
                    if (freeSpace < newTraineeIntake) {
                        if (numberOfTraineesOnWaitingList <= freeSpace){
                            trainingCentre.addTrainees(numberOfTraineesOnWaitingList);
                            numberOfTraineesOnWaitingList = 0;
                        }else {
                            trainingCentre.addTrainees(freeSpace);
                            numberOfTraineesOnWaitingList -= freeSpace;
                            trainingCentre.setFull(true);
                            numberOfFullTrainingCentres++;
                        }

                    } else {
                        if (numberOfTraineesOnWaitingList <= newTraineeIntake){
                            trainingCentre.addTrainees(numberOfTraineesOnWaitingList);
                            numberOfTraineesOnWaitingList = 0;
                        }else {
                            trainingCentre.addTrainees(newTraineeIntake);
                            numberOfTraineesOnWaitingList -= newTraineeIntake;
                        }
                    }
                }
            }
            numberOfTraineesCurrentlyTraining = numberOfTraineesTotal - numberOfTraineesOnWaitingList;
            // results to be displayed are num open centers, num full centers, num trainees currently training, num trainees on waiting list
            monthlyResult[0] = numberOfTrainingCentres;
            monthlyResult[1] = numberOfFullTrainingCentres;
            monthlyResult[2] = numberOfTraineesCurrentlyTraining;
            monthlyResult[3] = numberOfTraineesOnWaitingList;


            result.put(i, monthlyResult);

        }

        return result;
    }


}
