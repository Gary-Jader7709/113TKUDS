package practice_0626;

public class ds_05 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 8, 2, 7, 10, 4, 6, 9, 1};

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("陣列總和為：" + sum);
    }
}
