package org.example;

public class SystemErr {
    public static void main(String[] args) {

        System.out.println("\n Printing from OUT ");

                // Using print()
       System.err.print("This is an error message using print().\n");
//
        // Using println()
       System.err.println("This is another error message using println().");
        // Using printf()
      System.err.printf("Error code: %d, Message: %s%n", 404, "Not Found");
    }
}

