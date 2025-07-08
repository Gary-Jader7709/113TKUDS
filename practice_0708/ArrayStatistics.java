package practice_0708;

public class ArrayStatistics {
    public static void main(String[] args) {
        // 建立陣列
        int[] array = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};
        
        // 計算統計數據
        int total = calculateSum(array);
        double average = total / (double) array.length;
        int maxValue = findMax(array);
        int minValue = findMin(array);
        int maxIndex = findMaxIndex(array, maxValue);
        int minIndex = findMinIndex(array, minValue);
        int greaterThanAverageCount = countGreaterThanAverage(array, average);
        int evenCount = countEvenNumbers(array);
        int oddCount = countOddNumbers(array);
        
        // 輸出統計結果
        System.out.println("統計結果：");
        System.out.printf("%-20s%-10s\n", "統計項目", "數值");
        System.out.println("-----------------------------------");
        System.out.printf("%-20s%-10d\n", "總和", total);
        System.out.printf("%-20s%-10.2f\n", "平均值", average);
        System.out.printf("%-20s%-10d\n", "最大值", maxValue);
        System.out.printf("%-20s%-10d\n", "最小值", minValue);
        System.out.printf("%-20s%-10d\n", "最大值索引", maxIndex);
        System.out.printf("%-20s%-10d\n", "最小值索引", minIndex);
        System.out.printf("%-20s%-10d\n", "大於平均值的數字數量", greaterThanAverageCount);
        System.out.printf("%-20s%-10d\n", "偶數的數量", evenCount);
        System.out.printf("%-20s%-10d\n", "奇數的數量", oddCount);
    }
    
    // 計算總和
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
    
    // 找出最大值
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    // 找出最小值
    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    
    // 找出最大值的索引
    public static int findMaxIndex(int[] array, int maxValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue) {
                return i;
            }
        }
        return -1; // 如果找不到，回傳-1
    }
    
    // 找出最小值的索引
    public static int findMinIndex(int[] array, int minValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minValue) {
                return i;
            }
        }
        return -1; // 如果找不到，回傳-1
    }
    
    // 計算大於平均值的數字數量
    public static int countGreaterThanAverage(int[] array, double average) {
        int count = 0;
        for (int num : array) {
            if (num > average) {
                count++;
            }
        }
        return count;
    }
    
    // 計算偶數數量
    public static int countEvenNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    
    // 計算奇數數量
    public static int countOddNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
