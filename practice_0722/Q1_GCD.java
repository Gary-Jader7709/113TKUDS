package practice_0722;

public class Q1_GCD {
    public static int gcd(int a, int b) {
        // base case
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("GCD of 48 and 18 = " + gcd(48, 18));
    }
}
