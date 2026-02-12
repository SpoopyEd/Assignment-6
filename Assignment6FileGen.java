// Eduardo Aguilera
// CS145
// 2/10/26
// Binary IO Assignment
// Finds the sum of all integers in a file

import java.io.*;

public class Assignment6FileGen {
  public static void main(String[] args) throws IOException {
    try (
      DataOutputStream output =
        new DataOutputStream(new FileOutputStream("Exercise17_02.dat", true));
    ) {
      for (int i = 0; i < 100; i++)
        output.writeInt((int)(Math.random() * 100000));
    }

    System.out.println("Done");
  }
}
// creates file full of random integers named Excercice17_02.dat
