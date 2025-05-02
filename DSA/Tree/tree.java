package DSA.Tree;

import java.util.List;
import java.util.*;
public class tree { 
    tree.TreeNode node;
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){
            
        }
        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    public void Create(int val){
            node=new TreeNode(val);
            node.left=new TreeNode(4);
            node.right=new TreeNode(8);
            node.left.left=new TreeNode(11);
            node.left.left.left=new TreeNode(7);
            node.left.left.right=new TreeNode(2);
            node.right.left=new TreeNode(13);
            node.right.right=new TreeNode(4);
            node.right.right.left=new TreeNode(5);
            node.right.right.right=new TreeNode(1);
            // node.right.right.right.right=new TreeNode(8);
            // node.right.right.right.right.right=new TreeNode(8);

            //display(node);
        
    }

    public void populate(TreeNode node,Scanner sc){
        System.out.println("Do u wnt to insert left of"+" "+node.val);
        boolean left=sc.nextBoolean();
        System.out.println("Do u wnt to insert right of"+" "+node.val );
        boolean right=sc.nextBoolean();
        if(left){
            System.out.println("Enter left of "+" "+node.val);
             sc=new Scanner(System.in);
            int value=sc.nextInt();
            node.left=new TreeNode(value);
            populate(node.left, sc);
        }

        if(right){
            System.out.println("Enter right of "+" "+node.val);
            sc=new Scanner(System.in);
            int value=sc.nextInt();
            node.right=new TreeNode(value);
            populate(node.right, sc);
        }

        display(node);
    }

     public void display(TreeNode node){
        if(node==null){
            return;
        }
            System.out.print(node.val+" ");
            display(node.left);
            display(node.right);
            
     }

     public void IOT(TreeNode node,List<Integer> list){
            if(node==null){
                return;
            }
            
            //In Order Traversal
            //left
            IOT(node.left,list);
            list.add(node.val);
            //right
            IOT(node.right,list);

     }
    public static void main(String[] args) {
        tree obj=new tree();
        obj.Create(6);
        //Scanner sc=new Scanner(System.in);
       // obj.populate(obj.node, sc);
       List<Integer>list=new ArrayList<>();
        obj.IOT(obj.node, list);
        obj.display(obj.node);
        System.out.println(list);
    }
}


