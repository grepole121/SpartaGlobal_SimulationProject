package com.sparta.SimulationProject;

import java.util.Scanner;

public class UserInput {
    static Scanner userInput = new Scanner(System.in);

    public static int inputInt() {
        int number = userInput.nextInt();
        return number;
    }
}
