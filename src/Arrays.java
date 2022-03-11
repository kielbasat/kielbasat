public class Arrays {

    public static void main(String[] args) {

        String[] firstNames = new String[3];
        firstNames[0] = "Bartek";
        firstNames[1] = "Basia";
        firstNames[2] = "Michal";

        System.out.println(firstNames[0]);
        System.out.println(firstNames[1]);
        System.out.println(firstNames[2]);

        int[] nonRandomNumbers = new int[]{1, 2, 3};

        System.out.println(nonRandomNumbers[0]);
        System.out.println(nonRandomNumbers[1]);
        System.out.println(nonRandomNumbers[2]);

        System.out.println("Array length in new line is: \r\n" + +nonRandomNumbers.length);

        for (int i = 0; i < firstNames.length; i++) {
            System.out.println(firstNames[i]);
            System.out.println(nonRandomNumbers[i]);
        }

    }
}
