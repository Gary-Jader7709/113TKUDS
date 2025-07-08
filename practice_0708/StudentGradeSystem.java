package practice_0708;

import java.util.Arrays;

public class StudentGradeSystem {
    public static void main(String[] args) {
        // 建立學生分數陣列
        int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};
        
        // 計算並顯示成績報告
        displayGradeReport(scores);
        
        // 統計各等級的人數
        int[] gradeCount = countGrades(scores);
        System.out.println("\n統計結果：");
        System.out.println("A 等級人數: " + gradeCount[0]);
        System.out.println("B 等級人數: " + gradeCount[1]);
        System.out.println("C 等級人數: " + gradeCount[2]);
        System.out.println("D 等級人數: " + gradeCount[3]);
        
        // 找出最高分和最低分的學生位置
        int[] maxMinIndexes = findMaxMinIndexes(scores);
        System.out.println("\n最高分學生位置: " + maxMinIndexes[0]);
        System.out.println("最低分學生位置: " + maxMinIndexes[1]);
        
        // 計算高於平均分的學生比例
        double aboveAverageRatio = calculateAboveAverageRatio(scores);
        System.out.println("\n高於平均分的學生比例: " + String.format("%.2f", aboveAverageRatio * 100) + "%");
    }
    
    // 給定分數對應等級
    public static String gradeForScore(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else {
            return "D";
        }
    }
    
    // 統計各等級的人數
    public static int[] countGrades(int[] scores) {
        int[] gradeCount = new int[4]; // 分別對應 A, B, C, D 的人數
        for (int score : scores) {
            if (score >= 90) {
                gradeCount[0]++;
            } else if (score >= 80) {
                gradeCount[1]++;
            } else if (score >= 70) {
                gradeCount[2]++;
            } else {
                gradeCount[3]++;
            }
        }
        return gradeCount;
    }
    
    // 找出最高分和最低分的學生位置
    public static int[] findMaxMinIndexes(int[] scores) {
        int max = scores[0];
        int min = scores[0];
        int maxIndex = 0;
        int minIndex = 0;
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
                maxIndex = i;
            }
            if (scores[i] < min) {
                min = scores[i];
                minIndex = i;
            }
        }
        return new int[] {maxIndex, minIndex};
    }
    
    // 計算高於全班平均分的學生比例
    public static double calculateAboveAverageRatio(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = total / (double) scores.length;
        int countAboveAverage = 0;
        
        for (int score : scores) {
            if (score > average) {
                countAboveAverage++;
            }
        }
        return (double) countAboveAverage / scores.length;
    }
    
    // 顯示完整的成績報告
    public static void displayGradeReport(int[] scores) {
        System.out.println("學生成績報告：");
        System.out.println("---------------------------");
        System.out.printf("%-10s%-10s%-10s\n", "學生編號", "分數", "等級");
        System.out.println("---------------------------");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d%-10d%-10s\n", i + 1, scores[i], gradeForScore(scores[i]));
        }
        System.out.println("---------------------------");
    }
}
