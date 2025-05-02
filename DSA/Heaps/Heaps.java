package DSA.Heaps;

public class Heaps {
    int heap[];
    int heapsize=0;
    int capacity;

    Heaps(int arr[]){
        heap=arr;
        heapsize=arr.length;
    }

    public void Heapp(){
        int n=heapsize;
        
        for(int i=(n/2)-1;i>=0;i--){
            Heapify(i);
        }
    }
    public void Heapify(int ind){
        int largest=ind;
        int left=(2*ind)+1;
        int right=(2*ind)+2;

        if(left<heapsize&&heap[left]>heap[largest]){
            largest=left;
        }
        if(right<heapsize&&heap[right]>heap[largest]){
            largest=right;
        }

        if(largest!=ind){
            Swap(ind,largest);
            Heapify(largest);
        }
    }
    public int ExtractMax(){
        int max=heap[0];
        heap[0]=heap[heapsize-1];

        heapsize--;
        Heapify(0);
        return max;
    }
    public void Swap(int a,int b){
        int temp=heap[a];
        heap[a]=heap[b];
        heap[b]=temp;
    }
    public void HeapSort(){

        while(heapsize>0){
            int max=heap[0];
            System.out.print(max+" ");
            heap[0]=heap[heapsize-1];

            heapsize--;
            Heapify(0);
        }
    }
    public static void main(String[] args) {
        
        int arr[]=new int[]{7,1,2,5,8,4};
        Heaps obj=new Heaps(arr);
        obj.Heapp();
    }
}
