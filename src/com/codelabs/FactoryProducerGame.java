package com.codelabs;

/**
 * Created by adammb on 7/27/16.
 */
public class FactoryProducerGame {
    //ini hook
    public static AbstractFactoryGame getFactory(String namaFactory){
        if(namaFactory.equalsIgnoreCase("enemy"))
            return new EnemyFactory();
        else if(namaFactory.equalsIgnoreCase("ally"))
            return new AllyFactory();
        else
            return null;
    }
}
