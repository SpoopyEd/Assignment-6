// Eduardo Aguilera
// CS145
// 2/10/26
// Binary IO Assignment
// Finds the sum of all integers in a file

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Assignment6 {
    public static void main(String[] args) throws IOException {
        try (
        DataOutputStream output =
            new DataOutputStream(new FileOutputStream("Exercise17_02.dat", true));
        ) {
        for (int i = 0; i < 100; i++)
            output.writeInt((int)(Math.random() * 100000));
        }

        System.out.println("Done");
        Path path = Paths.get("Excercise17_02.dat");
        Scanner fileScanner = new Scanner(path); // creates new scanner that scans the file
        // reference PrintStream printStream = new PrintStream(outputFile);

        while (fileScanner.hasNextLine()) {
            try {
                fileScanner.nextInt();
            } catch (Exception e) {
                
            }
    }
    }
}
// creates file full of random integers named Excercice17_02.dat