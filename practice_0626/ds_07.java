package practice_0626;

import java.util.Scanner;

public class ds_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[2][3];

        // 輸入陣列元素
        System.out.println("請輸入 2x3 的整數陣列：");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // 輸出陣列內容
        System.out.println("你輸入的二維陣列為：");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
