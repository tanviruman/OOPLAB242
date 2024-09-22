import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    // Static method to check if a string is a valid number
    public static boolean is_num(String a) {
        try {
            Double.parseDouble(a);  // Try to convert the string to a double
            return true;  // If successful, return true
        } catch (NumberFormatException e) {
            return false;  // If parsing fails, return false
        }
    }

    public static void main(String[] args) {
        try {
            // File paths for reading and writing
            File file_read = new File("C:\\Users\\User\\IdeaProjects\\File\\src\\PostsInput.txt");
            File file_write = new File("C:\\Users\\User\\IdeaProjects\\File\\src\\PostsOutput.txt");

            // PrintWriter to write to the output file
            PrintWriter write = new PrintWriter(new FileWriter(file_write, false));  // `false` to overwrite the file

            // Scanner to read the input file
            Scanner sc = new Scanner(file_read);

            // Reading the input file line by line
            while (sc.hasNextLine()) {
                String s = sc.nextLine();  // Read a line
                String[] part = s.split(" ");  // Split the line into words

                // Loop through each part and check if it's a number
                for (int i = 0; i < part.length; i++) {
                    if (is_num(part[i])) {  // Simplified condition
                        write.print(part[i] + " ");  // Write the number to the output file
                    }
                }
                write.println();  // Add a new line after processing each line
            }

            // Close the resources
            sc.close();
            write.close();

        } catch (IOException e) {
            e.printStackTrace();  // Handle file I/O exceptions
        }
    }
}
