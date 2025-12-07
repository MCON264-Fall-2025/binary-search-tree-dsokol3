package bst;

import java.util.*;

public class TraversalExercises {


    // Iterative preorder using a stack
    public static <T extends Comparable<T>> List<T> preorderIterative(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        // TODO: implement iterative preorder using Deque as a stack
        // Hint: push root; while stack not empty:
        //   pop node, visit it, then push right child, then left child
        if (root == null) return result;

        Deque<TreeNode<T>> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode<T> node = stack.pop();
            result.add(node.value);

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return result;
    }

    // Iterative inorder using a stack
    public static <T extends Comparable<T>> List<T> inorderIterative(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        // TODO: implement iterative inorder
        // Hint: use a pointer 'curr' and a stack:
        //   while (curr != null || !stack.isEmpty()) { ... }
        Deque<TreeNode<T>> stack = new ArrayDeque<>();
        TreeNode<T> curr = root;

        while (curr != null || !stack.isEmpty()) {

            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            result.add(curr.value);

            curr = curr.right;
        }

        return result;
    }

    // Optional / challenge: iterative postorder
    public static <T extends Comparable<T>> List<T> postorderIterative(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        // TODO (challenge): implement iterative postorder
        // You may use two stacks, or one stack with a previous-node pointer.
        if (root == null) return result;

        Deque<TreeNode<T>> s1 = new ArrayDeque<>();
        Deque<TreeNode<T>> s2 = new ArrayDeque<>();

        s1.push(root);

        while (!s1.isEmpty()) {
            TreeNode<T> node = s1.pop();
            s2.push(node);

            if (node.left != null) {
                s1.push(node.left);
            }
            if (node.right != null) {
                s1.push(node.right);
            }
        }

        while (!s2.isEmpty()) {
            result.add(s2.pop().value);
        }

        return result;
    }

    // Practice version of level-order
    public static <T extends Comparable<T>> List<T> levelOrderUsingQueue(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        // TODO: implement BFS using a Queue<TreeNode<T>>
        if (root == null) return result;

        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.add(root);   // Start with the root

        while (!queue.isEmpty()) {
            TreeNode<T> node = queue.remove();  // Take from front of queue
            result.add(node.value);             // Visit node

            if (node.left != null) queue.add(node.left);   // Add left child
            if (node.right != null) queue.add(node.right); // Add right child
        }

        return result;
    }
}

