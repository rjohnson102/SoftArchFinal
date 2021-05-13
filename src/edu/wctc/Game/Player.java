package edu.wctc.Game;

import edu.wctc.NPCs.NPC;

import java.text.NumberFormat;

public class Player{
    private static Player instance = null;
    private double money;

    private Player(){

    }

    public void steal(NPC npc){
        money += npc.getThefted();
    }

    public static Player getInstance(){
        if(instance == null){
            instance = new Player();
        }
        return instance;
    }

    private void setMoney(double money){
        this.money += money;
    }

    public double getMoney(){
        return money;
    }

    /*Returns Money as Formatted String*/
    public String getFormattedMoney(){
        NumberFormat format = NumberFormat.getCurrencyInstance();
        String moneyString = format.format(money);
        return moneyString;
    }
}
