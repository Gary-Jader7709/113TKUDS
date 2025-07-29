package Exam;

import java.util.*;

public class F04_TieredIncomeTax {
    public static int calculateTax(int income) {
        int[] brackets = { 540000, 1210000, 2420000, 4530000 };
        double[] rates = { 0.05, 0.12, 0.20, 0.30, 0.40 };
        int[] baseTax = { 0, 37800, 134600, 376600, 829600 };

        for (int i = brackets.length - 1; i >= 0; i--) {
            if (income > brackets[i]) {
                return baseTax[i + 1] + (int) ((income - brackets[i]) * rates[i + 1]);
            }
        }
        return (int) (income * rates[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int income = sc.nextInt();
            int tax = calculateTax(income);
            sum += tax;
            System.out.println("Tax: $" + tax);
        }

        System.out.println("Average: $" + (sum / n));
    }
}

/*
 * Time Complexity: O(n)
 * 說明：每個收入值計算稅額皆為常數時間，共處理 n 筆輸入
 */
