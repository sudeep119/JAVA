package DSA.Graph;
import java.util.*;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims {
    
    public static void main(String[] args) {
        int V=5;
        int arr[][]={{1,2,2},{1,4,4},{2,1,2},{2,3,7},{2,4,8},{3,2,7},{3,4,5},{4,1,4},{4,2,8},{4,3,5},{4,5,3}};
        Create(arr);
       
    }

    public static void Create(int edges[][]){
        List<List<List<Integer>>>listt=new ArrayList<>();
        for(int i=0;i<6;i++){
            listt.add(new ArrayList<>());
        }
        for(int edge[]:edges){
            int ind=edge[0];
            int node=edge[1];
            int w=edge[2];

            List<Integer>list=new ArrayList<>();
            list.add(node);
            list.add(w);
            listt.get(ind).add(list);
        }

        PriorityQueue<int[]>queue=new PriorityQueue<>((a,b)->(a[2]-b[2]));
        int ans[]={-1,1,0};
        queue.add(ans);
        List<List<Integer>>anss=new ArrayList<>();
        boolean vis[]=new boolean[6];
        vis[1]=true;
        Solve(queue,anss,listt,vis);
        System.out.println(anss);
    }

    public static void Solve(PriorityQueue<int[]>queue,List<List<Integer>>anss,List<List<List<Integer>>>listt,boolean vis[]){

        while(!queue.isEmpty()&&anss.size()<5){

        int a[]=queue.poll();
        int parent =a[0];
        int node=a[1];
        int w=a[2];

        if(parent!=-1){
            anss.add(Arrays.asList(parent,node));
        }
        for(List<Integer>list:listt.get(node)){
            if(!vis[list.get(0)]){
                vis[list.get(0)]=true;
                queue.add(new int[]{node,list.get(0),list.get(1)});
            }
            
        }
    }
    }
}
