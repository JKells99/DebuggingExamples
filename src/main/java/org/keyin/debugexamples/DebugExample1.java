package org.keyin.debugexamples;

public class DebugExample1 {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum += i;  // Place a breakpoint here
            System.out.println("Sum after adding " + i + " is: " + sum);
        }

        System.out.println("Final Sum: " + sum);
    }
}


//Set a breakpoint at sum += i; by clicking on the left margin.
//
//Run in debug mode (Shift + F9). control + d on mac
//
//Use Step Over (F8) to execute each iteration.
//
//Watch the "Variables" tab to see sum changing.

