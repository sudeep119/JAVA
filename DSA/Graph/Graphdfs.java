package DSA.Graph;

public class Graphdfs {
        public static void main(String[] args) {

                int image[][]={{1,1,0,0,0,0},
                               {1,1,0,0,0,0},
                               {0,0,1,0,0,0},
                               {0,0,0,0,1,1}};
                int count=0;
                boolean nool[][]=new boolean[image.length][image[0].length];
                
                System.out.print(Bool(image, 0, 0, 2, nool,count));
                
            }

            static int Bool(int[][] image, int sr, int sc, int color,boolean nool[][],int count){
                for(int i=0;i<image.length;i++){
                    for(int j=0;j<image[0].length;j++){
                        sr=i;
                        sc=j;
                        if(image[sr][sc]==1&&!nool[sr][sc]){
                            dfs(image, sr, sc, color, nool, count);
                            count++;
                        }
                    }              
    }
    return count;
}

    static void dfs(int image[][],int sr, int sc, int color,boolean nool[][],int count){
            int m=image.length;
            int n=image[0].length;

                if(sr>=m||sc>=n)
                return;
                if(sr<0||sc<0)
                return;
                if(image[sr][sc]==0)
                return;
                if(nool[sr][sc])
                return;
                
                    nool[sr][sc]=true;
                
                //left
                dfs(image, sr, sc-1,color, nool,count);
                //top
                dfs(image, sr+1,sc,color, nool,count);
                //right
                dfs(image, sr, sc+1,color, nool,count);
                //bottom
                dfs(image, sr-1, sc,color, nool,count);
    
}
    
        
}

