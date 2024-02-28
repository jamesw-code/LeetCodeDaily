package org.jameskodes;


import org.jameskodes.helpers.TreeNode;

/**
 * Leet Code Daily Challenge 20240228
 * 513. Find Bottom Left Tree Value
 */
public class FindBottomLeftTreeValue {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    public int solution(TreeNode root) {
        int answer= -1;
        if(root.left == null) {
            answer = root.val;
        } else {
            answer = solution(root.left);
        }
        return answer;
    }
}
