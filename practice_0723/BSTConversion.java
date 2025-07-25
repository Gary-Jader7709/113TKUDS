package practice_0723;

import java.util.*;

public class BSTConversion {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static TreeNode prev = null;

    public static TreeNode bstToDoublyList(TreeNode root) {
        if (root == null)
            return null;
        TreeNode[] head = new TreeNode[1];
        convertHelper(root, head);
        return head[0];
    }

    private static void convertHelper(TreeNode node, TreeNode[] head) {
        if (node == null)
            return;
        convertHelper(node.left, head);
        if (prev == null) {
            head[0] = node;
        } else {
            prev.right = node;
            node.left = prev;
        }
        prev = node;
        convertHelper(node.right, head);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return buildBalanced(nums, 0, nums.length - 1);
    }

    private static TreeNode buildBalanced(int[] nums, int left, int right) {
        if (left > right)
            return null;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildBalanced(nums, left, mid - 1);
        root.right = buildBalanced(nums, mid + 1, right);
        return root;
    }

    public static void convertToGreaterSum(TreeNode root) {
        sum = 0;
        convertSum(root);
    }

    static int sum = 0;

    private static void convertSum(TreeNode node) {
        if (node == null)
            return;
        convertSum(node.right);
        sum += node.val;
        node.val = sum;
        convertSum(node.left);
    }

    public static void inOrderPrint(TreeNode root) {
        if (root == null)
            return;
        inOrderPrint(root.left);
        System.out.print(root.val + " ");
        inOrderPrint(root.right);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        TreeNode root = sortedArrayToBST(arr);
        convertToGreaterSum(root);
        inOrderPrint(root); // [15 14 12 9 5]
    }
}
