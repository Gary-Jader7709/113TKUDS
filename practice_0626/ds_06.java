package practice_0626;

public class ds_06 {
    public static void main(String[] args) {
        int[] numbers = {15, 28, 7, 34, 20, 45, 13, 8, 39, 22};

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("陣列中的最大值為：" + max);
    }
}
