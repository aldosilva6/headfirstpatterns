package org.adapter;

/**
 * Created by ainacio on Nov, 2023
 */
public class TurkeyAdapter implements Duck{

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        //Turkey needs 5 times to fly like a duck
        for(int i = 0; i < 5; i++){
            turkey.fly();
        }
    }


}
