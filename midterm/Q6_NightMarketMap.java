package midterm;

import java.util.Scanner;

public class Q6_NightMarketMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();  // 攤位數
        char[][] map = new char[10][10];
        
        // 填入 # 作為背景
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                map[i][j] = '#';
            }
        }
        
        // 輸入並標記熱門攤位
        for (int i = 0; i < m; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            if (row >= 0 && row < 10 && col >= 0 && col < 10) {
                map[row][col] = '*';
            }
        }
        
        // 列印地圖
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        
        sc.close();
    }
}

/*
 * Time Complexity: O(m + 100)
 * 說明：首先初始化 10x10 地圖為 #，然後根據 m 個座標更新對應位置，時間複雜度為 O(m + 100)，由於地圖固定大小，時間主要由 m 決定。
 */