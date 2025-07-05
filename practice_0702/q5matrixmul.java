package practice_0702;

import java.util.Scanner;

public class q5matrixmul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];

        // 讀入矩陣 A
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = scanner.nextInt();

        // 讀入矩陣 B
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                B[i][j] = scanner.nextInt();

        int ops = 0;

        // 矩陣相乘：C = A × B
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                    ops += 2; // 1 次乘法 + 1 次加法
                }
            }
        }

        // 輸出結果矩陣 C
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j] + (j == n - 1 ? "\n" : " "));
            }
        }

        // 輸出操作次數
        System.out.println(ops);

        scanner.close();
    }
}
