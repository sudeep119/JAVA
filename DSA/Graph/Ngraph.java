package DSA.Graph;
import java.util.*;

public class Ngraph {
    
    List<List<Integer>>listt=new ArrayList<>();
    public void Init(int edges[][],int V){
        for(int i=0;i<V;i++){
            listt.add(new ArrayList<>());
        }
    }
    public void Create(int edges[][],int V){
        int i=0;
        for(int edge[]:edges){
            for(int num:edge){
                listt.get(i).add(num);
            }
            i++;
        }
    }
    public void DFS(List<List<Integer>>listt,boolean visited[],int cur){
        List<Integer>demo=listt.get(cur);
        
        for(int num:demo){
            if(!visited[num]){
                visited[num]=true;
                DFS(listt, visited, num);
            }
        }
    }
    public void BFS(List<List<Integer>>listt,boolean visited[],Queue<Integer>queue){


        while(!queue.isEmpty()){
            int cur=queue.poll();
            System.out.print(cur+" ");
            for(int num:listt.get(cur)){

                if(!visited[num]){
                    visited[num]=true;
                    queue.add(num);
                }
            }
        }
    }

   

    public static void main(String[] args) {
        int edges[][]={{2,4,6,7},{2,4,8},{0,1,3},{2},{0,1},{7},{0},{0,5},{1}};
        int V=9;
        Ngraph obj=new Ngraph();
        obj.Init(edges, V);
        obj.Create(edges, V);
        boolean arr[]=new boolean[V];
        arr[0]=true;
        //obj.DFS(obj.listt, arr, 0);
        Queue<Integer>queue=new LinkedList<>();
        queue.add(0);
        
        boolean arr2[]=new boolean[V];
        arr2[0]=true;
        obj.BFS(obj.listt, arr2,queue);
    
    }
}
