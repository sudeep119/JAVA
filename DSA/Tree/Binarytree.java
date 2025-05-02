package DSA.Tree;

import java.util.Scanner;

class BT{

    node root;
    BT(){

    }
    static class node{
        int value;
        node left;
        node right;

        node(int value){
            this.value=value;
        }
    }

    public void insert(Scanner sc){
        System.out.println("Enter the value pf node");
        int value=sc.nextInt();
        root=new node(value);
        populate(sc,root);
    }

    public void populate(Scanner sc,node nodd){
        System.out.println("Do you want to insert the element on left of"+nodd.value);
        boolean left=sc.nextBoolean();

        if(left){
            int value=sc.nextInt();
            nodd.left=new node(value);
            populate(sc, nodd.left);
        }

        System.out.println("Do you want to insert the element on right of"+nodd.value);
        boolean right=sc.nextBoolean();

        if(right){
            int value=sc.nextInt();
            nodd.right=new node(value);
            populate(sc, nodd.right);
        }

    }

    public void display(node nodd){
        if(nodd==null){
            return;
        }
        System.out.print(nodd.value+" ");
        display(nodd.left);
        display(nodd.right);
    }

}

public class Binarytree {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      BT obj=new BT();
      obj.insert(sc);
      obj.display(obj.root);
    }
}

