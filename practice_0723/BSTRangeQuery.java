package practice_0723;

import java.util.ArrayList;

public class BSTRangeQuery {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void rangeQuery(TreeNode root, int min, int max, ArrayList<Integer> result) {
        if (root == null)
            return;
        if (root.val > min)
            rangeQuery(root.left, min, max, result);
        if (root.val >= min && root.val <= max)
            result.add(root.val);
        if (root.val < max)
            rangeQuery(root.right, min, max, result);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(15);
        root.right.left = new TreeNode(25);
        root.right.right = new TreeNode(35);

        ArrayList<Integer> result = new ArrayList<>();
        rangeQuery(root, 12, 27, result);
        System.out.println(result); // [15, 20, 25]
    }
}
