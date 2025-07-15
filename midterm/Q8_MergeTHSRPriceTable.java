package midterm;

import java.util.Scanner;

public class Q8_MergeTHSRPriceTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // 高鐵站數量
        String[] stations = new String[n];
        int[][] prices = new int[n][2];  // 0 -> 標準票，1 -> 商務票
        
        // 讀取站名與票價
        for (int i = 0; i < n; i++) {
            stations[i] = sc.next();
            prices[i][0] = sc.nextInt();
            prices[i][1] = sc.nextInt();
        }
        
        // 輸出表格
        System.out.println("Station|Standard|Business");
        for (int i = 0; i < n; i++) {
            System.out.printf("%s|%d|%d\n", stations[i], prices[i][0], prices[i][1]);
        }
        
        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：只需遍歷一次高鐵站資料，時間複雜度為 O(n)。
 */
