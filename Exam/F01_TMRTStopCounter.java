package Exam;

import java.util.*;

public class F01_TMRTStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] stations = new String[n];
        for (int i = 0; i < n; i++) {
            stations[i] = sc.next();
        }
        String start = sc.next();
        String end = sc.next();

        int i1 = -1, i2 = -1;
        for (int i = 0; i < n; i++) {
            if (stations[i].equals(start))
                i1 = i;
            if (stations[i].equals(end))
                i2 = i;
        }

        if (i1 == -1 || i2 == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println(Math.abs(i1 - i2) + 1);
        }
    }
}

/*
 * Time Complexity: O(n)
 * 說明：需線性掃描一次輸入陣列以找出 start 與 end 的索引
 */
