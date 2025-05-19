package Oops.Multithreading;

public class RaceCondition extends Thread{
    
    static int count=0;

    @Override
    public void run(){

        for(int i=0;i<100000;i++){
            count++;
        }

    }


    public static void main(String[] args) {
        
        RaceCondition t1=new RaceCondition();
        RaceCondition t2=new RaceCondition();
        t1.start();
        t2.start();
        try{
        t1.join();
        t2.join();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(count);
    }
}
