package midterm;

import java.util.Scanner;

public class Q3_NightMarketRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // 攤位數
        double[] scores = new double[n];
        
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextDouble();
        }
        
        // 選擇排序
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (scores[i] < scores[j]) {
                    double temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }
        }
        
        int limit = Math.min(5, n);
        for (int i = 0; i < limit; i++) {
            System.out.printf("%.1f\n", scores[i]);
        }
        
        sc.close();
    }
}

/*
 * Time Complexity: O(n^2)
 * 說明：使用選擇排序，兩層迴圈對每一對元素進行比較，最壞情況比較次數為 n(n-1)/2，時間複雜度為 O(n^2)。
 */
