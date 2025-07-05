package practice_0701;

public class array_mode_count {
    public static void main(String[] args) {
        // 自訂整數陣列
        int[] arr = {3, 7, 3, 1, 1, 1};
        
        // 記錄目前最多次數的元素和次數
        int mode = arr[0];
        int modeCount = 1;
        
        // 使用巢狀迴圈進行比對
        for (int i = 0; i < arr.length; i++) {
            int count = 1; // 每個元素的計數，最少為 1（自己本身）
            for (int j = i + 1; j < arr.length; j++) {
                // 如果找到相同的元素，增加計數
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            
            // 顯示比對過程
            System.out.println("比對中：" + arr[i] + " 出現次數 = " + count);
            
            // 如果目前的元素出現次數更多，更新眾數
            if (count > modeCount) {
                mode = arr[i];
                modeCount = count;
            }
        }
        
        // 顯示結果
        System.out.println("眾數為：" + mode + "，出現 " + modeCount + " 次");
    }
}