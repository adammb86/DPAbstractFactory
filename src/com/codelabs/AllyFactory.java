package com.codelabs;

/**
 * Created by adammb on 7/27/16.
 */
public class AllyFactory extends AbstractFactoryGame{
    @Override
    public Enemy getEnemy(String enemyLevel) {
        return null;
    }

    @Override
    public Ally getAlly(String allyLevel) {
        if(allyLevel.equalsIgnoreCase("small"))
            return new SmallAlly();
        else if(allyLevel.equalsIgnoreCase("average"))
            return new AverageAlly();
        else if(allyLevel.equalsIgnoreCase("large"))
            return new LargeAlly();
        else
            return null;
    }
}
