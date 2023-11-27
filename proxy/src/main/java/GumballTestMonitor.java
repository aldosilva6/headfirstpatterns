import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by ainacio on Nov, 2023
 */
public class GumballTestMonitor {

    public static void main(String[] args) {
        String[] location = {"rmi:///austin.mightygumball.com/gumballmachine",
                             "rmi:///boulder.mightygumball.com/gumballmachine"};
        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for(int i = 0; i < location.length; i++){
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (NotBoundException e) {
                throw new RuntimeException(e);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        for(int i = 0; i < location.length; i++){
            monitor[i].report();
        }
    }
}

