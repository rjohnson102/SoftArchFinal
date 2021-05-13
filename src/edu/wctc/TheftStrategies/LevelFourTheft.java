package edu.wctc.TheftStrategies;

public class LevelFourTheft implements TheftStrategy{

    @Override
    public double theive(double money) {
        if(money > 0) {
            double rand = (Math.random() * (money * .50)) + 0;
            return rand;
        }
        return 0.00;
    }
}
