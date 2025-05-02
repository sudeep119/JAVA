package DSA.Tree;

import java.util.ArrayList;
import java.util.List;

class treedsa {
    
    public static void main(String[] args) {
        
        tree obj=new tree();
        obj.Create(5);
        tree.TreeNode node=obj.node;
        obj.display(node);
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>listt=new ArrayList<>();
        Solve(node,22,list, listt);
        System.out.println(listt);
    }

    public static void Solve(tree.TreeNode node, int target, List<Integer> list, List<List<Integer>> listt) {
        if (node == null) {
            return; // Base case: if the node is null, do nothing.
        }

        // Add the current node's value to the path and reduce the target.
        list.add(node.val);
        target -= node.val;

        // Check if it's a leaf node and the target is met.
        if (node.left == null && node.right == null && target == 0) {
            listt.add(new ArrayList<>(list)); 
            return;
        }

        // Recur for the left and right subtrees.
        Solve(node.left, target, list, listt);
        Solve(node.right, target, list, listt);

        // Backtrack: remove the current node's value from the path.
        list.remove(list.size() - 1);
    }
}
