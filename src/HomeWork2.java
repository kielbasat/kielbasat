import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your age (it needs to be a number): ");
        int ageUserInput = scanner.nextInt();

        if (ageUserInput >= 18) {
            System.out.println("It's legal to drink alcohol in Poland");
        } else {
            System.out.println("It's NOT legal to drink alcohol in Poland");
        }
    }
}
