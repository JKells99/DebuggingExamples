package org.keyin.debugexamples;

public class Debug2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Processing number: " + i);
        }
    }
}

//Set a breakpoint at System.out.println("Processing number: " + i);
//
//Right-click the breakpoint and select "More" > "Condition".
//
//Enter i == 5 as the condition.
//
//Run in debug mode and notice how it pauses only when i == 5.


