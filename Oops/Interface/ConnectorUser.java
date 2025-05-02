package Oops.Interface;

public class ConnectorUser {
    
    Connector connector;
    ConnectorUser(){}
    public ConnectorUser(Connector connectr){
        connector=connectr;
    }
    
    public void execute(){
        if(connector!=null)
        connector.run();
    }
}
