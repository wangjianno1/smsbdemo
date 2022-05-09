package com.soar.smsbdemo.keepmoving;

import java.util.ArrayList;
import java.util.List;


/**
 * 求二叉树每层的最大元素
 */
public class Solution_Leecode515 {

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        traverseBiTree(root, 1, results);
        return results;
    }

    /**
     * 一个先序遍历
     * @param node
     * @param depth
     * @param results
     */
    private void traverseBiTree(TreeNode node, int depth, List<Integer> results) {
        if (node == null) {
            return;
        }
        if(results.size() < depth) {
            results.add(node.value);
        } else if (node.value > results.get(depth)) {
            results.set(depth, node.value);
        }

        traverseBiTree(node.left, depth-1, results);
        traverseBiTree(node.right, depth-1, results);
    }
}
