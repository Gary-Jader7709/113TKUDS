package practice_0702;

import java.util.Scanner;

public class q2seqsearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讀取 n
        int n = scanner.nextInt();

        // 建立陣列並讀入 n 個整數
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 讀取欲搜尋的 key
        int key = scanner.nextInt();

        // 順序搜尋
        int ops = 0;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            ops++;
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        // 輸出結果
        System.out.println(found ? "Yes" : "No");
        System.out.println(ops);

        scanner.close();
    }
}
