import java.util.Scanner;

public class Student {

    // Attributes
    private String name;
    private String id;
    private int[] ctMarks;
    private double averageCtMarks;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.id = "011XXXXXX";
        this.ctMarks = new int[3];
        this.averageCtMarks = 0.0;
    }

    // Constructor that expects name, ID, and CT marks
    public Student(String name, String id, int[] ctMarks) {
        this.name = name;
        this.id = id;
        this.ctMarks = ctMarks;
        this.averageCtMarks = calculateAvgCtMarks();
    }

    // Constructor that expects name and ID
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.ctMarks = new int[3];
        this.averageCtMarks = 0.0;
    }

    // Method to calculate the average CT marks
    public double calculateAvgCtMarks() {
        int sum = 0;
        for (int mark : ctMarks) {
            sum += mark;
        }
        this.averageCtMarks = (double) sum / ctMarks.length;
        return this.averageCtMarks;
    }

    // Method to print the student details
    public void printDetails() {
        System.out.println("Student details:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Average CT Mark: " + averageCtMarks);
    }

    // Method to set CT marks
    public void setCtMarks(int[] ctMarks) {
        this.ctMarks = ctMarks;
        this.averageCtMarks = calculateAvgCtMarks();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize an object by providing student's name and ID
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student's ID: ");
        String id = scanner.nextLine();

        Student student = new Student(name, id);

        // Take 3 inputs as CT marks from user
        int[] ctMarks = new int[3];
        System.out.println("Enter 3 CT marks:");
        for (int i = 0; i < 3; i++) {
            ctMarks[i] = scanner.nextInt();
        }

        // Set CT marks and calculate average CT marks
        student.setCtMarks(ctMarks);

        // Call the printDetails method to display student information
        student.printDetails();

        // Create an object without providing any information
        Student defaultStudent = new Student();

        // Call the printDetails method for the default student
        defaultStudent.printDetails();
    }
}
