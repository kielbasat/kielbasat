import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please provide second number: ");
        int secondNumber = scanner.nextInt();

        int additionResult = firstNumber + secondNumber;
        int subtractionResult = firstNumber - secondNumber;
        int multiplicationResult = firstNumber * secondNumber;
        int divisionResult = firstNumber / secondNumber;
        int moduloResult = firstNumber % secondNumber;

        System.out.println(additionResult);
        System.out.println(subtractionResult);
        System.out.println(multiplicationResult);
        System.out.println(divisionResult);
        System.out.println(moduloResult);


    }
}
