package edu.wctc.TheftStrategies;

public class BasicTheft implements TheftStrategy{
    @Override
    public double theive(double money) {
        if(money > 0) {
            double rand = (Math.random() * money) + 0;
            return rand;
        }
        return 0.00;
    }
}
