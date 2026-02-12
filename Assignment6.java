// Eduardo Aguilera
// CS145
// 2/10/26
// Binary IO Assignment 6
// Finds the sum of all integers in a binary file

import java.io.*;

public class Assignment6 {
    public static void main(String[] args) {
        String fileName = "Exercise17_02.dat";
        try {
            createFile(fileName);
        } catch (IOException e) {
            System.out.println("Somethng went wrong");
        }

        printFileIntegers(fileName);
        System.out.println("The sum is: " + sumFileIntegers(fileName));
    }
    public static void createFile(String fileName) throws IOException { // code from files provided
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream(fileName));) {
            for (int i = 0; i < 100; i++) output.writeInt((int)(Math.random() * 100000));
        }
        System.out.println("Done");
    }

    public static void printFileIntegers(String fileName) {
        File file = new File(fileName); // creates file object that will be refrenced but not a new file
        try (FileInputStream byteStream = new FileInputStream(file); // gets the raw bytes from the file
        DataInputStream dataTranslator = new DataInputStream(byteStream)) { // translates into date type
            System.out.println("Integers from " + fileName + ":");
            while (dataTranslator.available() > 0) { // checks how many bytes are left in the raw stream
                for (int i = 0; i < 10; i++) { // prints 10 per "line" for readability
                    int value = dataTranslator.readInt(); // translator grabs 4 bytes and turns them back into an int
                    System.out.print(value + " ");
                } System.out.println(); // line break
            }
        } catch (IOException e) {
            System.out.println("Error when Reading");
        }
    }
    public static int sumFileIntegers(String fileName) {
        int sum = 0; // variable for sum
        File file = new File(fileName); // creates file object that will be refrenced but not a new file
        try (FileInputStream byteStream = new FileInputStream(file); // gets the raw bytes from the file
        DataInputStream dataTranslator = new DataInputStream(byteStream)) { // translates into date type
            while (dataTranslator.available() > 0) { // checks how many bytes are left in the raw stream
                int value = dataTranslator.readInt(); // translator grabs 4 bytes and turns them back into an int
                sum += value; // adds value to the sum
            } // continues adding values until there are none
        } catch (IOException e) {
            System.out.println("Error when Reading");
        } finally {
            return sum;
        }
    }
}