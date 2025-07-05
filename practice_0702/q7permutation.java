package practice_0702;

import java.util.Scanner;

public class q7permutation {
    static int ops = 0;

    // 交換兩個陣列元素
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 遞迴產生排列
    public static void permute(int[] arr, int start) {
        if (start == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + (i == arr.length - 1 ? "\n" : " "));
            }
            ops++;
            return;
        }

        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i);
            permute(arr, start + 1);
            swap(arr, start, i);  // backtrack
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        // 產生初始陣列 [1, 2, ..., n]
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        permute(arr, 0);

        System.out.println(ops);  // 總共幾個排列

        scanner.close();
    }
}
