package org.keyin.debugexamples;

public class Debug4 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 5) {  // Set a breakpoint here
            System.out.println("Count: " + count);
            count--;  // Oops! Wrong direction
        }
    }
}

//Set a breakpoint inside the loop.
//
//Run in debug mode and watch the count variable.
//
//Use the Evaluate Expression (Alt + F8) to modify count dynamically.
//
//Correct count--; to count++; in runtime using HotSwap (Ctrl + F9).


