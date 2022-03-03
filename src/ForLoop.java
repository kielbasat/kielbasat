public class ForLoop {
    public static void main(String[] args) {

        int maxValue = 100;

        for (int i = 0; i < maxValue; i += 2) {
            System.out.println(i);
        }

        for (int j= 0; j< maxValue; j++) {
            if(j % 5 == 0) {
                System.out.println(j);
            }
        }
    }
}


