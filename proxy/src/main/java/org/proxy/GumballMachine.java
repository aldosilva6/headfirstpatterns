package org.proxy;

/**
 * Created by ainacio on Nov, 2023
 */
public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    int numberOfGumballs;

    State state;
    int count = 0;

    String location;

    public GumballMachine(String location, int numberGumballs) {
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        this.location = location;
        if(numberGumballs > 0){
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
        this.numberOfGumballs = numberGumballs;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void turnCrank(){
            state.turnCrank();
            state.dispense();
    }

    public void refill(int count){
        this.count += count;
        System.out.println("The gumball machine was just refilled; its new count is: " + this.count);
        state.refill();
    }

    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if(count > 0){
            count = count - 1;
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }

    public String getLocation() {
        return location;
    }
}
