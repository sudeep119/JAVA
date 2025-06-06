package DSA.Practice;

public class Nqueens {
    public static void main(String[] args) {
        
        int n=4;
        boolean bool[][]=new boolean[n][n];
        Solve(0,0,n,bool);
    }

    public static void Solve(int row,int col,int n,boolean matrix[][]){
        
            if(n==0){
                for(boolean r[]:matrix){
                    String ans="";
                        for(boolean num:r){
                            if(num)
                            ans=ans+'N';
                            else
                            ans=ans+'X';
                        }
                    System.out.print(ans);
                    System.out.print(',');
                    System.out.println();
                }
                return;
            }
            if(col>=matrix[0].length){
                Solve(row+1, 0, n, matrix);
                return;
            }
            if(row>=matrix.length){
                return;
            }

            if(validPos(row,col,matrix)){
                matrix[row][col]=true;
                Solve(row+1,0,n-1, matrix);
                matrix[row][col]=false;
            }
            Solve(row , col+1, n, matrix);
    }

    public static boolean validPos(int row,int col,boolean matrix[][]){

        if(isHor(row,col,matrix)&&isVer(row,col,matrix)&&isDia(row, col, matrix)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isHor(int row,int col,boolean matrix[][]){
         for(int i=0;i<matrix.length;i++){
            if(matrix[row][i]){
                return false;
            }
         }
         return true;
    }

    public static boolean isVer(int row,int col,boolean matrix[][]){
        for(int i=0;i<matrix.length;i++){
            if(i==row)continue;
            if(matrix[i][col]){
                return false;
            }
         }
         return true;
    }

    public static boolean isDia(int row,int col,boolean matrix[][]){
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(matrix[i][j])return false;
        }
        for(int i=row-1,j=col+1;i>=0&&j<matrix.length;i--,j++){
            if(matrix[i][j])return false;
        }
        for(int i=row+1,j=col-1;i < matrix.length&&j>=0;i++,j--){
            if(matrix[i][j])return false;
        }
        for(int i=row+1,j=col+1;i<matrix.length&&j<matrix.length;i++,j++){
            if(matrix[i][j])return false;
        }
        Nqueens obj=new Nqueens();
        return true;
    }
    
}

class Quen extends Nqueens{
    Nqueens obj=new Quen();
    Quen q=(Quen)obj;
}
