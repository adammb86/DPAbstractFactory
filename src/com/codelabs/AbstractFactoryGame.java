package com.codelabs;

/**
 * Created by adammb on 7/27/16.
 */
public abstract class AbstractFactoryGame {
    public abstract Enemy getEnemy(String enemyLevel);
    public abstract Ally getAlly(String allyLevel);
}
