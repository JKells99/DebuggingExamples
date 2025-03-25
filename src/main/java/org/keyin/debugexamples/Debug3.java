package org.keyin.debugexamples;

public class Debug3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        for (int i = 0; i <= numbers.length; i++) {  // Set a breakpoint here
            System.out.println("Number: " + numbers[i]);
        }
    }
}

//
//Run normally to trigger an exception.
//
//IntelliJ will highlight the exact line causing the error.
//
//   Use "View Exception Breakpoints" to pause execution when an exception occurs.