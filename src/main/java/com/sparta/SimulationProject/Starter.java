package SimulationProject;

import java.util.HashMap;

public class Starter {

    static private int time;

    public static String start(int[] yearsAndMonths,int[] selectionOfOutput) {
        String output="";
        time= yearsAndMonths[0]*12 + yearsAndMonths[1];

        Simulation sim = new Simulation();
        HashMap<Integer, int[]> data = sim.runSimulation(time);

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
                output=Printer.printFinalMonth(data);
            } else {
                output=Printer.print(data);
            }
        } else if (selectionOutput == 2) {
            OutputToTXT.outputToTXT(data);
        } else if (selectionOutput == 3) {

            if (finalMonth) {
                output=Printer.printFinalMonth(data);
                OutputToTXT.outputToTXTFinalMonth(data);
            } else {
                OutputToTXT.outputToTXT(data);
                output=Printer.print(data);
            }
    }
    return output;
    }
}
