package practice_0722;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
}

public class Q5_InOrderTraversal {
    public static void inOrder(TreeNode root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.print("中序走訪：");
        inOrder(root); // 4 2 5 1 3
    }
}
