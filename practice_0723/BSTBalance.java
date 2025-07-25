package practice_0723;

public class BSTBalance {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private static int checkHeight(TreeNode node) {
        if (node == null)
            return 0;
        int lh = checkHeight(node.left);
        int rh = checkHeight(node.right);
        if (lh == -1 || rh == -1 || Math.abs(lh - rh) > 1)
            return -1;
        return 1 + Math.max(lh, rh);
    }

    public static int balanceFactor(TreeNode node) {
        return height(node.left) - height(node.right);
    }

    public static TreeNode mostUnbalanced(TreeNode root) {
        return findUnbalanced(root, root, 0);
    }

    private static TreeNode findUnbalanced(TreeNode node, TreeNode worst, int maxDiff) {
        if (node == null)
            return worst;
        int diff = Math.abs(balanceFactor(node));
        if (diff > maxDiff) {
            worst = node;
            maxDiff = diff;
        }
        TreeNode left = findUnbalanced(node.left, worst, maxDiff);
        TreeNode right = findUnbalanced(node.right, worst, maxDiff);
        return Math.abs(balanceFactor(left)) > Math.abs(balanceFactor(right)) ? left : right;
    }

    private static int height(TreeNode node) {
        if (node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);

        System.out.println("是否平衡: " + isBalanced(root)); // false
        System.out.println("根節點平衡因子: " + balanceFactor(root));
    }
}
