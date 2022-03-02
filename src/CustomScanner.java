import java.util.Scanner;

public class CustomScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! please provide a number:");
        int userInputNumber = scanner.nextInt();
        String userOutputText = "thanks! number provided is: ";
        System.out.println(userOutputText + userInputNumber);

        String userOutputText2 = "Square of imputed number is: ";
        int squareOfUserInputedNumber = userInputNumber * userInputNumber;
        System.out.println(userOutputText2 + squareOfUserInputedNumber);
    }
}


