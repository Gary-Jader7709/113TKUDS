package practice_0723;

import java.util.*;

public class TreeDistance {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static int distance(TreeNode root, int a, int b) {
        TreeNode lca = findLCA(root, a, b);
        return depth(lca, a, 0) + depth(lca, b, 0);
    }

    private static TreeNode findLCA(TreeNode root, int a, int b) {
        if (root == null || root.val == a || root.val == b)
            return root;
        TreeNode left = findLCA(root.left, a, b);
        TreeNode right = findLCA(root.right, a, b);
        return (left != null && right != null) ? root : (left != null ? left : right);
    }

    private static int depth(TreeNode root, int val, int d) {
        if (root == null)
            return -1;
        if (root.val == val)
            return d;
        int left = depth(root.left, val, d + 1);
        if (left != -1)
            return left;
        return depth(root.right, val, d + 1);
    }

    public static int diameter(TreeNode root) {
        max = 0;
        height(root);
        return max;
    }

    static int max = 0;

    private static int height(TreeNode node) {
        if (node == null)
            return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        max = Math.max(max, lh + rh);
        return 1 + Math.max(lh, rh);
    }

    public static void printNodesAtDistance(TreeNode root, int k) {
        printDistance(root, k, 0);
    }

    private static void printDistance(TreeNode node, int k, int depth) {
        if (node == null)
            return;
        if (depth == k)
            System.out.print(node.val + " ");
        printDistance(node.left, k, depth + 1);
        printDistance(node.right, k, depth + 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);

        System.out.println("節點 4 與 5 距離: " + distance(root, 4, 5)); // 2
        System.out.println("樹的直徑: " + diameter(root)); // 3
        System.out.print("距離根節點 2 的節點: ");
        printNodesAtDistance(root, 2);
    }
}
