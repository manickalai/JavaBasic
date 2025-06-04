package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExcHandling {
    public static void main(String[] args) {
        {
            int n = 10;
            int m = 2;


          //  int ans = n / m;

           try {
                // Code that may throw an exception
                int ans = n / m;
                System.out.println("Answer: " + ans);
            } catch (ArithmeticException u) {

                // Handling the exception
                System.out.println(
                        "Error: Division by zero is not allowed!" + u.getMessage());
            } finally {
                System.out.println(
                        "Program continues after handling the exception.");
            }
        }
    }
}