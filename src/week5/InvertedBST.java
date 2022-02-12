package week5;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class InvertedBST {
    public TreeNode invertTree(TreeNode root) {

        /*
        if(root == null) return null;
        TreeNode temp = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(temp);

        return root; */

        if(root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode left = node.left;
            node.left = node.right;
            node.right = left;

            if(node.left != null) {
                queue.offer(node.left);
            }

            if(node.right != null) {
                queue.offer(node.right);
            }

        }

        return root;

    }
}
