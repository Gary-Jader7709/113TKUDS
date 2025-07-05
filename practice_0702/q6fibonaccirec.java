package practice_0702;

import java.util.Scanner;

public class q6fibonaccirec {
    static int ops = 0;

    // 遞迴計算 Fibonacci 數列
    public static int fib(int n) {
        ops++;
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = fib(n);

        System.out.println(result);  // F(n)
        System.out.println(ops);     // 遞迴呼叫次數

        scanner.close();
    }
}
