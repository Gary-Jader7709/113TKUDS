package midterm;

import java.util.Scanner;

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // 場次數
        int[] results = new int[n];
        
        for (int i = 0; i < n; i++) {
            results[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();  // 查詢的前 k 場
        
        int[] prefixSum = new int[k];
        prefixSum[0] = results[0];
        
        for (int i = 1; i < k; i++) {
            prefixSum[i] = prefixSum[i - 1] + results[i];
        }
        
        System.out.print("PrefixSum: ");
        for (int i = 0; i < k; i++) {
            System.out.print(prefixSum[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：使用一次迴圈計算前綴和，時間複雜度為 O(n)。
 */
