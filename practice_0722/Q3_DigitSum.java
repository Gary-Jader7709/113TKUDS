package practice_0722;

public class Q3_DigitSum {
    public static int digitSum(int n) {
        // 停止條件：n 為 0 時回傳 0
        if (n == 0)
            return 0;
        // 遞迴關係：個位數 + 其餘位數的總和
        return (n % 10) + digitSum(n / 10);
    }

    public static void main(String[] args) {
        System.out.println("1234 的位數總和: " + digitSum(1234)); // 10
    }
}
