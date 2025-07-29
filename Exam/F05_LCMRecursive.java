package Exam;

import java.util.*;

public class F05_LCMRecursive {
    public static int gcd(int a, int b) {
        if (a == b)
            return a;
        return a > b ? gcd(a - b, b) : gcd(a, b - a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd(a, b);
        int lcm = a * b / gcd;
        System.out.println("LCM: " + lcm);
    }
}

/*
 * Time Complexity: O(max(a, b))
 * 說明：每次遞迴以減法進行，最壞需呼叫 max(a,b) 次
 */
