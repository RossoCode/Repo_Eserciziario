package Java_OOP_Advanced.Exercise24_Reading_and_writing_to_a_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.writeString;


public class Exercises {

    private static final Path MY_PATH = Paths.get("Java_OOP_Advanced/Exercise24_Reading_and_writing_to_a_file/file.txt");
    private static final Path PATH_IN_A_FOLDER = Paths.get("directory/file.txt");

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    // Use the MY_PATH constant

    /**
     * 1:
     * Write a method that writes myString to a file
     * writes to a file
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        String myString = """
                The quick brown fox jumps over the lazy dog
                """;

        try {
            Files.deleteIfExists(MY_PATH);
            Files.createFile(MY_PATH);

            // Your code here
            Files.writeString(MY_PATH, myString);
            System.out.println("Success");

        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 2:
     * Write a method that reads the file from exercise 1
     * then prints it out
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        try {
            // Your code here
            FileReader reader = new FileReader("Java_OOP_Advanced/Exercise24_Reading_and_writing_to_a_file/file.txt");
            int data = reader.read();
            while (data != -1)
            {
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }


    }

    /**
     * 3:
     * Write a method that reads a file and print the number of lines in the file
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Write code here to read the file and return the number of lines "\n", string.split

        try {
            // Your code here
            BufferedReader lineReader = new BufferedReader(new FileReader("Java_OOP_Advanced/Exercise24_Reading_and_writing_to_a_file/file.txt"));
            int numLines = 0;
            BufferedReader reader;
            while (lineReader.readLine() != null) numLines++;
            lineReader.close();
            System.out.println("has " + numLines + " line");
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 4:
     * Write a method that reads a file and returns the number of words in the file
     *
     * Then deletes the previous file with Files.delete() use inside the try block
     *
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        try {
            // Your code here
            ArrayList<String> fileArray = new ArrayList<String>(List.of(Files.readString(MY_PATH).split(" ")));
            int count = 0;
            for (String Arrayword: fileArray) {
                count++;
            }
            System.out.println("the number of words are " + count);
            Files.delete(MY_PATH);
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 5:
     * Using the `myDirectoryPath` and Files.createDirectory, fix the code below
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        Path myDirectoryPath = Path.of("myDirectory");

        try {
            // Your code
            Files.createDirectory(myDirectoryPath);
            Files.writeString(PATH_IN_A_FOLDER, "Why am I in a folder?");
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }
}
