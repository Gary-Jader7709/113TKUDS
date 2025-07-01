package practice_0701;

import java.util.Scanner;

public class linear_search_trace {
    public static void main(String[] args) {
        // 宣告並初始化整數陣列
        int[] s = {1, 3, 5, 7, 9};
        
        // 使用 Scanner 讓使用者輸入要搜尋的數字
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入要搜尋的數字：");
        int target = scanner.nextInt();
        
        // 宣告變數表示是否找到目標數字
        boolean found = false;
        
        // 進行線性搜尋並比對每個元素
        for (int i = 0; i < s.length; i++) {
            // 印出比對過程
            System.out.println("比對中：" + target + " vs " + s[i]);
            
            // 如果找到目標數字，則標記並跳出迴圈
            if (s[i] == target) {
                found = true;
                break;
            }
        }
        
        // 根據搜尋結果印出結果
        if (found) {
            System.out.println("結果：找到");
        } else {
            System.out.println("結果：未找到");
        }
        
        // 關閉 Scanner
        scanner.close();
    }
}
