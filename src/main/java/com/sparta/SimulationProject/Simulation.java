package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.*;

import java.util.*;

public class Simulation {
    private int numberOfTrainingCentres;
    private int numberOfTraineesTotal;
    private int numberOfTraineesCurrentlyTraining;
    //   private int numberOfTraineesOnWaitingList;
    private int numberOfFullTrainingCentres;
    int i;
    private List<Centre> trainingCentreList = new ArrayList<>();
    private LinkedList<Trainee> waitingList = new LinkedList<>();
    private int[] traineesTraining = new int[5];
    // private int[] totalCentreTypes = new int[3];
    private int[] totalCentresOpen = new int[3];
    private int[] totalCentresClosed = new int[3];


    public HashMap<Integer, int[]> runSimulation(int lengthOfTime) {
        HashMap<Integer, int[]> result = new HashMap<>();

//        First training centre created at month 1
//        Every month, a random number of trainees are generated wanting to be trained (20 -30)
//        Every 2 months, Sparta global opens a training centre. They open instantly and can take trainees every month

//        Ask if trainees created at month 0
//        numberOfTraineesOnWaitingList += RandomGenerator.newTrainees();

        for (int month = 1; month <= lengthOfTime; month++) {
            List<Trainee> tempTrainees = RandomGenerator.newTrainees();
            waitingList.addAll(tempTrainees);
            // tracks number of trainees by each stream
            for (Trainee trainee : tempTrainees) {
                switch (trainee.getCourseType()) {
                    case DATA:
                        traineesTraining[CourseType.DATA.ordinal()]++;
                        break;
                    case JAVA:
                        traineesTraining[CourseType.JAVA.ordinal()]++;
                        break;
                    case CSHARP:
                        traineesTraining[CourseType.CSHARP.ordinal()]++;
                        break;
                    case DEVOPS:
                        traineesTraining[CourseType.DEVOPS.ordinal()]++;
                        break;
                    case BUSINESS:
                        traineesTraining[CourseType.BUSINESS.ordinal()]++;
                        break;

                }
            }


            // wipes every iteration to start fresh
            int[] monthlyResult = new int[4];

            // numberOfTraineesOnWaitingList +=  RandomClass.newTrainees();
//            int tempNewTrainees = RandomGenerator.newTrainees();
            //waitingList = GenerateTrainees(tempNewTrainees);
            numberOfTraineesTotal += tempNewTrainees;
            numberOfTraineesOnWaitingList += tempNewTrainees;

            if (i % 2 == 1) {
                // need method for generating a random centre
                List<Centre> tempCentre = new Centre();
                switch (tempCentre.get(0).getCentreType()) {
                    case CentreType.TRAININGHUB:
                        totalCentresOpen[CentreType.TRAININGHUB.ordinal()] += 3;
                        break;
                    case CentreType.TECHCENTRE:
                        totalCentresOpen[CentreType.TECHCENTRE.ordinal()]++;
                        break;
                    case CentreType.BOOTCAMP:
                        totalCentresOpen[CentreType.BOOTCAMP.ordinal()]++;
                        break;
                }

                trainingCentreList.addAll(tempCentre);
            }
            Collections.shuffle(trainingCentreList);
            for (Centre trainingCentre : trainingCentreList) {
                if (!trainingCentre.isFull()) {
                    int newTraineeIntake = trainingCentre.newTraineeIntake();
                    int traineesInCentre = trainingCentre.getNumberOfTraineesInCentre();
                    int freeSpace = trainingCentre.getMAX_CAPACITY() - traineesInCentre;
                    if (!trainingCentre.getCentreType().equals(CentreType.TECHCENTRE)) {
                        if (freeSpace < newTraineeIntake) {
                            if (waitingList.size() < freeSpace) {
                                int tempWaitingListSize = waitingList.size();
                                for ( i = 0; i < tempWaitingListSize; i++) {
                                    trainingCentre.addTrainees(waitingList.pollFirst());
                                }
                            } else {
                                for (i = 0; i < freeSpace; i++) {
                                    trainingCentre.addTrainees(waitingList.pollFirst());
                                }
                                trainingCentre.setFull(true);
                            }

                        } else {
                            if (waitingList.size() < newTraineeIntake) {
                                int tempWaitingListSize = waitingList.size();
                                for (i = 0; i < tempWaitingListSize; i++) {
                                    trainingCentre.addTrainees(waitingList.pollFirst());
                                }
                            } else {
                                for (i = 0; i < newTraineeIntake; i++) {
                                    trainingCentre.addTrainees(waitingList.pollFirst());
                                }
                            }
                        }
                    }/*end of techcentre if*/ else {

                        if (freeSpace < newTraineeIntake) {
                            if (waitingList.size() < freeSpace){
                                for (i = 0; i < waitingList.size(); i++) {
                                    if (waitingList.get(i).getCourseType().equals(trainingCentre.getCentreType())) {
                                        trainingCentre.addTrainees(waitingList.get(i));
                                        waitingList.remove(i--);
                                    }
                                }

                            } else {
                                for (i = 0; i < freeSpace; i++) {
                                    for (int secondCounter = 0; secondCounter < waitingList.size(); secondCounter++) {
                                        if (waitingList.get(secondCounter).getCourseType().equals(trainingCentre.getCentreType())) {
                                            trainingCentre.addTrainees(waitingList.get(secondCounter));
                                            waitingList.remove(secondCounter);
                                            break;
                                        }
                                    }
                                }
                                trainingCentre.setFull(true);
                            }

                        } else {
                            if (waitingList.size() < newTraineeIntake) {
                                int tempWaitingListSize = waitingList.size();
                                for (i = 0; i < tempWaitingListSize; i++) {
                                    if (waitingList.get(i).getCourseType().equals(trainingCentre.getCentreType())) {
                                        trainingCentre.addTrainees(waitingList.get(i));
                                        waitingList.remove(i--);
                                    }
                                }
                            } else {
                                for (i = 0; i < newTraineeIntake; i++) {
                                    for (int secondCounter = 0; secondCounter < waitingList.size(); secondCounter++) {
                                        if (waitingList.get(secondCounter).getCourseType().equals(trainingCentre.getCentreType())) {
                                            trainingCentre.addTrainees(waitingList.get(secondCounter));
                                            waitingList.remove(secondCounter);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                //check for closeures

            }//for loop ends
            for (i = 0; i < trainingCentreList.size(); i++) {
                if (trainingCentreList.get(i).lowCapacity()) {
                    switch (trainingCentreList.getCentreType()) {
                        case CentreType.TRAININGHUB:
                            totalCentresClosed[CentreType.TRAININGHUB.ordinal()]++;
                            totalCentresOpen[CentreType.TRAININGHUB.ordinal()]--;
                            break;
                        case CentreType.TECHCENTRE:
                            totalCentresClosed[CentreType.TECHCENTRE.ordinal()]++;
                            totalCentresOpen[CentreType.TECHCENTRE.ordinal()]--;
                            break;
                        case CentreType.BOOTCAMP:
                            totalCentresClosed[CentreType.BOOTCAMP.ordinal()]++;
                            totalCentresOpen[CentreType.TECHCENTRE.ordinal()]--;
                            break;
                    }
                }
            }
            FinalDate.addOpenCentres(new HashMap<Integer, int[] >(month, totalCentresOpen))

            //end of Monthly for loop
        }
        //send data to finalData

        // results to be displayed are num open centers, num full centers, num trainees currently training, num trainees on waiting list

        monthlyResult[0] = numberOfTrainingCentres;

        monthlyResult[1] = numberOfFullTrainingCentres;
        monthlyResult[2] = numberOfTraineesCurrentlyTraining;
        monthlyResult[3] = numberOfTraineesOnWaitingList;


        result.put(i, monthlyResult);
//month ends
    }

        return result;
}


}
