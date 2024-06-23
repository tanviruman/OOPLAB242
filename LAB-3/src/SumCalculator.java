import java.util.Scanner;

public class SumCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter the first number: ");

        double number1 = scanner.nextDouble();


        System.out.print("Please enter the second number: ");

        double number2 = scanner.nextDouble();


        double sum = number1 + number2;

        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);

        scanner.close();
    }
}
