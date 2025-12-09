# Answers

## 1. Why does inorder traversal of a BST return elements in sorted order?

Inorder traversal visits the left subtree first, then the node, and then the right subtree. BST stores all smaller values on the left and all larger values on the right, this order by defualt prints the values from smallest to largest. The traversal just follows the way the tree is already organized.

## 2. Give an example of an insertion order that produces a highly unbalanced BST. What does the inorder traversal look like for that tree?

If you insert values in sorted order, like 1, 2, 3, 4, 5, the tree becomes a long chain leaning to the right. Even though the tree is unbalanced, the inorder traversal still prints 1 2 3 4 5, because each node has no left child and the traversal processes them in increasing order.

## 3. a. Rcursive vs iterative traversal
Recursive traversal uses function calls to move through the tree, letting the call stack keep track of what to visit next. Iterative traversal avoids recursion and uses its own stack or queue inside a loop. Recursion is simpler to write, while iteration gives more control and avoids deep recursion.

## b. Depth-first vs breadth-first traversal

Depth-first traversal goes as far down a branch as possible before backing up, which is how preorder, inorder, and postorder work. Breadth-first traversal visits the tree level by level from top to bottom. DFS explores depth; BFS explores levels.

## 4. When might you prefer a breadth-first traversal in a real application?

You would choose BFS when levels matter, such as finding the shortest path in a network or maze, checking how wide or complete a tree is, or when you need to process items in order of their distance from the root.

