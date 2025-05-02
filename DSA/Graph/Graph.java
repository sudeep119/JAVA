package DSA.Graph;
class Gra{

    int matA[][];
    Gra(int nodes){
        matA=new int[nodes][nodes];
    }

    public void Create(int edges[][],boolean directed){
        for(int edge[]:edges){
            int u=edge[0];
            int v=edge[1];
            int weight=edge[2];
            if(directed)
            matA[u][v]=weight;
            else{
                matA[u][v]=weight;
                matA[v][u]=weight;
            }

        }
    }

    public void Display(){
        for(int i=0;i<matA.length;i++){
            for(int j=0;j<matA[0].length;j++){
                System.out.print(matA[i][j]+" ");
            }
            System.out.println();
        }
    }
}

public class Graph {
    public static void main(String[] args) {
        int edges[][]={{0,2,10},{0,1,20},{1,3,30}};
        int nodes=4;
        Gra obj=new Gra(nodes);
        boolean directed=true;
        obj.Create(edges,directed);
        obj.Display();
    }
}
