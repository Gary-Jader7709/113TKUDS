package Exam;

import java.util.*;

public class F10_BSTRangeSum {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int v) {
            val = v;
        }
    }

    public static TreeNode insert(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        if (val < root.val)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);
        return root;
    }

    public static int rangeSum(TreeNode root, int L, int R) {
        if (root == null)
            return 0;
        if (root.val < L)
            return rangeSum(root.right, L, R);
        if (root.val > R)
            return rangeSum(root.left, L, R);
        return root.val + rangeSum(root.left, L, R) + rangeSum(root.right, L, R);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeNode root = null;
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }
        int L = sc.nextInt(), R = sc.nextInt();
        System.out.println("Sum: " + rangeSum(root, L, R));
    }
}
