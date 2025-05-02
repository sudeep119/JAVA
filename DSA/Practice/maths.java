package DSA.Practice;

class Prime{

    public static void main(String args[]){
      int arr[]={8,6,5,1,8,7};
      int m=Integer.MAX_VALUE;
      int n=Integer.MAX_VALUE;
      
      System.out.println(Factor(arr, m, n));
      
    }
    static int Factor(int arr[],int m,int n){
       for(int i=0;i<arr.length;i++){
        if(arr[i]<m){
        n=m;
        m=arr[i];
        
        }
        else if(arr[i]<n&& arr[i]!=m)
        n=arr[i];
       }
       return n;
    }
}
