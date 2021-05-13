package edu.wctc.ReactStrategies;

public class ThinMintReaction implements ReactStrategy {
    @Override
    public void react(String moneyString, double money) {
        if(money > 0.009) {
            System.out.println("Please don't rob me mister, I only have thin mints.");
        }
        else{
            System.out.println("My thin mints :(");
        }
    }
}
