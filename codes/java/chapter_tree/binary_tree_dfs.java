/*
 * File: binary_tree_dfs.java
 * Created Time: 2022-11-25
 * Author: Krahets (krahets@163.com)
 */

package chapter_tree;

import include.*;
import java.util.*;

public class binary_tree_dfs {
    // 初始化列表，用于存储遍历序列
    static ArrayList<Integer> list = new ArrayList<>();

    /* 前序遍历 */
    static void preOrder(TreeNode root) {
        if (root == null) return;
        // 访问优先级：根结点 -> 左子树 -> 右子树
        list.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    /* 中序遍历 */
    static void inOrder(TreeNode root) {
        if (root == null) return;
        // 访问优先级：左子树 -> 根结点 -> 右子树
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

    /* 后序遍历 */
    static void postOrder(TreeNode root) {
        if (root == null) return;
        // 访问优先级：左子树 -> 右子树 -> 根结点
        postOrder(root.left);
        postOrder(root.right);
        list.add(root.val);
    }

    public static void main(String[] args) {
        /* 初始化二叉树 */
        // 这里借助了一个从数组直接生成二叉树的函数
        TreeNode root = TreeNode.arrToTree(new Integer[] { 
            1, 2, 3, 4, 5, 6, 7, null, null, null, null, null, null, null, null});
        System.out.println("\n初始化二叉树\n");
        PrintUtil.printTree(root);

        /* 前序遍历 */
        list.clear();
        preOrder(root);
        System.out.println("\n前序遍历的结点打印序列 = " + list);

        /* 中序遍历 */
        list.clear();
        inOrder(root);
        System.out.println("\n中序遍历的结点打印序列 = " + list);

        /* 后序遍历 */
        list.clear();
        postOrder(root);
        System.out.println("\n后序遍历的结点打印序列 = " + list);
    }
}
