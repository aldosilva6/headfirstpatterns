package org.designpattern.weapon.impl;

import org.designpattern.weapon.WeaponBehavior;

/**
 * Created by ainacio on Oct, 2023
 */
public class BowAndArronBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using Bow and Arrow ");
    }
}
