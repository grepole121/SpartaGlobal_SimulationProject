package com.sparta.SimulationProject;

public class FinalData {

    private int[] closedCentres;

    private int[] openCentres;

    private int[] fullCentres;

    private int[] traineesTraining;

    private int traineesOnWaitingList;

    public int[] getClosedCentres() {
        return closedCentres;
    }

    public void setClosedCentres(int[] closedCentres) {
        this.closedCentres = closedCentres;
    }

    public int[] getOpenCentres() {
        return openCentres;
    }

    public void setOpenCentres(int[] openCentres) {
        this.openCentres = openCentres;
    }

    public int[] getFullCentres() {
        return fullCentres;
    }

    public void setFullCentres(int[] fullCentres) {
        this.fullCentres = fullCentres;
    }

    public int[] getTraineesTraining() {
        return traineesTraining;
    }

    public void setTraineesTraining(int[] traineesTraining) {
        this.traineesTraining = traineesTraining;
    }

    public int getTraineesOnWaitingList() {
        return traineesOnWaitingList;
    }

    public void setTraineesOnWaitingList(int traineesOnWaitingList) {
        this.traineesOnWaitingList = traineesOnWaitingList;
    }
}
