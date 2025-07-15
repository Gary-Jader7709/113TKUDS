package midterm;

import java.util.Scanner;

public class Q7_DailyPowerReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] power = new int[7];
        
        // 讀取一週的電量數據
        for (int i = 0; i < 7; i++) {
            power[i] = sc.nextInt();
        }
        
        // 反轉數據
        for (int i = 0; i < 3; i++) {
            int temp = power[i];
            power[i] = power[6 - i];
            power[6 - i] = temp;
        }
        
        // 輸出反轉後的電量數據
        for (int i = 0; i < 7; i++) {
            System.out.print(power[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}