package edu.wctc.ReactStrategies;

public class HardCoreReaction implements ReactStrategy {
    @Override
    public void react(String moneyString, double money) {
        if(money > 0.009) {
            System.out.println("You'll Never Take My Money! AHhhAhhhhahhhh");
        }
        else{
            System.out.println("Arghasdfh");
        }
    }
}
