package DSA.Graph;
import java.util.*;
import java.util.List;
class CreateG{

    boolean visited[];
    List<List<Integer>>listt;
    List<Integer> show=new ArrayList<>();
    CreateG(int nodes){
        listt=new ArrayList<List<Integer>>();
        visited=new boolean[nodes];
        for(int i=0;i<nodes;i++){
            listt.add(new ArrayList<Integer>());
        }
    }

    public void Insert(int edges[][]){
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];

            listt.get(u).add(v);
        }
    }

    public void DFS(int node){
        List<Integer> demo=listt.get(node);
        for(int num:demo){
            if(visited[num])
            return;
            show.add(num);
            visited[num]=true;
            DFS(num);
        }
    }
    private boolean isVisited(int num){
        if(visited[num])
        return true;
        else
        return false; 
    }
    public void Display(){
        System.out.print(listt);
        System.err.print(show);
    }

    public void BFS(List<List<Integer>>listt,Queue<Integer>queue,boolean visited[]){
        visited[0]=true;
        while(!queue.isEmpty()){
            int cur=queue.poll();
            System.out.print(cur+" ");
            for(int num:listt.get(cur)){
                if(!visited[num]){
                    visited[num]=true;
                    queue.offer(num);
                }
                
            }
        }
    }
}

public class Bfsg {
    public static void main(String[] args) {
        int edges[][]={{0,1},{1,0},{1,2},{2,1},{2,3},{2,4},{3,2},{4,2},{4,5},{4,6},{5,4},{5,7},{6,4},{6,7},{7,5},{7,6}};
        CreateG obj=new CreateG(8);
        obj.Insert(edges);
        //obj.DFS(5);
        obj.Display();
        Queue<Integer>queue=new LinkedList<>();
        queue.add(0);
        boolean visited[]=new boolean[obj.listt.size()];
        obj.BFS(obj.listt, queue,visited);
    }
}
