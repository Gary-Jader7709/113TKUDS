package finalexam;

import java.util.*;

public class F06_ArraySecondLargest {
    public static int[] findSecondMax(int[] arr, int l, int r) {
        if (r - l == 1) {
            int max = Math.max(arr[l], arr[r]);
            int second = Math.min(arr[l], arr[r]);
            return new int[] { max, second };
        }
        if (l == r)
            return new int[] { arr[l], Integer.MIN_VALUE };

        int m = (l + r) / 2;
        int[] left = findSecondMax(arr, l, m);
        int[] right = findSecondMax(arr, m + 1, r);

        int max, second;
        if (left[0] > right[0]) {
            max = left[0];
            second = Math.max(left[1], right[0]);
        } else {
            max = right[0];
            second = Math.max(right[1], left[0]);
        }
        return new int[] { max, second };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] result = findSecondMax(arr, 0, n - 1);
        System.out.println("SecondMax: " + result[1]);
    }
}

/*
 * Time Complexity: O(n)
 * 說明：以 divide & conquer 方式遞迴合併，整體仍需掃過所有 n 個元素一次
 */
