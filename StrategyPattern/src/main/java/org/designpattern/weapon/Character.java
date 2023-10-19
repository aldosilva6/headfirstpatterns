package org.designpattern.weapon;

/**
 * Created by ainacio on Oct, 2023
 */
public abstract class Character {

    WeaponBehavior weapon;

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    abstract void fight();
}
