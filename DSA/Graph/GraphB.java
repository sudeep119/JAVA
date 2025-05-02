package DSA.Graph;
import java.util.*;
import java.util.List;

class Alist{
    List<List<pair>>list=new ArrayList<List<pair>>();
    Alist(int nodes){
        for(int i=0;i<nodes;i++){
            list.add(new ArrayList<pair>());
        }
    }
     static class pair{
        int vertex;
        int weight;

        pair(int vertex,int weight){
            this.vertex=vertex;
            this.weight=weight;
        }

        @Override
        public String toString(){
            return (vertex+" "+weight);
        }
     }
    public void Add(int edges[][],int nodes){
        
        int degree[]=new int[nodes];
            for(int edge[]:edges){
                
            List<Integer> listt=new ArrayList<>();
            int a=edge[0];
            int b=edge[1];
            int w=edge[2];
            
            degree[a]++;
            degree[b]++;
            pair obj=new pair(b, w);
            list.get(a).add(obj);
            }
        
        System.out.print(list);

        for(int num:degree){
            System.out.print(num+" ");
        }
    }
}

public class GraphB {
    public static void main(String[] args) {
        int edges[][]={{0,2,10},{0,1,20},{1,3,30}};
        int nodes=4;
        Alist obj=new Alist(nodes);   
        obj.Add(edges,nodes);

    }
}
