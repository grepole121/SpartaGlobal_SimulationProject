package com.sparta.SimulationProject;

public class Printer {

    public static String print() {
        String output = "";
        for (int i = 1; i <= FinalData.getTraineesTraining().size(); i++) {
            int[] open = FinalData.getOpenCentres(i);
            int[] full = FinalData.getFullCentres(i);
            int[] closed = FinalData.getClosedCentres(i);
            int[] training = FinalData.getTraineesTraining(i);
            int[] waiting = FinalData.getTraineesOnWaitingList(i);
            int[] centreType = FinalData.getToTraineesPerCentreType(i);
            System.out.println("---Month " + i + "---\n");
            System.out.println("Open Centres: \n" + "Training hub : " + open[0] + "\n" + "Tech Centre : " + open[1] + "\n" + "Bootcamp : " + open[2]+ "\n" );
            System.out.println("Full Centres: \n" + "Training hub : " + full[0] + "\n" + "Tech Centre : " + full[1] + "\n" + "Bootcamp : " + full[2]+ "\n" );
            System.out.println("Closed Centres: \n" + "Training hub : " + closed[0] + "\n" + "Tech Centre : " + closed[1] + "\n" + "Bootcamp : " + closed[2]+ "\n" );
            System.out.println("Trainees in Training per Centre Type: \n" + "Training hub : " + centreType[0] + "\n" + "Tech Centre : " + centreType[1] + "\n" + "Bootcamp : " + centreType[2]+ "\n" );
            System.out.println("Trainees in Training: \n" + "JAVA : " + training[0] + "\n" + "CSHARP : " + training[1] + "\n" + "DEVOPS : " + training[2] + "\n" + "DATA : " + training[3] + "\n" + "BUSINESS : " + training[4]+ "\n" );
            System.out.println("Trainees on the Waiting List: \n" + "JAVA : " + waiting[0] + "\n" + "CSHARP : " + waiting[1] + "\n" + "DEVOPS : " + waiting[2] + "\n" + "DATA : " + waiting[3] + "\n" + "BUSINESS : " + waiting[4]+ "\n" );

            output += ("---Month " + i + "---\n");
            output += ("Open Centres: \n" + "Training hub : " + open[0] + "\n" + "Tech Centre : " + open[1] + "\n" + "Bootcamp : " + open[2]+ "\n" );
            output += ("Full Centres: \n" + "Training hub : " + full[0] + "\n" + "Tech Centre : " + full[1] + "\n" + "Bootcamp : " + full[2]+ "\n" );
            output += ("Closed Centres: \n" + "Training hub : " + closed[0] + "\n" + "Tech Centre : " + closed[1] + "\n" + "Bootcamp : " + closed[2]+ "\n" );
            output += ("Trainees in Training per Centre Type: \n" + "Training hub : " + centreType[0] + "\n" + "Tech Centre : " + centreType[1] + "\n" + "Bootcamp : " + centreType[2]+ "\n" );
            output += ("Trainees in Training: \n" + "JAVA : " + training[0] + "\n" + "CSHARP : " + training[1] + "\n" + "DEVOPS : " + training[2] + "\n" + "DATA : " + training[3] + "\n" + "BUSINESS : " + training[4]+ "\n" );
            output += ("Trainees on the Waiting List: \n" + "JAVA : " + waiting[0] + "\n" + "CSHARP : " + waiting[1] + "\n" + "DEVOPS : " + waiting[2] + "\n" + "DATA : " + waiting[3] + "\n" + "BUSINESS : " + waiting[4]+ "\n" );
             }
        return output;
    }

