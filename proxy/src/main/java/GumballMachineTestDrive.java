import java.rmi.Naming;

/**
 * Created by ainacio on Nov, 2023
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) {
        int count = 0;
        if(args.length < 2){
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        count = Integer.parseInt(args[1]);
        GumballMachineRemote gumballMachine = null;
        try {
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind(args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
