package org.designpattern.duck;

/**
 * Created by ainacio on Oct, 2023
 */
public class DuckCall {

    QuackBehavior quackBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack(){
        quackBehavior.quack();
    }
}
