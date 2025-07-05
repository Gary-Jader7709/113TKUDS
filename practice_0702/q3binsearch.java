package practice_0702;

import java.util.Scanner;

public class q3binsearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        // 讀入排序好的陣列
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int key = scanner.nextInt();
        int ops = 0;
        int left = 0, right = n - 1;
        int index = -1;

        // 二元搜尋
        while (left <= right) {
            ops++;
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // 輸出 index 與操作次數
        System.out.println(index);
        System.out.println(ops);

        scanner.close();
    }
}
