package Oops.Multithreading;

public class Mthread {
    
    public static void main(String[] args) {
        Thread thread1=new Thread(()->System.out.println("Hello"));
        thread1.start();

        Thread1 t1=new Thread1();
        Thread1 t2=new Thread1();
        t1.start();
        t2.start();

    }
}
