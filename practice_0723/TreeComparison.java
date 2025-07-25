package practice_0723;

public class TreeComparison {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isSame(TreeNode a, TreeNode b) {
        if (a == null && b == null)
            return true;
        if (a == null || b == null || a.val != b.val)
            return false;
        return isSame(a.left, b.left) && isSame(a.right, b.right);
    }

    public static boolean isSubtree(TreeNode root, TreeNode sub) {
        if (root == null)
            return false;
        if (isSame(root, sub))
            return true;
        return isSubtree(root.left, sub) || isSubtree(root.right, sub);
    }

    public static int largestCommonSubtree(TreeNode a, TreeNode b) {
        if (a == null || b == null)
            return 0;
        if (isSame(a, b))
            return countNodes(a);
        return Math.max(largestCommonSubtree(a.left, b), largestCommonSubtree(a.right, b));
    }

    private static int countNodes(TreeNode node) {
        if (node == null)
            return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);
        a.left.left = new TreeNode(4);

        TreeNode b = new TreeNode(2);
        b.left = new TreeNode(4);

        System.out.println("是否為子樹: " + isSubtree(a, b)); // true
        System.out.println("最大公共子樹節點數: " + largestCommonSubtree(a, b)); // 2
    }
}
