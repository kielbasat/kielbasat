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
    }

}

