package DSA.Practice;

public class dsa1 {
    public static void main(String[] args) {
     
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        uniquePaths(3,2);
       
    }
    public static void uniquePaths(int m, int n) {
       
        int dp[][]=new int[m][n];
        System.out.println(Solve(0, 0, m, n, dp));

    }

    public static int Solve(int row,int col,int m,int n,int dp[][]){
        if(row>=m||col>=n){
            return 0;
        }
        if(row==m-1&&col==n-1){
            return 1;
        }

        if(dp[row][col]==1){
            return dp[row][col];
        }
        //down
        int a=Solve(row+1, col, m, n, dp);

        //right
        int b=Solve(row, col+1, m, n, dp);

        dp[row][col]=a+b;

        return dp[row][col];
    }
}

