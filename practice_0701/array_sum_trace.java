package practice_0701;

import java.util.Scanner;

public class array_sum_trace{
    public static void main(String[] args) {
        // 定義整數陣列
        int[] arr = {1, 3, 5};
        int total = 0;
        
        // 逐一加總陣列中的元素並顯示加總過程
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            // 顯示加總過程
            System.out.println("加總過程：total = " + (total - arr[i]) + " + " + arr[i] + " = " + total);
        }
        
        // 顯示總和
        System.out.println("總和為：" + total);
    }
}
