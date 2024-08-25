
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class tree1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    // for the formation of the tree;
    static class BinaryTree {
        static int idx = -1;

        public static Node buildtree(int arr[]) {
            idx++;

            if (arr[idx] == -1) {
                return null;

            }
            Node newNode = new Node(arr[idx]);// creating a new node;
            newNode.left = buildtree(arr);// to build left side of a tree recurssively
            newNode.right = buildtree(arr);// to build right side of a tree recurssively
            return newNode;

        }
    }
    // DFS Traversal;

    public static void preorder(Node root) {// preOrder traversal;
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void Inorder(Node root) { // InOrder traversal;
        if (root == null) {
            return;
        }

        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);

    }

    public static void postorder(Node root) {// postorder traversal;
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }

    // BFS Traversal;
    public static void levelorder(Node root) {// levelOrder Traversal;

        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();// creating a queue;
        q.add(root);// adding root node to the queue;
        q.add(null);
        while (!q.isEmpty()) {

            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }

                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    // reverse Level Order traversal
    public ArrayList<Integer> reverseLevelOrder(Node node) {
        ArrayList<Integer> list = new ArrayList<>();
        if (node == null) {
            return list;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            list.add(curr.data);
            if (curr.right != null) {
                q.add(curr.right);
            }
            if (curr.left != null) {
                q.add(curr.left);
            }

        }
        Collections.reverse(list);
        return list;
    }

    public static void sumlevel(Node root, int level) {// sum of the nodes at kth level;
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();// creating a queue;
        q.add(root);// adding root node to the queue;
        q.add(null);
        int sum = 0;
        int k = 0;
        while (!q.isEmpty()) {

            Node currNode = q.remove();

            if (currNode == null) {
                System.out.println();
                k++;
                if (level == k) {
                    System.out.println(sum);
                }
                sum = 0;
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {
                // System.out.print(currNode.data + " ");

                sum = sum + currNode.data;

                if (currNode.left != null) {
                    q.add(currNode.left);
                }

                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countofNodes(Node root) { // count of Nodes;
        if (root == null) {
            return 0;
        }
        int leftnodes = countofNodes(root.left);
        int rightnodes = countofNodes(root.right);
        return leftnodes + rightnodes + 1;
    }

    public static int SumofNodes(Node root) { // sum of Nodes;
        if (root == null) {
            return 0;
        }
        int leftsum = SumofNodes(root.left);
        int rightsum = SumofNodes(root.right);
        return leftsum + rightsum + root.data;
    }

    public static int height(Node root) { // height of Tree;
        if (root == null) {
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        int myHeight = Math.max(leftheight, rightheight);
        return myHeight + 1;
    }

    public static int Diameter(Node root) { // Diameter of Tree;//higher time complexity(n2)
        if (root == null) {
            return 0;
        }
        int Dia1 = Diameter(root.left);
        int Dia2 = Diameter(root.right);
        int Dai3 = height(root.left) + height(root.right) + 1;
        return Math.max(Dai3, Math.max(Dia1, Dia2));
    }

    static class Treeinfo {// linear time complexcity;
        int ht;
        int diam;

        Treeinfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static Treeinfo Diameter2(Node root) {
        if (root == null) {
            return new Treeinfo(0, 0);
        }
        Treeinfo left = Diameter2(root.left);
        Treeinfo right = Diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht);

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;
        int mydiam = Math.max(diam3, Math.max(diam2, diam1));
        Treeinfo myinfo = new Treeinfo(myHeight, mydiam);
        return myinfo;

    }

    // to find the maximum node value in BST;
    public static int max(Node root) {
        if (root == null) {
            return 0;
        }
        int left = max(root.left);
        int right = max(root.right);
        int maxNO = Math.max(root.data, Math.max(left, right));
        return maxNO;

    }

    // to insert a newnode in the BST;
    public static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;

    }

    /*
     * public static Node insertbst(Node root, int data) {
     * 
     * if (root == null) {
     * return new Node(data);
     * // Node curr = root;
     * }
     * Node curr = root;
     * 
     * while (true) {
     * 
     * if (curr.data < data) {
     * if (curr.right != null) {
     * curr = curr.right;
     * } else {
     * curr.right = new Node(data);
     * break;
     * }
     * 
     * } else {
     * if (curr.left != null) {
     * curr = curr.left;
     * 
     * } else {
     * curr.left = new Node(data);
     * break;
     * }
     * }
     * }
     * return root;
     * }/
     */

    // to search a given node in BST;
    public static int search(Node root, int value) {
        if (root == null) {
            return -1;
        }

        if (root.data == value) {
            return root.data;
        }
        if (value < root.data) {
            return search(root.left, value);
        }
        return search(root.right, value);

    }

    // to find the Lowest-common Anscestor of a BST;
    public static int LCA(Node root, int d1, int d2) {
        if (d1 < root.data && d2 < root.data) {
            return LCA(root.left, d1, d2);
        } else if (d1 > root.data && d2 > root.data) {
            return LCA(root.right, d1, d2);
        } else {
            return root.data;
        }
    }

    // to check the given BST is a Sum tree or not;
    static boolean isSumTree(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        int left = sumofnodes(root.left);
        int right = sumofnodes(root.right);
        if (left + right != root.data) {
            return false;
        }
        return isSumTree(root.left) && isSumTree(root.right);
    }

    static int sumofnodes(Node root) {
        if (root == null) {
            return 0;
        }
        return sumofnodes(root.left) + sumofnodes(root.right) + root.data;
    }

    // to check the given tree is a Binary search tree or not;
    static boolean isBST(Node root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static boolean isValid(Node root, long minValue, long maxValue) {
        if (root == null) {
            return true;
        }
        if (root.data <= minValue || root.data >= maxValue) {
            return false;
        }
        return isValid(root.left, minValue, root.data) && isValid(root.right, root.data, maxValue);
    }

    // to check wheather a tree is balanced or not;
    boolean isBalanced(Node root) {

        return checkHeight(root) != -1;
    }

    int checkHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int LH = checkHeight(root.left);
        int RH = checkHeight(root.right);

        if (LH == -1 || RH == -1) {
            return -1;
        }
        if (Math.abs(LH - RH) > 1) {
            return -1;
        }

        return 1 + Math.max(LH, RH);

    }

    public static void leftview(Node root) {
        if (root == null) {
            return;
        }
        leftview(root.left);
        System.out.print(root.data + " ");
        // leftview(root.right);

    }

    // top-view of a binary tree;
    static ArrayList<Integer> topView(Node root) {

        Queue<pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.add(new pair(0, root));
        while (!q.isEmpty()) {
            pair curr = q.poll();
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node.data);
            }
            if (curr.node.left != null) {
                q.add(new pair(curr.hd - 1, curr.node.left));
            }
            if (curr.node.right != null) {
                q.add(new pair(curr.hd + 1, curr.node.right));
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> m : map.entrySet())
            list.add(m.getValue());

        return list;

    }

    // custom class to store horizontal distance and node;
    static class pair {

        int hd;
        Node node;

        pair(int hd, Node node) {
            this.hd = hd;
            this.node = node;
        }
    }

    // left-view of a binary tree;
    ArrayList<Integer> leftView(Node root) {

        ArrayList<Integer> l = new ArrayList<>();
        lv(root, l, 0);
        return l;
    }

    void lv(Node root, ArrayList<Integer> l, int lvl) {
        if (root == null)
            return;

        if (l.size() == lvl) {// l.size()=no of elements in the list;
            l.add(root.data);
        }

        lv(root.left, l, lvl + 1);
        lv(root.right, l, lvl + 1);

    }

    // Right-View of a binary tree;
    ArrayList<Integer> leftView1(Node root) {

        ArrayList<Integer> l = new ArrayList<>();
        lv(root, l, 0);
        return l;
    }

    void lv1(Node root, ArrayList<Integer> l, int lvl) {
        if (root == null)
            return;

        if (l.size() == lvl) {
            l.add(root.data);
        }

        lv(root.right, l, lvl + 1);
        lv(root.left, l, lvl + 1);

    }

    // array to BST
    public int[] sortedArrayToBST(int[] nums) {
        int[] arr = new int[nums.length];
        int[] k = new int[1];
        divide(0, nums.length - 1, nums, arr, k);
        return arr;
    }

    void divide(int start, int end, int[] nums, int[] arr, int[] k) {

        if (start > end) {
            return;
        }

        int mid = (start + end) / 2;
        arr[k[0]] = nums[mid];
        k[0]++;
        divide(start, mid - 1, nums, arr, k);
        divide(mid + 1, end, nums, arr, k);

    }

    // to count the no of leaves
    int countLeaves(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeaves(node.left) + countLeaves(node.right);
    }

    // Root to leaf path sum
    boolean hasPathSum(Node root, int S) {

        if (root == null) {
            return false;
        }
        if (root.data > S) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return S == root.data;
        }

        return hasPathSum(root.left, S - root.data) || hasPathSum(root.right, S - root.data);

    }

    // Print all nodes that don't have sibling
    ArrayList<Integer> noSibling(Node node) {
        ArrayList<Integer> list = new ArrayList<>();

        result(node, list);
        if (list.isEmpty()) {
            list.add(-1);
        }
        Collections.sort(list);
        return list;
    }

    void result(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }

        if (node.left != null && node.right == null) {

            list.add(node.left.data);

        }

        else if (node.right != null && node.left == null) {

            list.add(node.right.data);

        }

        result(node.left, list);
        result(node.right, list);

    }

    // public static Node delete(Node root, int val)
    public static void main(String[] args) {
        int[] arr = { 50, 25, 12, -1, -1, 37, -1, -1, 75, 62, -1, -1, 87, -1, -1 };
        // BinaryTree bt = new BinaryTree();
        Node root = tree1.BinaryTree.buildtree(arr);
        // System.out.println(root.data);
        // System.out.println(Diameter2(root).diam);
        // System.out.println(max(root));

        // insert(root, 10);
        // System.out.println(search(root, 63));
        // sumlevel(root, 2);
        // Inorder(root);
        // System.out.println(LCA(root, 62, 87));
        // System.out.println(delete(root, 12));
        // System.out.println(isSumTree(root));
        // System.out.println(isBST(root));
        // leftview(root);
        // preorder(root);
        // preorder(root);
        postorder(root);

    }

}
