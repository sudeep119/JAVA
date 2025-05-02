package DSA.Graph;
import java.util.ArrayList;

public class GraphS {
    ArrayList<Edge>graph[];
    static class Edge{
        int src;
        int dest;

        public Edge(int a,int b){
            src=a;
            dest=b;
        }
    }

    @SuppressWarnings("unchecked")
    public void Create(){
        
        this.graph=new ArrayList[7];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2, 0));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
        graph[6].add(new Edge(6, 5));
       
    }
    public void display(){
        for(int i=0;i<graph.length;i++){
            for(Edge e:graph[i]){
            System.out.print(i+"-->"+e.dest+" ");
            }
            System.out.println();
        }
    }
    public void DFS(ArrayList<Edge>graph[],boolean arr[],int node){
        ArrayList<Edge>ee=graph[node];
        for(Edge e:ee){
            if(arr[e.dest]){
                return;
            }
            arr[e.dest]=true;
            System.out.print(e.dest+" ");
            DFS(graph, arr, e.dest);
        }
        
    }

    public void FindAll(int src,int target,boolean arr[],String ans){
       if(arr[src]){
        return;
       }
       if(src==target){
        System.out.println(ans+src);
        return;
       }
       ans+=src;
       arr[src]=true;
       for(Edge e:graph[src]){
            FindAll(e.dest, target, arr,ans);
       }
       arr[src]=false;
    }
    public static void main(String[] args) {
        GraphS obj=new GraphS();
        obj.Create();
        //obj.display();
        boolean arr[]=new boolean[obj.graph.length];
        //obj.DFS(obj.graph, arr,0);
        obj.FindAll(0, 5, arr,"");
    }
}
