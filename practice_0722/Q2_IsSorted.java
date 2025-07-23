package practice_0722;

public class Q2_IsSorted {
    public static boolean isSorted(int[] arr, int index) {
        // 停止條件：只剩一個或沒有元素，一定是排序的
        if (index >= arr.length - 1)
            return true;
        // 如果當前比下一個大，代表不是升序
        if (arr[index] > arr[index + 1])
            return false;
        // 遞迴檢查後面
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 7, 9 };
        System.out.println("是否排序: " + isSorted(nums, 0)); // true
    }
}
