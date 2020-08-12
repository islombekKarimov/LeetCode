package LeetCode.algorithms;

/**
 * Created by Islombek Karimov on 27.05.2020.
 */
public class RangeSumBST {
    int sum = 0;

    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        sum =0;
        defSum(root, L, R);
        return sum;
    }

    public void defSum(TreeNode treeNode, int L, int R) {
        if (treeNode != null) {
            if (L <= treeNode.val && R >= treeNode.val) {
                sum += treeNode.val;
            }
            if (L < treeNode.val){
                defSum(treeNode.left, L, R);
            }
            if (R > treeNode.val){
                defSum(treeNode.right, L, R);
            }
        }


    }

    
}
