package DSA.Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dsa {
    public static void main(String[] args) {
        
        int arr[][]={
            {0,1,0},
            {0,0,1},
            {1,1,1},
            {0,0,0}
        };
        Solve(arr);
    }
    public static void Solve(int board[][]){

        int dir[][]={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};

        for(int i=0;i<board.length;i++){

            for(int j=0;j<board[i].length;j++){

                int neighbour=CountNeighbout(i,j,board,dir);

                if(board[i][j]==1){
                if(neighbour<2||neighbour>3){
                    board[i][j]=3;
                }else if(neighbour==2||neighbour==3){
                    board[i][j]=1;
                }
                }
                
                if(board[i][j]==0){
                    if(neighbour==3){
                        board[i][j]=2;
                    }
                }
            }
        }
        for(int i=0;i<board.length;i++){

            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==3)
                board[i][j]=0;
                else if(board[i][j]==2)
                board[i][j]=1;
            }

        }
        

        for(int a[]:board){
            for(int num:a){
                System.out.print(num+" ");
            }
            System.out.println();
        }
}
    
    public static int CountNeighbout(int i,int j, int arr[][],int dir[][]){
            int m=arr.length;
            int n=arr[i].length;

            int neighbour=0;

            for(int a[]:dir){
                int row=a[0]+i;
                int col=a[1]+j;

                if(row<0||row>=m||col<0||col>=n){
                    continue;
                }
                if(arr[row][col]==1||arr[row][col]==3){
                    neighbour+=1;
                }
            }
            Scanner sc=new Scanner(System.in);
            sc.nextInt();
            return neighbour;
        }

}
