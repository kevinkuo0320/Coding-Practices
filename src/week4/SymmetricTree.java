public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {

        return helper(root.left, root.right);
    }

    boolean helper(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true; // both are null
        if(left == null || right == null) return false; // one of them is null
        if(left.val != right.val) return false; // none of them is null

        return helper(left.left, right.right) && helper(right.left, left.right);
    }
}
