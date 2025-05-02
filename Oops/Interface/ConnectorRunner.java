package Oops.Interface;

public class ConnectorRunner {
    
    public static void main(String[] args) {
        
        Connector connector=new ConnectorImpl();

        ConnectorUser user=new ConnectorUser(connector);

        user.execute();
    }
}
