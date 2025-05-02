package DSA.LinkedList;

class Node{
    int value;
    Node prev;
    Node next;

}
class DL{
    Node head;
    Node tail;
    int size=0;
    public void Insert(int data){
        if(head==null){
            Node node=new Node();
            node.value=data;
            node.prev=null;
            node.next=null;
            head=node;
            tail=node;
            size++;
        }else{
       Node node=new Node(); 
       node.value=data;
       node.next=head;
       node.prev=null;
       head.prev=node;
       tail=head.next;
       head=node;
        size++;
        }
    }

    public void InsertLast(int data){
        Node node=new Node();
        node.value=data;
        node.prev=tail;
        tail.next=node;
        tail=node;
        
        
    }
    
    public int getSize(){
        return size;
    }
    public void DeleteLast(){
        tail.prev.next=null;
        tail=tail.prev;
    }
    public void deleteF(){
       
        head=head.next;
    }

    public void show(){
        Node node=head;
        while(node!=null){
            System.out.print(node.value+" ");
            node=node.next;
        }
       
    }

}
public class Double {
    public static void main(String args[]){
        DL obj=new DL();
        obj.Insert(10);
        obj.Insert(20);
        obj.Insert(30);
        obj.InsertLast(40);
        obj.deleteF();
        obj.show();
        obj.getSize();

    }
}
