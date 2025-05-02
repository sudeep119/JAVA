package DSA.LinkedList;

class List{
    Node head;
    Node tail;
   static class Node{
        int value;
        Node next;

        Node(){

        }
        Node(int value){
            this.value=value;
        }
    }

    public void Insert(int value){
        if(head==null){
        Node node=new Node(value);  
        head=node;
        tail=node;
        }else{
            Node node=new Node(value);
            tail.next=node;
            tail=node;
        }

    }

    public void Reverse(){
        Node temp=head;
        while(temp!=null){
            Insert(temp.value);
            temp=temp.next;
        }
    }
    
    public void midDelete(){
        Node slow=head;
        Node fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        Node prev=head;
        while(prev.next!=slow){
            prev=prev.next;
        }
        
        prev.next=slow.next;
        slow.next=null;
       
    }

    public void display(){
           Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
}
public class Linkedlist {
    public static void main(String[] args) {
        List obj=new List();
        obj.Insert(1);
        obj.Insert(3);
        obj.Insert(5);
        obj.Insert(7);
        
       List obj2=new List();
       obj2.Insert(2);
       obj2.Insert(6);
       obj2.Insert(8);
       obj2.Insert(10);

       List obj3=new List();
        merge(obj, obj2,obj3);
        
        
    }
    public static void merge(List obj,List obj2,List obj3){
        
        List.Node temp=obj.head;
        List.Node temp1=obj2.head;
        List.Node ans=new List.Node(Integer.MIN_VALUE);
        List.Node ans1=ans;
        while(temp!=null&&temp1!=null){
            if(temp.value>temp1.value){
                ans1.next=temp1;
                
                 temp1=temp1.next;
            }
            else{
                obj3.Insert(temp.value);
                ans1.next=temp;
                temp=temp.next;
            }
        }
        
        while(temp1!=null){
                 ans1.next=temp1;
                 temp1=temp1.next;
            }
            while(temp!=null){
                ans1.next=temp;
                 temp=temp.next;
            }
            ans=ans.next;
            while(ans!=null){
                System.out.println(ans.value);
                ans=ans.next;
            }

    }
}
