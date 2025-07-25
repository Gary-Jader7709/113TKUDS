package practice_0723;

public class BSTValidation {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean validate(TreeNode node, long min, long max) {
        if (node == null)
            return true;
        if (node.val <= min || node.val >= max)
            return false;
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }

    // 簡化版：找出不符合 BST 的節點數量
    public static int countInvalidNodes(TreeNode root) {
        return countInvalid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static int countInvalid(TreeNode node, long min, long max) {
        if (node == null)
            return 0;
        int invalid = (node.val <= min || node.val >= max) ? 1 : 0;
        return invalid + countInvalid(node.left, min, node.val) + countInvalid(node.right, node.val, max);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(6); // 錯誤節點
        root.right.right = new TreeNode(20);

        System.out.println("是否為合法 BST: " + isValidBST(root)); // false
        System.out.println("不合法節點數: " + countInvalidNodes(root)); // 1
    }
}
