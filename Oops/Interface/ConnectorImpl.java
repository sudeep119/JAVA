package Oops.Interface;

public class ConnectorImpl implements Connector{
    
    ConnectorImpl(){
        super();
    }   
   @Override
   public void run(){
        System.out.println("Runnning in Impl");
   }

}