package Oops.Exception;

public class Exception {

    public static void main(String[] args) {
        int arr[]=new int[2];
        arr[0]=2;
        arr[1]=2;
        try{
        System.out.println(arr[2]);
        }catch(ArrayIndexOutOfBoundsException e){
            try{
            throw new ("My Exc");
            }catch(OwnException o){
                System.out.println(o.getMessage());
            }
        }
    }
    
}

class OwnException extends RuntimeException{

    OwnException(){
        super();
    }
    OwnException(String mess){
        super(mess);
    }
}