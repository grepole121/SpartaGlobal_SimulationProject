package SimulationProject;

import java.util.HashMap;

import static com.sparta.SimulationProject.FinalData.getClosedCentres;

public class Starter {

    static private int time;

    public static String start(int[] yearsAndMonths,int[] selectionOfOutput) {
        String output="";
        time= yearsAndMonths[0]*12 + yearsAndMonths[1];

        Simulation sim = new Simulation();
                sim.runSimulation(time);

        boolean finalMonth = false;

        int selectionOutputMonth = selectionOfOutput[0];
        if (selectionOutputMonth == 1) {
            finalMonth = false;
        } else if (selectionOutputMonth == 2) {
            finalMonth = true;
        }


        int selectionOutput = selectionOfOutput[1];
        if (selectionOutput == 1) {
            if (finalMonth) {
                output=Printer.printFinalMonth();
            } else {
                output=Printer.print();
            }
        } else if (selectionOutput == 2) {
            OutputToTXT.outputToTXT(data);
        } else if (selectionOutput == 3) {

            if (finalMonth) {
                output=Printer.printFinalMonth();
                OutputToTXT.outputToTXTFinalMonth(data);
            } else {
                OutputToTXT.outputToTXT(data);
                output=Printer.print();
            }
    }
    return output;
    }
}
