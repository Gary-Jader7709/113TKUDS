package practice_0702;

import java.util.Scanner;

public class q4paircount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        // 讀入陣列
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 計算不同索引配對數（C(n, 2)）
        int pairCount = 0;
        int ops = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                pairCount++;
                ops++;
            }
        }

        System.out.println(pairCount);
        System.out.println(ops);

        scanner.close();
    }
}
