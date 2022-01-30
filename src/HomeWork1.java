import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide first number here: ");
        float firstNumber = scanner.nextInt();
        System.out.println("Please provide second number here: ");
        float secondNumber = scanner.nextInt();

        float addition = (firstNumber + secondNumber);
        float subtraction = (firstNumber - secondNumber);
        float division = (firstNumber / secondNumber);
        float multiplication = (firstNumber * secondNumber);
        float modulo = (firstNumber % secondNumber);

        System.out.println("addition of Your numbers is: " + addition);
        System.out.println("subtraction of Your numbers is: " + subtraction);
        System.out.println("division of Your numbers is: " + division);
        System.out.println("multiplication of Your numbers is: " + multiplication);
        System.out.println("modulo of Your numbers is: " + modulo);


    }
}
