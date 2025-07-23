package practice_0722;

public class Q4_Fibonacci {
    public static int fibonacci(int n) {
        // 停止條件：fib(0)=0, fib(1)=1
        if (n <= 1)
            return n;
        // 遞迴關係：fib(n) = fib(n-1) + fib(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("fib(5): " + fibonacci(5)); // 5
    }
}
