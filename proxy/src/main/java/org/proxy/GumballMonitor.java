package org.proxy;

/**
 * Created by ainacio on Nov, 2023
 */
public class GumballMonitor {

    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    //GumballInterface gumball = (GumballInterface) Naming.lookup("rmi://ip/RemoteHello");

    public void report(){
        System.out.println("Gumball Machine: " + gumballMachine.getLocation());
        System.out.println("Current inventory: " + gumballMachine.getCount() + " gumballs");
        System.out.println("Current state: " + gumballMachine.getState());
    }
}
