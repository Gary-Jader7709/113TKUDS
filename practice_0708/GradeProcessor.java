package practice_0708;

public class GradeProcessor {
    public static void main(String[] args) {
        // 成績陣列，包含8位學生成績
        int[] grades = {78, 85, 92, 67, 88, 95, 73, 90};
        
        // 計算總分
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        
        // 計算平均分數（保留兩位小數）
        double average = total / (double) grades.length;
        
        // 找出最高分和最低分及其索引位置
        int highestGrade = grades[0];
        int lowestGrade = grades[0];
        int highestIndex = 0;
        int lowestIndex = 0;
        
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > highestGrade) {
                highestGrade = grades[i];
                highestIndex = i;
            }
            if (grades[i] < lowestGrade) {
                lowestGrade = grades[i];
                lowestIndex = i;
            }
        }
        
        // 計算有多少位學生的成績超過平均分
        int aboveAverageCount = 0;
        for (int grade : grades) {
            if (grade > average) {
                aboveAverageCount++;
            }
        }
        
        // 輸出結果
        System.out.println("總分: " + total);
        System.out.printf("平均分數: %.2f\n", average);
        System.out.println("最高分: " + highestGrade + "，索引位置: " + highestIndex);
        System.out.println("最低分: " + lowestGrade + "，索引位置: " + lowestIndex);
        System.out.println("超過平均分的學生數: " + aboveAverageCount);
        
        System.out.println("所有成績：");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("學生編號 " + (i + 1) + ": " + grades[i]);
        }
    }
}
