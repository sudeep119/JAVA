package DSA.Graph;

public class Disjoint {
    private int parent[];
    private int rank[];
    private int size[];
    private int component;

    public Disjoint(int node){
        this.parent=new int[node];
        this.rank=new int[node];
        this.size=new int[node];
        this.component=node;
        for(int i=0;i<node;i++){
            parent[i]=i;
            rank[i]=0;
            size[i]=1;
        }
    }

    public int findParent(int node){
        if(node==parent[node]){
            return parent[node];
        }
        //path compression
        parent[node]=findParent(parent[node]);

        return parent[node];

    }

    public void joinByRank(int node1,int node2){
        int parent1=findParent(node1);
        int parent2=findParent(node2);
        if(parent1==parent2){
            return;
        }
        if(rank[parent1]>rank[parent2]){
            parent[parent2]=parent1;
        }else if(rank[parent2]>rank[parent1]){
            parent[parent1]=parent2;
        }else{
            parent[parent2]=parent1;
            rank[parent1]++;
        }
        component--;
    }
    public void joinBySize(int node1,int node2){
        int parent1=findParent(node1);
        int parent2=findParent(node2);
        if(parent1==parent2){
            return;
        }
        //join by size
        if(size[parent1]>size[parent2]){
            parent[parent2]=parent1;
            size[parent1]+=size[parent2];
        }else if(size[parent2]>size[parent2]){
            parent[parent1]=parent2;
            size[parent2]+=size[parent1];
        }else{
            parent[parent2]=parent1;
            size[parent1]+=size[parent2];
        }
        component--;
    }

    public static void main(String[] args) {
        Disjoint obj=new Disjoint(5);
        obj.joinBySize(0,1);
        obj.joinBySize(2, 3);
        obj.joinBySize(0, 2);
    }
}
