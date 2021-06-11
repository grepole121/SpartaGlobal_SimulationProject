package com.sparta.SimulationProject;

import com.sparta.SimulationProject.Util.UserInput;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class UserInputTest {

    @Test
    @DisplayName("Test to see if scanner can read in an int")
    public void shouldReturnInput() {
        String simulatedUserInput = "10";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
        System.setIn(in);
        Assertions.assertEquals(10, UserInput.inputInt());
    }
}
