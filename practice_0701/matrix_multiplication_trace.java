package practice_0701;

public class matrix_multiplication_trace {
    public static void main(String[] args) {
        // 初始化兩個 2x2 矩陣
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        
        // 結果矩陣 c，初始化為 0
        int[][] c = new int[2][2];
        
        // 使用三層迴圈進行矩陣相乘
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                // 計算 c[i][j] 的值
                c[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    // 顯示每個計算過程
                    System.out.println("計算位置 c[" + i + "][" + j + "]：" + a[i][k] + "*" + b[k][j] + " = " + (a[i][k] * b[k][j]));
                    c[i][j] += a[i][k] * b[k][j];
                }
                // 顯示加總過程
                System.out.println("計算位置 c[" + i + "][" + j + "] 的加總：" + c[i][j]);
            }
        }
        
        // 顯示最終結果矩陣
        System.out.println("\n結果矩陣：");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
