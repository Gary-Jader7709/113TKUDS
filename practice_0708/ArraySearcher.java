package practice_0708;

public class ArraySearcher {
    public static void main(String[] args) {
        // 建立陣列
        int[] array = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};
        
        // 測試搜尋數字67和100
        int target1 = 67;
        int target2 = 100;
        
        // 搜尋並輸出結果
        int index1 = findElement(array, target1);
        int index2 = findElement(array, target2);
        
        System.out.println("搜尋 " + target1 + " 的結果: 索引位置為 " + index1);
        System.out.println("搜尋 " + target2 + " 的結果: 索引位置為 " + index2);
        
        // 計算出現次數並輸出結果
        int count1 = countOccurrences(array, target1);
        int count2 = countOccurrences(array, target2);
        
        System.out.println("數字 " + target1 + " 在陣列中出現 " + count1 + " 次");
        System.out.println("數字 " + target2 + " 在陣列中出現 " + count2 + " 次");
    }
    
    // 方法：搜尋指定的數值並回傳該元素的索引
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // 找到，回傳索引
            }
        }
        return -1; // 沒找到，回傳 -1
    }
    
    // 方法：計算某個數值在陣列中出現的次數
    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                count++; // 每次找到就增加計數
            }
        }
        return count;
    }
}
