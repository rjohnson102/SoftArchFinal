package edu.wctc.NPCs;

import edu.wctc.InteractStrategies.InteractFactory.InteractionFactory;
import edu.wctc.InteractStrategies.InteractStrategy;
import edu.wctc.ReactStrategies.ReactFactories.ReactFactory;
import edu.wctc.ReactStrategies.ReactStrategy;
import edu.wctc.TheftStrategies.TheftStrategy;

import java.text.NumberFormat;
import java.util.List;

public abstract class NPC {

    List<String> names;
    String name;
    double money;
    InteractionFactory interactionFactory;
    ReactFactory reactFactory;
    ReactStrategy reactStrategy;
    InteractStrategy interactStrategy;
    TheftStrategy theftStrategy;

    public NPC() {
        setNames();
        setMoney();
        introduce();
    }
    /*Returns money as string*/
    public String getMoneyString(){
        NumberFormat format = NumberFormat.getCurrencyInstance();
        String moneyString = format.format(money);
        return moneyString;
    }
    /*Initial Introduction phrase*/
    public void introduce() {
        System.out.println("Hello! My name is " + name + "!");
        System.out.println("I have " + getMoneyString());
    }

    public double getMoney(){
        return money;
    }

    public void interact(){
        interactStrategy.interact(name);
    }

    public void react() {
        reactStrategy.react(getMoneyString(), money);
    }

    /*Subtracts stolen money from NPC's money and returns the value*/
    public double getThefted(){
        double returnedMoney = theftStrategy.theive(money);
        money = money - returnedMoney;
        return returnedMoney;
    }

    public void setInteractStrategy(InteractStrategy interactStrategy) {
        this.interactStrategy = interactStrategy;
    }

    /*Set list of available names for given NPC*/
    abstract void setNames();
    /*Set available money for any given NPC*/
    abstract void setMoney();
}
