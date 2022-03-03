public class ConditionalBranches {
    public static void main(String[] args) {

        double firstNumber = 4.0;
        double secondNumber = 11.0;

//        if (secondNumber != 0) {
//            System.out.println(firstNumber / secondNumber);
//        } else {
//            System.out.println("Provided number is equal to 0. Please provide different number.");
//        }

        if (secondNumber == 0) {
            System.out.println("Number is equal 0");
        } else if (secondNumber > 10){
            System.out.println("Number is greater than 10");
        } else if (secondNumber > 0){
            System.out.println("Number is greater than 0");
        }  else if (secondNumber < -5) {
            System.out.println("Number is smaller than -5");
        } else {
            System.out.println("No requirements were met");
    }
    }
}