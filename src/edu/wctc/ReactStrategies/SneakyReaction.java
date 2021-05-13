package edu.wctc.ReactStrategies;

public class SneakyReaction implements ReactStrategy {
    @Override
    public void react(String moneyString, double money) {
        if(money > 0.009) {
            System.out.println("I'm not tellin' you how much money I got, you thieving thiever!");
        }
        else{
            System.out.println("Swiper no swiping!");
        }
    }
}
