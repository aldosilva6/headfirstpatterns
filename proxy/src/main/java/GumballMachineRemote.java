import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by ainacio on Nov, 2023
 */
public interface GumballMachineRemote extends Remote {
    public Integer getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
