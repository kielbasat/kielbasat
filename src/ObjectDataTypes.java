public class ObjectDataTypes {
    public static void main(String[] args) {
        Byte firstNumber = 127; // 1 byte
        Short secondNumber = 32767; // 2 bytes
        Integer thirdNumber = 2147483647; // 4 bytes
        Long fourthNumber = 9223372036854775807L; //8 bytes
        Float fifthNumber = 1.0000001f; // 4 bytes
        Double sixthNumber = 1.000000000000001d; // 8 bytes
        Boolean isTrue = true;
        Boolean isFalse = false;
        Character character = 'a';
        String firstString = "Hello World";
        String secondString = "Hello World";

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println(fourthNumber);
        System.out.println(fifthNumber);
        System.out.println(sixthNumber);
        System.out.println(isTrue);
        System.out.println(isFalse);
        System.out.println(character);
        System.out.println(firstString);
        System.out.println(secondString);

        System.out.println(firstString.contains("llo W"));
        System.out.println(firstString.contains("lloW"));
        System.out.println(firstString.equals(secondString));
    }
}
