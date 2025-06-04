package org.example;

// Java Program to Demonstrate the working
// of FileOutputStream
import java.io.*;

class OutputStream {
    public static void main(String[] args)
    {
        String data = "i am creating the file from java program in the java traning class on 04-06-2025";

        try (FileOutputStream fos
                     = new FileOutputStream("outputfile.txt")) {

            // Convert the string into bytes
            byte[] dataBytes = data.getBytes();

            // Write the bytes to the file
            fos.write(dataBytes);

            System.out.println(
                    "Data successfully written to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred: "
                    + e.getMessage());
        }
    }
}
