package DSA.Graph;

import java.util.PriorityQueue;

class Kruskel{

    private int rank[];
    private int parent[];
    private int component;

    Kruskel(int nodes){
        rank=new int[nodes];
        parent=new int[nodes];
        component=nodes;

        for(int i=0;i<nodes;i++){
            rank[i]=0;
            parent[i]=i;
        }
    }

    public int findParent(int node){

        if(node==parent[node]){
            return node;
        }

        //path compression
        parent[node]=findParent(parent[node]);

        return parent[node];
    }

    public int joinBySize(int node1,int node2){
        int parent1=findParent(node1);
        int parent2=findParent(node2);

        if(parent1==parent2){
            return 0;
        }
        //union
        if(rank[parent1]>rank[parent2]){
            parent[parent2]=parent1;
        }else if(rank[parent2]>rank[parent1]){
            parent[parent1]=parent2;
        }else{
            parent[parent2]=parent1;
            rank[parent1]++;
        }
        component--;
        return 1;
    }
    public void Solve(PriorityQueue<int[]>queue){
        int sum=0;
        
        while(!queue.isEmpty()){
            int a[]=queue.poll();
            if(joinBySize(a[0],a[1])==1){
                System.out.print(a[0]+"->"+a[1]+" ");
                sum+=a[2];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        
        int arr[][]={{1,2,2},{1,4,4},{2,3,7},{2,4,8},{3,4,5},{4,5,3}};
        PriorityQueue<int[]>queue=new PriorityQueue<>((int a[],int b[])->(a[2]-b[2]));
        for(int ar[]:arr){
            queue.add(ar);
        }
        Kruskel obj=new Kruskel(6);
        obj.Solve(queue);
        for(int i=1;i<obj.parent.length;i++){
            System.out.print(obj.parent[i]+" ");
        }
    }
}