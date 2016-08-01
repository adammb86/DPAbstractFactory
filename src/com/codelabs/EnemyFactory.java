package com.codelabs;

/**
 * Created by adammb on 7/27/16.
 */
public class EnemyFactory extends AbstractFactoryGame{
    @Override
    public Enemy getEnemy(String enemyLevel) {
        if(enemyLevel.equalsIgnoreCase("small"))
            return new SmallEnemy();
        else if(enemyLevel.equalsIgnoreCase("average"))
            return new AverageEnemy();
        else if(enemyLevel.equalsIgnoreCase("large"))
            return new LargeEnemy();
        else
            return null;
    }

    @Override
    public Ally getAlly(String allyLevel) {
        return null;
    }
}
