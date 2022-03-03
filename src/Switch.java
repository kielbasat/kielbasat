public class Switch {

    public static void main(String[] args) {

        String danie = "Pizza";

        switch (danie) {
            case "Pizza":
                System.out.println("Pizza was selected. Price is 22 zl");
                break;
            case "Salmon":
                System.out.println("Salmon was selected. Price is 42 zl");
            case "Chips":
                System.out.println("Chips were selected. Price is 10 zl");
            default:
                System.out.println("No such item");
        }

    }
}