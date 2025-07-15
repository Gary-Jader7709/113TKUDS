package midterm;

import java.util.Scanner;

public class Q10_ArrayToStringUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // 陣列大小
        int[] arr = new int[n];
        
        // 讀取陣列數值
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 將陣列轉為字串
        System.out.println(arrayToString(arr));
        
        sc.close();
    }
    
    public static String arrayToString(int[] arr) {
        if (arr == null) return "null";
        if (arr.length == 0) return "[]";
        
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：需要遍歷陣列一次來生成字串，時間複雜度為 O(n)。
 */
