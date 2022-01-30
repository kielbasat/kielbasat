public class Operators {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 10;
        float firstDouble = 1F;
        float secondDouble = 10F;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = firstDouble / secondDouble;
        int modulo = firstNumber % secondNumber;

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(modulo);

        firstNumber += secondNumber;
        System.out.println("after addition: " + firstNumber);
        firstNumber -= secondNumber;
        System.out.println("after subtraction: " + firstNumber);
        firstNumber *= secondNumber;
        System.out.println("after multiplication: " + firstNumber);
        firstDouble /= secondDouble;
        System.out.println("after division: " + firstNumber);
        firstNumber %= secondNumber;
        System.out.println("after modulo: " + firstNumber);
    }
}
