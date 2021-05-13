package edu.wctc.ReactStrategies;

public class CabbageReaction implements ReactStrategy {
    @Override
    public void react(String moneyString, double money) {
        if(money > 0.009) {
            System.out.println("These cabbages are my life's work! They're worth " + moneyString + "!");
        }
        else{
            System.out.println("My Cabbages! :(");
        }
    }
}
