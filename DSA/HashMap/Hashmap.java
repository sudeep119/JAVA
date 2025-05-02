package DSA.HashMap;

import java.util.LinkedList;
class MyMap<K,V>{

    MyMap(){
        Bucket(N);
    }

    static final int N=4;
    static final float LF=0.75f;
    static int n;
    private class Node{
        K key;
        V value;

        Node(K key,V value){
            this.key=key;
            this.value=value;
        }
    }

    LinkedList<Node> arr[];

    private int SearchB(LinkedList<Node> current,K k){
        for(int i=0;i<current.size();i++){
           if (current.get(i).key==k){
            return i;
           }
        }
        return -1;
    }
    @SuppressWarnings("unchecked")
    private void Bucket(int N){
        arr=new LinkedList[N];
        for(int i=0;i<arr.length;i++){
            arr[i]=new LinkedList<Node>();
        }
    }

    private int Hash(K key){
        int hashh=key.hashCode();
        return Math.abs(hashh%arr.length);
    }

    public void Rehash(LinkedList<Node> arr[]){
        
        LinkedList<Node> Copy[]=arr;
        Bucket(Copy.length*2);
        n=0;
        for(var array:Copy){
            for(var node:array){
                put(node.key, node.value);
            }
        }
    }

    public void put(K keyy,V value){
        int h=Hash(keyy);
        LinkedList<Node> current=arr[h];
        int ans=SearchB(current,keyy);
        
        if(ans==-1){
            Node node=new Node(keyy, value);
            current.add(node);
            n++;
        }else{
            Node nod=current.get(ans);
            nod.value=value;
        }
        if(n>=arr.length*LF){
            Rehash(arr);
        }
    }


    public V get(K key){
        int h1=Hash(key);
        LinkedList<Node> current=arr[h1];
        int ans=SearchB(current, key);
        if(ans==-1){
            return null;
        }
        Node node=current.get(ans);

        return node.value;
    }

    public V remove(K key){
        int h1=Hash(key);
        LinkedList<Node> current=arr[h1];
        int ans=SearchB(current, key);
        if(ans==-1){
            return null;
        }
        Node node=current.get(ans);
        current.remove(ans);
        n--;
        return node.value;
    }

    public int size(){
        return n;
    }

    public int capacity(){
        return arr.length;
    }
}

public class Hashmap {
    public static void main(String[] args) {
        
        MyMap<Integer,Integer>list=new MyMap<>();
        list.put(5,72);
        list.put(7,73);
        list.put(3,74);
        list.put(2,15);
        list.put(3, 77);
        
        System.out.println(list.size());
        System.out.println(list.capacity());
        System.out.println(list.get(3));
    }
}
