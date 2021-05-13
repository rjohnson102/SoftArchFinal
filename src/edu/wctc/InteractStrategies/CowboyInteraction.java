package edu.wctc.InteractStrategies;

public class CowboyInteraction implements InteractStrategy{
    @Override
    public void interact(String name) {
        System.out.println("Howdy there, partner. " + name + " at your service");
    }
}
