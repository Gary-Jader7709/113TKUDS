package midterm;

import java.util.Scanner;

public class Q4_TieredElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // 用電數量
        int[] kWh = new int[n];
        
        for (int i = 0; i < n; i++) {
            kWh[i] = sc.nextInt();
        }
        
        double totalBill = 0;
        for (int i = 0; i < n; i++) {
            double bill = calcBill(kWh[i]);
            System.out.printf("Bill: $%.0f\n", bill);
            totalBill += bill;
        }
        
        double avgBill = totalBill / n;
        System.out.printf("Total: $%.0f\n", totalBill);
        System.out.printf("Average: $%.0f\n", Math.round(avgBill));
        
        sc.close();
    }
    
    private static double calcBill(int kWh) {
        if (kWh <= 120) return kWh * 1.68;
        else if (kWh <= 330) return 120 * 1.68 + (kWh - 120) * 2.45;
        else if (kWh <= 500) return 120 * 1.68 + 210 * 2.45 + (kWh - 330) * 3.70;
        else if (kWh <= 700) return 120 * 1.68 + 210 * 2.45 + 170 * 3.70 + (kWh - 500) * 5.04;
        else if (kWh <= 1000) return 120 * 1.68 + 210 * 2.45 + 170 * 3.70 + 200 * 5.04 + (kWh - 700) * 6.24;
        else return 120 * 1.68 + 210 * 2.45 + 170 * 3.70 + 200 * 5.04 + 300 * 6.24 + (kWh - 1000) * 8.46;
    }
}

/*
 * Time Complexity: O(n)
 * 說明：僅需遍歷一次陣列計算每個電費，時間複雜度為 O(n)。
 */
