package edu.wctc.TheftStrategies;

public class LevelThreeTheft implements TheftStrategy{
    @Override
    public double theive(double money) {
        if(money > 0) {
            double rand = (Math.random() * (money * .75)) + 0;
            return rand;
        }
        return 0.00;
    }
}
