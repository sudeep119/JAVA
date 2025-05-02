package DSA.LinkedList;

public class Plinked {
    Node list = null;

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    

    public void Insert(int val) {
        if (list == null) {
            Node node = new Node(val);
            list = node;
        } else {
            Node node = new Node(val);
            node.next = list;
            list=node;
        }
    }

    public void display() {
        Node temp=list;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Plinked obj = new Plinked();
        obj.Insert(5);
        obj.Insert(6);
        obj.Insert(3);
        obj.display();
    }

}
