import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by ainacio on Nov, 2023
 */
public interface MyRemote extends Remote {

    public String sayHello() throws RemoteException;
}
