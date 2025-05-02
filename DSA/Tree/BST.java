package DSA.Tree;

class BST{
    
    static class Node{
        int val;
        Node left;
        Node right;
        int height;

        Node(int value){
            val=value;
        }

        Node(){

        }
    }

    public Node insert(Node root,int value){
            if(root==null){
                Node node=new Node(value);
                return node;
            }

            if(value<root.val){
                root.left=insert(root.left, value);
            }

            if(value>root.val){
                root.right=insert(root.right, value);
            }
            root.height=Math.max(height(root.left),height(root.right))+1;
            return rotate(root);
    }
    public Node rotate(Node node){

        if(height(node.left)-height(node.right)>1){

            if(height(node.left.left)-height(node.left.right)>0){
                return rightRotate(node);
            }
            if(height(node.left.left)-height(node.left.right)<0){
                node.left=leftRotate(node.left);

                return rightRotate(node);
            }
        }

        if(height(node.left)-height(node.right)<-1){

            if(height(node.right.left)-height(node.right.right)<0){
                return leftRotate(node);
            }
            if(height(node.right.left)-height(node.right.right)>0){
                node.right=rightRotate(node.right);

                return leftRotate(node);
            }
        }
        return node;
    }
    public Node rightRotate(Node node){

        Node p=node;
        Node c=node.left;
        Node t=c.right;

        c.right=p;
        p.left=t;

        p.height=Math.max(height(p.left), height(p.right))+1;
        c.height=Math.max(height(c.left), height(c.right))+1;

        return c;
    }

    public Node leftRotate(Node node){

        Node p=node;
        Node c=p.right;
        Node t=c.left;

        c.left=p;
        p.right=t;
        //extra for understanding 
        p.height=Math.max(height(p.left), height(p.right))+1;
        c.height=Math.max(height(c.left), height(c.right))+1;

        return c;
    }
    public int height(Node root){
        if(root==null){
            return 0;
        }

       return root.height;
    }
    public void display(Node node){
            if(node==null){
                return;
            }
           
            display(node.left);
            System.out.print(node.val+" ");
            display(node.right);
    }
    public static void main(String[] args) {
       BST obj=new BST();
       Node root=null;
      for(int i=0;i<1000;i++){
            root=obj.insert(root,i);
      }
      System.out.print(obj.height(root));
    }
}