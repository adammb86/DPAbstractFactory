package com.codelabs;

/**
 * Created by adammb on 7/27/16.
 */
public class SmallEnemy implements Enemy{

    @Override
    public void getDamage() {
        System.out.println("Damage = 100");
    }
}
