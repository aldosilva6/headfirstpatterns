package org.designpattern.weapon;

import org.designpattern.weapon.impl.KnifeBehavior;
import org.designpattern.weapon.impl.SwordBehavior;

/**
 * Created by ainacio on Oct, 2023
 */
public class CharacterSimulator {

    public static void main(String[] args) {
        Character king = new King();
        king.setWeapon(new KnifeBehavior());
        king.fight();

        king.setWeapon(new SwordBehavior());
        king.fight();
    }
}