    public static String printFinalMonth() {
        String output = "";
        int finalMonth = FinalData.getTraineesTraining().size();
        int[] open = FinalData.getOpenCentres(finalMonth);
        int[] full = FinalData.getFullCentres(finalMonth);
        int[] closed = FinalData.getClosedCentres(finalMonth);
        int[] training = FinalData.getTraineesTraining(finalMonth);
        int[] waiting = FinalData.getTraineesOnWaitingList(finalMonth);
        int[] centreType = FinalData.getToTraineesPerCentreType(finalMonth);
        System.out.println("---Final Month " + finalMonth + "---\n");
        System.out.println("Open Centres: \n" + "Training hub : " + open[0] + "\n" + "Tech Centre : " + open[1] + "\n" + "Bootcamp : " + open[2]+ "\n" );
        System.out.println("Full Centres: \n" + "Training hub : " + full[0] + "\n" + "Tech Centre : " + full[1] + "\n" + "Bootcamp : " + full[2]+ "\n" );
        System.out.println("Closed Centres: \n" + "Training hub : " + closed[0] + "\n" + "Tech Centre : " + closed[1] + "\n" + "Bootcamp : " + closed[2]+ "\n" );
        System.out.println("Trainees in Training per Centre Type: \n" + "Training hub : " + centreType[0] + "\n" + "Tech Centre : " + centreType[1] + "\n" + "Bootcamp : " + centreType[2]+ "\n" );
        System.out.println("Trainees in Training: \n" + "JAVA : " + training[0] + "\n" + "CSHARP : " + training[1] + "\n" + "DEVOPS : " + training[2] + "\n" + "DATA : " + training[3] + "\n" + "BUSINESS : " + training[4]+ "\n" );
        System.out.println("Trainees on the Waiting List: \n" + "JAVA : " + waiting[0] + "\n" + "CSHARP : " + waiting[1] + "\n" + "DEVOPS : " + waiting[2] + "\n" + "DATA : " + waiting[3] + "\n" + "BUSINESS : " + waiting[4]+ "\n" );

        output += ("---Final Month " + finalMonth + "---\n");
        output += ("Open Centres: \n" + "Training hub : " + open[0] + "\n" + "Tech Centre : " + open[1] + "\n" + "Bootcamp : " + open[2]+ "\n" );
        output += ("Full Centres: \n" + "Training hub : " + full[0] + "\n" + "Tech Centre : " + full[1] + "\n" + "Bootcamp : " + full[2]+ "\n" );
        output += ("Closed Centres: \n" + "Training hub : " + closed[0] + "\n" + "Tech Centre : " + closed[1] + "\n" + "Bootcamp : " + closed[2]+ "\n" );
        output += ("Trainees in Training per Centre Type: \n" + "Training hub : " + centreType[0] + "\n" + "Tech Centre : " + centreType[1] + "\n" + "Bootcamp : " + centreType[2]+ "\n" );
        output += ("Trainees in Training: \n" + "JAVA : " + training[0] + "\n" + "CSHARP : " + training[1] + "\n" + "DEVOPS : " + training[2] + "\n" + "DATA : " + training[3] + "\n" + "BUSINESS : " + training[4]+ "\n" );
        output += ("Trainees on the Waiting List: \n" + "JAVA : " + waiting[0] + "\n" + "CSHARP : " + waiting[1] + "\n" + "DEVOPS : " + waiting[2] + "\n" + "DATA : " + waiting[3] + "\n" + "BUSINESS : " + waiting[4]+ "\n" );
        return output;
    }

    public static String printMonth() {
        String output = "";
        int month = FinalData.getTraineesTraining().size();
        int[] open = FinalData.getOpenCentres(month);
        int[] full = FinalData.getFullCentres(month);
        int[] closed = FinalData.getClosedCentres(month);
        int[] training = FinalData.getTraineesTraining(month);
        int[] waiting = FinalData.getTraineesOnWaitingList(month);
        int[] centreType = FinalData.getToTraineesPerCentreType(month);
        System.out.println("---Month " + month + "---\n");
        System.out.println("Open Centres: \n" + "Training hub : " + open[0] + "\n" + "Tech Centre : " + open[1] + "\n" + "Bootcamp : " + open[2]+ "\n" );
        System.out.println("Full Centres: \n" + "Training hub : " + full[0] + "\n" + "Tech Centre : " + full[1] + "\n" + "Bootcamp : " + full[2]+ "\n" );
        System.out.println("Closed Centres: \n" + "Training hub : " + closed[0] + "\n" + "Tech Centre : " + closed[1] + "\n" + "Bootcamp : " + closed[2]+ "\n" );
        System.out.println("Trainees in Training per Centre Type: \n" + "Training hub : " + centreType[0] + "\n" + "Tech Centre : " + centreType[1] + "\n" + "Bootcamp : " + centreType[2]+ "\n" );
        System.out.println("Trainees in Training: \n" + "JAVA : " + training[0] + "\n" + "CSHARP : " + training[1] + "\n" + "DEVOPS : " + training[2] + "\n" + "DATA : " + training[3] + "\n" + "BUSINESS : " + training[4]+ "\n" );
        System.out.println("Trainees on the Waiting List: \n" + "JAVA : " + waiting[0] + "\n" + "CSHARP : " + waiting[1] + "\n" + "DEVOPS : " + waiting[2] + "\n" + "DATA : " + waiting[3] + "\n" + "BUSINESS : " + waiting[4]+ "\n" );

        output += ("---Month " + month + "---\n");
        output += ("Open Centres: \n" + "Training hub : " + open[0] + "\n" + "Tech Centre : " + open[1] + "\n" + "Bootcamp : " + open[2]+ "\n" );
        output += ("Full Centres: \n" + "Training hub : " + full[0] + "\n" + "Tech Centre : " + full[1] + "\n" + "Bootcamp : " + full[2]+ "\n" );
        output += ("Closed Centres: \n" + "Training hub : " + closed[0] + "\n" + "Tech Centre : " + closed[1] + "\n" + "Bootcamp : " + closed[2]+ "\n" );
        output += ("Trainees in Training per Centre Type: \n" + "Training hub : " + centreType[0] + "\n" + "Tech Centre : " + centreType[1] + "\n" + "Bootcamp : " + centreType[2]+ "\n" );
        output += ("Trainees in Training: \n" + "JAVA : " + training[0] + "\n" + "CSHARP : " + training[1] + "\n" + "DEVOPS : " + training[2] + "\n" + "DATA : " + training[3] + "\n" + "BUSINESS : " + training[4]+ "\n" );
        output += ("Trainees on the Waiting List: \n" + "JAVA : " + waiting[0] + "\n" + "CSHARP : " + waiting[1] + "\n" + "DEVOPS : " + waiting[2] + "\n" + "DATA : " + waiting[3] + "\n" + "BUSINESS : " + waiting[4]+ "\n" );
        return output;
    }
}
