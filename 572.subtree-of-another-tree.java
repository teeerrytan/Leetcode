/*
 * @lc app=leetcode id=572 lang=java
 *
 * [572] Subtree of Another Tree
 *
 * https://leetcode.com/problems/subtree-of-another-tree/description/
 *
 * algorithms
 * Easy (41.43%)
 * Total Accepted:    94.4K
 * Total Submissions: 227.6K
 * Testcase Example:  '[3,4,5,1,2]\n[4,1,2]'
 *
 * 
 * Given two non-empty binary trees s and t, check whether tree t has exactly
 * the same structure and node values with a subtree of s. A subtree of s is a
 * tree consists of a node in s and all of this node's descendants. The tree s
 * could also be considered as a subtree of itself.
 * 
 * 
 * Example 1:
 * 
 * Given tree s:
 * 
 * ⁠    3
 * ⁠   / \
 * ⁠  4   5
 * ⁠ / \
 * ⁠1   2
 * 
 * Given tree t:
 * 
 * ⁠  4 
 * ⁠ / \
 * ⁠1   2
 * 
 * Return true, because t has the same structure and node values with a subtree
 * of s.
 * 
 * 
 * Example 2:
 * 
 * Given tree s:
 * 
 * ⁠    3
 * ⁠   / \
 * ⁠  4   5
 * ⁠ / \
 * ⁠1   2
 * ⁠   /
 * ⁠  0
 * 
 * Given tree t:
 * 
 * ⁠  4
 * ⁠ / \
 * ⁠1   2
 * 
 * Return false.
 * 
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null || t == null)
            return false;
        if (s.val == t.val) {
            return isSameTree(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
        } else {
            return isSubtree(s.left, t) || isSubtree(s.right, t);
        }

    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p != null && q == null) || (p == null && q != null))
            return false;
        if (p == null && q == null)
            return true;
        if (q.val != p.val)
            return false;
        if (q.val == p.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return true;
    }
}
