package com.sparta.SimulationProject;

import com.github.stefanbirkner.systemlambda.SystemLambda;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class PrinterTest {

    @Test
    @DisplayName("Test the Printer.print function can print out a string")
    void printerOutputPrint() throws Exception {
        String text = SystemLambda.tapSystemOut(() -> {
            Printer.print("Hello World");
        });
        Assertions.assertEquals("Hello World", text.trim());
    }

    @Test
    @DisplayName("Test the Printer.print function can print out the final month")
    void printerOutputFinalMonth() throws Exception {
        HashMap<Integer, int[]> result = new HashMap<>();
        result.put(1, new int[]{1, 2, 3, 4});
        String text = SystemLambda.tapSystemOut(() -> {
            Printer.print(result);
        });
        Assertions.assertEquals("---Month 1---\r\n" +
                "Open Centres: 1\r\n" +
                "Full Centres: 2\r\n" +
                "Trainees in Training: 3\r\n" +
                "Trainees on the Waiting List: 4", text.trim());
    }
}
