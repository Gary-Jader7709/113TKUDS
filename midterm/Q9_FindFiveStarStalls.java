package midterm;

import java.util.Scanner;

public class Q9_FindFiveStarStalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // 攤位數
        double[] scores = new double[n];
        
        // 讀取攤位評分
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextDouble();
        }
        
        boolean found = false;
        
        // 查找五星評分攤位
        for (int i = 0; i < n; i++) {
            if (scores[i] == 5.0) {
                if (found) {
                    System.out.print(" ");
                }
                System.out.print(i);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("None");
        }
        
        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：遍歷一次陣列找出評分為 5 的攤位，時間複雜度為 O(n)。
 */
