package org.example.test;

public class TreeADT {

    public static void printLeftView(TreeNode root, int level, boolean[] firstLevels) {

        if (root == null)
            return;

        if (firstLevels[level] == false) {
            processDataPrintLevel(root, level);
            firstLevels[level] = true;
        }
//        firstLevels[level] = true;
        printLeftView(root.right, level + 1, firstLevels);
        printLeftView(root.left, level + 1, firstLevels);
//        printLeftView(root.right, level + 1, firstLevels);

    }

//zz catentdex pubish = 1

    public static void morrisTraversal(TreeNode root) {
//        TreeNode currentNode = root;
//        while (currentNode != null) {
//            if (currentNode.left == null && currentNode.right != null) {
//                processNodeData(currentNode);
//                currentNode = currentNode.right;
//            } else if (currentNode.left != null) { // Find inorder predecessor of root.
//                TreeNode ptr = currentNode.left;
//                while (true) {
//                    if (ptr.right == null && ptr.right) {
//                        ptr.right = currentNode;
//                        break;
//                    } else {
//                        ptr = ptr.right;
//                    }
//                }
//            }
//        }
    }

    public static TreeNode lowestCommonAncester(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null)
            return null;

        if (root == p && root == q)
            return root;

        TreeNode left = lowestCommonAncester(root.left, p, q);
        TreeNode right = lowestCommonAncester(root.right, p, q);

        if (left != null && right != null) {
            return root;
        } else {
            if (left != null)
                return left;
            else
                return right;
        }
    }

    public static boolean isIdentical(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        if (t1 != null && t2 != null) {
            if (
                    (t1.val == t2.val)
                            && isIdentical(t1.left, t2.left)
                            && isIdentical(t1.right, t2.right)

            )
                return true;
        }
        return false;
    }

    public static boolean isValidBST(TreeNode root) {

        if (root == null)
            return false;
        else
            return validate2(root, 0, 0);

    }

    public static boolean validate2(TreeNode root, int max, int min) {

        if (root.left != null && root.right != null) {
            if (root.val > root.left.val) {
                max = root.left.val;
            } else {
                max = root.val;
            }

            if (root.val < root.right.val) {
                min = root.right.val;
            } else {
                min = root.val;
            }

        } else if (root.left != null && root.right == null) {

        } else if (root.left == null && root.right != null) {

        }
        return false;
    }

    public static boolean findANode(TreeNode root, int key) {

        if (root == null)
            return false;

        if (root != null && root.val == key) {
            return true;
        }

        return (findANode(root.left, key) || findANode(root.right, key));
    }

    public static void printPreorder(TreeNode root) {
        if (root == null)
            return;

        processNodeData(root);
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void printLevels(TreeNode root, int level) {
        if (root == null)
            return;

        processDataPrintLevel(root, level);
        printLevels(root.left, level + 1);
        printLevels(root.right, level + 1);
    }

    private static void processDataPrintLevel(TreeNode root, int level) {
        System.out.println(" d- " + root.val + " l- " + level);
    }

    private static void processNodeData(TreeNode n) {
        System.out.print(" " + n.val);
    }

}
