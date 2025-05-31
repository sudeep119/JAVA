package DSA.Practice;

public class Nqueens {
    public static void main(String[] args) {
        
        int n=4;
        boolean bool[][]=new boolean[n][n];
        Solve(0,0,n,bool);
    }

    public static void Solve(int row,int col,int n,boolean matrix[][]){
        
            if(n==0)

        for(int i=0;i<matrix.length;i++){
            if(validPos(row,col,matrix)){
                Solve(row,col+1,n-1, matrix);
            }
        }
    }

    public static boolean validPos(int row,int col,boolean matrix[][]){

        if(isHor(row,col,matrix)&&isVer(row,col,matrix)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isHor(int row,int col,boolean matrix[][]){
         for(int i=col+1;i<matrix.length;i++){
            if(matrix[row][i]){
                return false;
            }
         }
         return true;
    }

    public static boolean isVer(int row,int col,boolean matrix[][]){
        for(int i=0;i<matrix[i].length;i++){
            if(i==row)continue;
            if(matrix[i][col]){
                return false;
            }
         }
         return true;
    }

    // public void isDia(int row,int col,boolean matrix[][]){
    //     for(int =)
    // }
}
