package org.designpattern.weapon;

/**
 * Created by ainacio on Oct, 2023
 */
public class King extends Character{
    @Override
    void fight() {
        System.out.println("I'm the king");
        this.weapon.useWeapon();
    }
}
