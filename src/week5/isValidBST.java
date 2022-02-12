package week5;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class isValidBST {
        /* this solution can only check upper level node

    boolean leftT = true;
    boolean rightT = true;

    public boolean isValidBST(TreeNode root) {

        //use recursive
        checkLeftBST(root, root.left);
        checkRightBST(root, root.right);
        return leftT && rightT;

    }

    public void checkLeftBST(TreeNode root, TreeNode left) {
        if(left == null) {
            return;
        }
        if(root.val <= left.val) {
            leftT = false;
        }
        checkLeftBST(left, left.left);
        checkRightBST(left, left.right);
    }

    public void checkRightBST(TreeNode root, TreeNode right) {
        if(right == null){
            return;
        }
        if(root.val >= right.val) {
            rightT = false;
        }
        checkLeftBST(right, right.left);
        checkRightBST(right, right.right);
    } */

    List<Integer> lis = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {

        inOrderTraversal(root);
        return isSortedArray();
    }

    public void inOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        lis.add(root.val);
        inOrderTraversal(root.right);
    }

    public boolean isSortedArray() {
        for(int i = 0; i < lis.size() - 1; i++) {
            if (lis.get(i) >= lis.get(i+1)) {
                return false;
            }
        }
        return true;
    }
}
