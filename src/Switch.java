import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

//        String danie = "Pizza";
//
//        switch (danie) {
//            case "Pizza":
//                System.out.println("Pizza was selected. Price is 22 zl");
//                break;
//            case "Salmon":
//                System.out.println("Salmon was selected. Price is 42 zl");
//            case "Chips":
//                System.out.println("Chips were selected. Price is 10 zl");
//            default:
//                System.out.println("No such item");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide number from 1 to 3 for chosen option \r\n" +
                " 1 - Option 1 \n 2 - Option 2 \n 3 - Option 3");

        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Option 1 selected");
                break;
            case 2:
                System.out.println("Option 1 selected");
                break;
            case 3:
                System.out.println("Option 1 selected");
                break;
            default:
                System.out.println("Please select valid number. Range is from 1 to 3.");
        }
    }
}