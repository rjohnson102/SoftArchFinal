package edu.wctc.ReactStrategies.ReactFactories;


import edu.wctc.ReactStrategies.ReactStrategy;

public class ReactionSpawner extends ReactFactory {
    @Override
    public ReactStrategy generate() {
        int rand = (int)(Math.random() * (reactStrategies.size()-1)) + 0;
        return reactStrategies.get(rand);
    }
}
