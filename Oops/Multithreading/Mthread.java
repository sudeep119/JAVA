package Oops.Multithreading;

public class Mthread {
    
    public static void main(String[] args) {
        Thread thread1=new Thread(new Threads(),"thread1");
        thread1.start();
    }
}
