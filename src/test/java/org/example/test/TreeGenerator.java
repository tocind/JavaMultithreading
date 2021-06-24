package org.example.test;

public class TreeGenerator {
    public static TreeNode getBST() {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(10);
//        root.left = new TreeNode(5);
//        root.left.left = new TreeNode(25);
//        root.left.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(5);
//        root.right = new TreeNode(15);
//        root.right.left = new TreeNode(13);
//        root.right.left.right = new TreeNode(14);
//        root.right.right = new TreeNode(22);
        return root;
    }

    public static TreeNode getBST2() {

        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(-2);
        root.left.left.right = new TreeNode(2);
        root.left.left.right.left = new TreeNode(-1);
        root.left.right = new TreeNode(6);
        root.left.right.right = new TreeNode(8);

        root.right = new TreeNode(30);
        root.right.right = new TreeNode(40);


        return root;
    }

    public static TreeNode getBST3() {

        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(20);
        root.right = new TreeNode(30);


        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(50);
        root.right.left.right = new TreeNode(60);

        return root;
    }
}
