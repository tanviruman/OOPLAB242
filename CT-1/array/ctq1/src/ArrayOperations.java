import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array (N): ");
        int N = scanner.nextInt();

        // Initialize the 2D array
        int[][] array = new int[N][N];

        // Scan the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Print the array
        printArray(array);

        // Find and print the right diagonal elements
        int[] rightDiagonal = findRightDiagonal(array);
        printDiagonal(rightDiagonal);
    }

    // Method to print the array
    public static void printArray(int[][] array) {
        System.out.println("The array is:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to find the right diagonal elements
    public static int[] findRightDiagonal(int[][] array) {
        int N = array.length;
        int[] diagonal = new int[N];
        for (int j = 0; j < N; j++) {
            diagonal[j] = array[j][j];
        }
        return diagonal;
    }

    // Method to print the right diagonal elements
    public static void printDiagonal(int[] diagonal) {
        System.out.println("The right diagonal elements are:");
        for (int element : diagonal) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
