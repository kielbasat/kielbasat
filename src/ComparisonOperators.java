import java.util.Scanner;

public class ComparisonOperators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide first number here :");
        int firstNumber = scanner.nextInt();
        System.out.println("Please provide second number here :");
        int secondNumber = scanner.nextInt();

        System.out.println("firstNumber > secondNumber: " + (firstNumber > secondNumber));
        System.out.println("firstNumber < secondNumber: " + (firstNumber < secondNumber));
        System.out.println("firstNumber >= secondNumber: " + (firstNumber >= secondNumber));
        System.out.println("firstNumber <= secondNumber: " + (firstNumber <= secondNumber));
        System.out.println("firstNumber == secondNumber:" + (firstNumber == secondNumber));
        System.out.println("firstNumber != secondNumber" + (firstNumber != secondNumber));
    }
}
