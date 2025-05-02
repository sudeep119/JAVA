package DSA.Graph;
import java.util.*;

class Createg{
List<ArrayList<Integer>> list1=new ArrayList<ArrayList<Integer>>();
boolean visited[];
ArrayList<Integer> anss=new ArrayList<>();
Queue<Integer> quee=new LinkedList<Integer>();
    Createg(int nodes){
        visited=new boolean[nodes];
        for(int i=0;i<nodes;i++){
            ArrayList<Integer>list=new ArrayList<>();
            list1.add(list);   
        }
    }

    public void InsertD(int edges[][]){
        for(int edge[]:edges){
            if(edge[1]!=-1){
            int u=edge[0];
            int v=edge[1];

            list1.get(u).add(v);
            }
        }
    }
    public void ML(){
        for(int i=0;i<list1.size();i++){
        if(!visited[i]){
            Breadth(i);
        }
    }
    }
    public void Breadth(int nodd){
        
                visited[nodd]=true;
                quee.offer(nodd);
            
            
            while(!quee.isEmpty()){     
            
            int aa=quee.poll();
            anss.add(aa);
            for(int num:list1.get(aa)){
                if(!isVisit(num)){
                    visited[num]=true;
                    quee.offer(num);                   
                }
            }          
           
        }
   
    }

    private boolean isVisit(int num){
        if(visited[num])
        return true;
        else
        return false; 
        
    }

    public void Disp(){
        System.out.print(list1);
        System.out.print(anss);
    }
}

public class BfsGR {
    public static void main(String[] args) {
        int edges[][]={{0,3},{2,-1},{1,5},{3,0},{3,5},{5,3},{5,1},{5,6},{6,5},{6,4},{7,-1},{2,-1}};
        Createg obj=new Createg(8); 
        obj.InsertD(edges);
        obj.Breadth(0);
        obj.ML();
        obj.Disp();
   
    }
}
