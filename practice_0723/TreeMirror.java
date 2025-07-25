package practice_0723;

public class TreeMirror {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    private static boolean isMirror(TreeNode a, TreeNode b) {
        if (a == null && b == null)
            return true;
        if (a == null || b == null || a.val != b.val)
            return false;
        return isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }

    public static TreeNode mirror(TreeNode root) {
        if (root == null)
            return null;
        TreeNode temp = root.left;
        root.left = mirror(root.right);
        root.right = mirror(temp);
        return root;
    }

    public static boolean areMirror(TreeNode a, TreeNode b) {
        if (a == null && b == null)
            return true;
        if (a == null || b == null || a.val != b.val)
            return false;
        return areMirror(a.left, b.right) && areMirror(a.right, b.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(3);

        System.out.println("是否對稱: " + isSymmetric(root)); // true

        TreeNode mirrored = mirror(root);
        System.out.println("與原樹是否互為鏡像: " + areMirror(root, mirrored)); // false，因為已經修改原樹
    }
}
