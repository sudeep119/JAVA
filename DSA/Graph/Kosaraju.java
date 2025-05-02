package DSA.Graph;

import java.util.*;
public class Kosaraju {
    
    public static void main(String[] args) {
        int edges[][]={{0,1},{1,2},{1,3},{2,0},{3,4},{4,5},{5,6},{5,8},{6,7},{7,4},{9,8}};
        Create(edges);
       
    }

    public static void Create(int edges[][]){
        int V=edges.length-1;
        List<List<Integer>>listt1=new ArrayList<>();
        for(int i=0;i<V;i++){
            listt1.add(new ArrayList<>());
        }

        for(int edge[]:edges){
            int index=edge[0];
            int vertex=edge[1];

            listt1.get(index).add(vertex);
        }
        boolean visited[]=new boolean[V];
        Stack<Integer>stack=new Stack<>();
        // visited[0]=true;
        for(int i=0;i<listt1.size();i++){
            if(!visited[i]){
                visited[i]=true;
            Step1(listt1,stack,i, visited);
            }
        }
        // System.out.println(stack);
        // System.out.println(listt1);
        List<List<Integer>>reverse=Step2(edges);
        List<List<Integer>>ansL=new ArrayList<>();
        List<Integer>list;
        boolean vis[]=new boolean[stack.size()];

        while(!stack.isEmpty()){
            int node=stack.peek();
            if(!vis[node]){
            vis[node]=true;
            list=new ArrayList<>();
            Step3(stack,node,reverse,vis,list);
            ansL.add(list);
            }
            stack.pop();
        }

        System.out.println(ansL);
    }

    public static void Step1(List<List<Integer>>listt,Stack<Integer>stack,int node,boolean visited[]){
        //Sort on the basis of finish time of DFS
        List<Integer>list=listt.get(node);

        for(int num:list){
            if(!visited[num]==true){
                visited[num]=true;
                Step1(listt, stack, num, visited);
            }
        }
        stack.add(node);
    }

    public static List<List<Integer>> Step2(int edges[][]){
        //Reverse the edges
        int V=edges.length-1;
        List<List<Integer>>listt2=new ArrayList<>();
        for(int i=0;i<V;i++){
            listt2.add(new ArrayList<>());
        }

        for(int edge[]:edges){
            int index=edge[0];
            int vertex=edge[1];

            listt2.get(vertex).add(index);
        }
        return listt2;
    }

    public static void Step3(Stack<Integer>stack,int node,List<List<Integer>>reverse,boolean vis[],List<Integer>list){

        List<Integer>cur=reverse.get(node);
        list.add(node);
        for(int num:cur){
            if(!vis[num]==true){
                vis[num]=true;
                Step3(stack,num,reverse,vis,list);
            }
        }
    }
}
