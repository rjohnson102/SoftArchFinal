package edu.wctc.ReactStrategies;

public class BasicReaction implements ReactStrategy {
    @Override
    public void react(String moneyString, double money) {
        if(money > 0.009) {
            System.out.println("Take my Money! I only have " + moneyString + ", though!");
        }
        else{
            System.out.println("Get away from me! I don't have any money!");
        }
    }
}
