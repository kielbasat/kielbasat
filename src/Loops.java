public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i += 2) {
            System.out.println("i value is: " + i);
        }

        int j = 1;
        do {
            System.out.println("J value is: " + j);
            j++;
        } while (j < 10);

        double k = Math.random();
        System.out.println("Random number is: " + k);

        while (k > 0 && k < 10) {
            System.out.println("While loop k value is: " + k);
            k++;
        }
        for (int i = 0; i < 15; i += 5) {
            System.out.println(i);
        }
        int i = 0;
        while (i == 0) {
            System.out.println("Value of i = " + i + " should be equal 0.");
            i++;
        }
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

    }

}

