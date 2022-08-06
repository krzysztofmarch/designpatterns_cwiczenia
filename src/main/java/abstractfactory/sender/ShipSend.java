package abstractfactory.sender;

public class ShipSend implements Send{

    @Override
    public void send(){
        System.out.println("Send by Ship");
    }
}

