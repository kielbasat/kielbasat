import java.util.Scanner;

public class CustomScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide Your name here:");

        String name = scanner.nextLine();
        System.out.println("Please provide the first number here:");

        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println(name + " " + "Square of: " + firstNumber + " is: " + result);
    }
}


