import java.util.ArrayList;
import java.util.List;

public class trees2 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {// constructor to initialize;
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // formation of the tree;
    static class binarytree {

        static int idx = -1;

        static Node buildtree(int[] arr) {
            idx++;
            if (arr[idx] == -1) {
                return null;
            }
            Node newnode = new Node(arr[idx]);
            newnode.left = buildtree(arr);
            newnode.right = buildtree(arr);
            return newnode;

        }
    }

    public static void leftview(Node root) {
        if (root == null) {
            return;
        }
        leftview(root.left);
        System.out.print(root.data + " ");

    }

    public static void Inorder(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        Inorder(root.left, list);
        // System.out.print(root.data + " ");
        list.add(root.data);
        Inorder(root.right, list);
    }

    /*
     * / public static boolean commonNode(Node root1, Node root2) {
     * List<Integer> list1 = new ArrayList<>();
     * List<Integer> list2 = new ArrayList<>();
     * 
     * Inorder(root1, list1);
     * Inorder(root2, list2);
     * 
     * /*
     * / for (int i : list1) {
     * for (int j : list2) {
     * if (i == j) {
     * System.out.println(i + " ");
     * }
     * }
     * }
     */
    // return list1.equals(list2);

    // }
    public static List<Integer> delete(Node root, int val) {
        List<Integer> list = new ArrayList<>();
        if (root.data == val) {
            list.remove(val);

        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 7, -1, -1 };
       // int[] arr2 = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 7, -1, -1 };
        Node root = trees2.binarytree.buildtree(arr1);
       // Node root2 = trees2.binarytree.buildtree(arr2);
         leftview(root);
         //Inorder(root);
        // System.out.print(commonNode(root1, root2));
       

    }

}
