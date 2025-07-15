package midterm;

import java.util.Scanner;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // 班次數量
        int[] times = new int[n];
        
        for (int i = 0; i < n; i++) {
            String time = sc.next();
            times[i] = Integer.parseInt(time.split(":")[0]) * 60 + Integer.parseInt(time.split(":")[1]);
        }
        
        String queryTime = sc.next();
        int query = Integer.parseInt(queryTime.split(":")[0]) * 60 + Integer.parseInt(queryTime.split(":")[1]);
        
        int left = 0, right = n - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (times[mid] > query) {
                result = times[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        if (result == -1) {
            System.out.println("No train");
        } else {
            System.out.printf("%02d:%02d\n", result / 60, result % 60);
        }
        
        sc.close();
    }
}

/*
 * Time Complexity: O(n log n)
 * 說明：首先將時間轉換成分鐘並儲存陣列，接著使用二分搜尋找出第一個大於查詢時間的班次。時間複雜度為 O(n log n)。
 */
