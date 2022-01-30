public class IncrementationDecrementation {
    public static void main(String[] args) {

        int a = 0;
        System.out.println("value of a: " + a);

        int b = a++;
        System.out.println("value of b: " + b);
        System.out.println("value of a: " + a);

        int c = ++a;
        System.out.println("value of c: " + c);
        System.out.println("value of a: " + a);

        int d = 0;
        System.out.println("value of d: " + d);

        int e = d--;
        System.out.println("value of d: " + d);
        System.out.println("value of e: " + e);

        int f = --d;
        System.out.println("value of d: " + d);
        System.out.println("value of f: " + f);

    }
}
