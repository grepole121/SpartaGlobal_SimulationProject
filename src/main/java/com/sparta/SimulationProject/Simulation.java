package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Model.*;

import java.util.*;

public class Simulation {

    int i;
    private List<Centre> trainingCentreList = new ArrayList<>();
    private LinkedList<Trainee> waitingList = new LinkedList<>();
    int[] traineesTraining = new int[5];


    int[] totalCentresFull = new int[3];
    int[] totalCentresOpen = new int[3];
    int[] totalCentresClosed = new int[3];


    public void runSimulation(int lengthOfTime) {

        for (int month = 1; month <= lengthOfTime; month++) {
            List<Trainee> tempTrainees = RandomGenerator.newTrainees();
            waitingList.addAll(tempTrainees);
            // tracks number of trainees by each stream
            for (Trainee trainee : tempTrainees) {
                traineesTraining[trainee.getCourseType().ordinal()]++;
            }

            int[] totalCentresOpenT;
            int[] totalCentresClosedT;
            int[] totalCentresFullT;
            totalCentresOpenT = Arrays.copyOf(totalCentresOpen, 3);
            totalCentresClosedT = Arrays.copyOf(totalCentresClosed, 3);
            totalCentresFullT = Arrays.copyOf(totalCentresFull, 3);
            if (month % 2 == 1) {
                // need method for generating a random centre
                List<Centre> tempCentre = RandomGenerator.randomCentre();
                for(Centre centre : tempCentre){
                    totalCentresOpenT[centre.getCentreType().ordinal()]++;
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
                                for (i = 0; i < tempWaitingListSize; i++) {
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
                            if (waitingList.size() < freeSpace) {
                                for (i = 0; i < waitingList.size(); i++) {
                                    if (waitingList.get(i).getCourseType().equals(trainingCentre.getCourseType())) {
                                        trainingCentre.addTrainees(waitingList.get(i));
                                        waitingList.remove(i--);
                                    }
                                }

                            } else {
                                for (i = 0; i < freeSpace; i++) {
                                    for (int secondCounter = 0; secondCounter < waitingList.size(); secondCounter++) {
                                        if (waitingList.get(secondCounter).getCourseType().equals(trainingCentre.getCourseType())) {
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
                                for (i = 0; i < waitingList.size(); i++) {
                                    if (waitingList.get(i).getCourseType().equals(trainingCentre.getCourseType())) {
                                        trainingCentre.addTrainees(waitingList.get(i));
                                        waitingList.remove(i--);
                                    }
                                }
                            } else {
                                for (i = 0; i < newTraineeIntake; i++) {
                                    for (int secondCounter = 0; secondCounter < waitingList.size(); secondCounter++) {
                                        if (waitingList.get(secondCounter).getCourseType().equals(trainingCentre.getCourseType())) {
                                            trainingCentre.addTrainees(waitingList.get(secondCounter));
                                            waitingList.remove(secondCounter);
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else { // centre is full
                    totalCentresFull[trainingCentre.getCentreType().ordinal()]++;
                }


                //check for closeures

            }//for loop ends

            for (i = 0; i < trainingCentreList.size(); i++) {
                if (trainingCentreList.get(i).lowCapacity()) {
                    switch (trainingCentreList.get(i).getCentreType()) {
                        case TRAININGHUB:
                            totalCentresClosedT[CentreType.TRAININGHUB.ordinal()]++;
                            totalCentresOpenT[CentreType.TRAININGHUB.ordinal()]--;
                            break;
                        case TECHCENTRE:
                            totalCentresClosedT[CentreType.TECHCENTRE.ordinal()]++;
                            totalCentresOpenT[CentreType.TECHCENTRE.ordinal()]--;
                            break;
                        case BOOTCAMP:
                            totalCentresClosedT[CentreType.BOOTCAMP.ordinal()]++;
                            totalCentresOpenT[CentreType.BOOTCAMP.ordinal()]--;
                            break;
                    }
                    waitingList.addAll(trainingCentreList.get(i).getTrainees());
                    trainingCentreList.remove(i);
                }
            }
            totalCentresOpen =  Arrays.copyOf(totalCentresOpenT,3);
            totalCentresClosed =  Arrays.copyOf(totalCentresClosedT,3);
            totalCentresFull = Arrays.copyOf(totalCentresFullT,3);
            int[] traineesOnWaitingList = new int[5];
            int[] traineesInCentres = new int[5];
            for (Trainee trainee : waitingList) {
                traineesOnWaitingList[trainee.getCourseType().ordinal()]++;
            }
            for (int j = 0; j < 5; j++) {
                traineesInCentres[j] = traineesTraining[j] - traineesOnWaitingList[j];
            }

            HashMap<Integer, int[]> centresClosed = new HashMap<>();
            centresClosed.put(month, totalCentresClosedT);
            FinalData.addToClosedCentres(centresClosed);
            HashMap<Integer, int[]> openCentres = new HashMap<>();
            openCentres.put(month, totalCentresOpenT);
            FinalData.addToOpenCentres(openCentres);
            HashMap<Integer, int[]> fullCentres = new HashMap<>();
            fullCentres.put(month, totalCentresFull);
            FinalData.addToFullCentres(fullCentres);
            HashMap<Integer, int[]> traineesInTraining = new HashMap<>();
            traineesInTraining.put(month, traineesInCentres);
            FinalData.addToTraineesTraining(traineesInTraining);
            HashMap<Integer, int[]> waitingListTraineeCount = new HashMap<>();
            waitingListTraineeCount.put(month, traineesOnWaitingList);
            FinalData.addToTraineesOnWaitingList(waitingListTraineeCount);
        }
    }
}


