package practice_0708;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
        // 建立陣列
        int[] array = {3, 7, 1, 9, 4, 6, 8, 2, 5};
        
        // 測試列印陣列
        System.out.println("原始陣列：");
        printArray(array);
        
        // 測試反轉陣列
        reverseArray(array);
        System.out.println("反轉後的陣列：");
        printArray(array);
        
        // 測試複製陣列
        int[] copiedArray = copyArray(array);
        System.out.println("陣列的副本：");
        printArray(copiedArray);
        
        // 測試找出第二大的數值
        int secondLargest = findSecondLargest(array);
        System.out.println("第二大的數值：" + secondLargest);
    }
    
    // 列印陣列內容
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    
    // 反轉陣列（原地修改）
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            // 交換元素
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    
    // 複製陣列
    public static int[] copyArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
    
    // 找出第二大的數值
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        return secondLargest;
    }
}
