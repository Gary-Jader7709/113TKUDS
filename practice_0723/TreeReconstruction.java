package practice_0723;

import java.util.*;

public class TreeReconstruction {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode buildFromPreIn(int[] preorder, int[] inorder) {
        return buildPreIn(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private static TreeNode buildPreIn(int[] pre, int ps, int pe, int[] in, int is, int ie) {
        if (ps > pe)
            return null;
        TreeNode root = new TreeNode(pre[ps]);
        int i = is;
        while (in[i] != pre[ps])
            i++;
        int leftLen = i - is;
        root.left = buildPreIn(pre, ps + 1, ps + leftLen, in, is, i - 1);
        root.right = buildPreIn(pre, ps + leftLen + 1, pe, in, i + 1, ie);
        return root;
    }

    public static TreeNode buildFromPostIn(int[] post, int[] inorder) {
        return buildPostIn(post, 0, post.length - 1, inorder, 0, inorder.length - 1);
    }

    private static TreeNode buildPostIn(int[] post, int ps, int pe, int[] in, int is, int ie) {
        if (ps > pe)
            return null;
        TreeNode root = new TreeNode(post[pe]);
        int i = is;
        while (in[i] != post[pe])
            i++;
        int leftLen = i - is;
        root.left = buildPostIn(post, ps, ps + leftLen - 1, in, is, i - 1);
        root.right = buildPostIn(post, ps + leftLen, pe - 1, in, i + 1, ie);
        return root;
    }

    public static void inOrderPrint(TreeNode root) {
        if (root != null) {
            inOrderPrint(root.left);
            System.out.print(root.val + " ");
            inOrderPrint(root.right);
        }
    }

    public static void main(String[] args) {
        int[] preorder = { 3, 9, 20, 15, 7 };
        int[] inorder = { 9, 3, 15, 20, 7 };
        TreeNode root = buildFromPreIn(preorder, inorder);
        System.out.print("重建後中序: ");
        inOrderPrint(root);
    }
}
