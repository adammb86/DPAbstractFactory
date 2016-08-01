package com.codelabs;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
	// write your code here
        AbstractFactoryGame producerGame=FactoryProducerGame.getFactory("enemy");
        producerGame.getEnemy("small").getDamage();
        producerGame.getEnemy("average").getDamage();
        producerGame.getEnemy("large").getDamage();
        //producerGame.getAlly("small").getHealth();
    }
}
