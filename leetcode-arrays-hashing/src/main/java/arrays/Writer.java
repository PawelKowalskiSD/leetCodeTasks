package arrays;

import java.io.*;

public class Writer {

    public static void main(String[] args) {
        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Writing to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt", true))) {
            writer.write("\nHello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
