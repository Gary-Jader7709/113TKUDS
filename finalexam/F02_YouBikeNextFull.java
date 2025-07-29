package finalexam;

import java.util.*;

public class F02_YouBikeNextFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(":");
            times[i] = Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
        }

        String[] queryParts = sc.nextLine().split(":");
        int query = Integer.parseInt(queryParts[0]) * 60 + Integer.parseInt(queryParts[1]);

        int left = 0, right = n - 1, result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (times[mid] > query) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (result == -1) {
            System.out.println("No bike");
        } else {
            int h = times[result] / 60;
            int m = times[result] % 60;
            System.out.printf("%02d:%02d\n", h, m);
        }
    }
}

/*
 * Time Complexity: O(log n)
 * 說明：使用二分搜尋找出第一個大於查詢時間的時間點
 */
