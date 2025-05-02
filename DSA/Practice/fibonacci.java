package DSA.Practice;

class Bubble{
    
    public void Bubblee(int arr[],int r,int c,int max){
        
        if(r==0)
        return;

        if(c<r){
           if(arr[c]>arr[max])
        Bubblee(arr, r, c+1,c);
        else
        Bubblee(arr, r, c+1, max);

}else{
    int temp=arr[max];
    arr[max]=arr[r-1];
    arr[r-1]=temp;
    Bubblee(arr, r-1, 0, 0);
}
}
}
    class fibonacci{

    public static void main(String args[]){
        int arr[]={5,7,3,11,4,2,9};
        int r=arr.length;
        int c=0;
        int max=0;
        Bubble onj=new Bubble();
        onj.Bubblee(arr,r,c,max);

       for(int num:arr){
        System.out.print(num+" ");
       }
       
    }
}

               
      
   



    

    


