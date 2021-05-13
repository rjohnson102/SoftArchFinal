package edu.wctc.TheftStrategies;

public class LevelFiveTheft implements TheftStrategy{
    @Override
    public double theive(double money) {
        if(money > 0) {
            double rand = (Math.random() * (money * .35)) + 0;
            return rand;
        }
        return 0.00;
    }
}
