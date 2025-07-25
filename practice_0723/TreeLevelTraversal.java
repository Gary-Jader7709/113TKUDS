package practice_0723;

import java.util.*;

public class TreeLevelTraversal {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean zigzag = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (zigzag)
                    level.add(0, node.val);
                else
                    level.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            result.add(level);
            zigzag = !zigzag;
        }
        return result;
    }

    public static void printLastNodeEachLevel(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode last = null;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                last = node;
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            System.out.println("該層最後節點: " + last.val);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        System.out.println("層序之字形走訪: " + levelOrder(root));
        printLastNodeEachLevel(root);
    }
}
