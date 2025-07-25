package practice_0723;

import java.util.*;

public class TreePathProblems {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static List<List<Integer>> allPaths(TreeNode root) {
        List<List<Integer>> paths = new ArrayList<>();
        dfs(root, new ArrayList<>(), paths);
        return paths;
    }

    private static void dfs(TreeNode node, List<Integer> path, List<List<Integer>> result) {
        if (node == null)
            return;
        path.add(node.val);
        if (node.left == null && node.right == null) {
            result.add(new ArrayList<>(path));
        } else {
            dfs(node.left, path, result);
            dfs(node.right, path, result);
        }
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<List<Integer>> paths = allPaths(root);
        System.out.println("所有根到葉的路徑：");
        for (List<Integer> path : paths) {
            System.out.println(path);
        }
    }
}
