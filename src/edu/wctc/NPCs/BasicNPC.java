package edu.wctc.NPCs;


import edu.wctc.InteractStrategies.BasicInteraction;
import edu.wctc.InteractStrategies.InteractFactory.InteractorSpawner;
import edu.wctc.ReactStrategies.BasicReaction;
import edu.wctc.ReactStrategies.ReactFactories.ReactionSpawner;
import edu.wctc.TheftStrategies.BasicTheft;

import java.util.ArrayList;

public class BasicNPC extends NPC{

    public BasicNPC(){
        interactionFactory = new InteractorSpawner();
        reactFactory = new ReactionSpawner();
        interactStrategy = interactionFactory.generate();
        reactStrategy = reactFactory.generate();
        theftStrategy = new BasicTheft();
    }


    @Override
    /*Set list of available names for given NPC*/
    public void setNames() {
        names = new ArrayList<>(){{
            add("Paul");
            add("Todd");
            add("Jerry");
            add("Meredith");
            add("Lucy");
            add("Georgie");
            add("Penelope");
            add("Willow");
            add("Omsley");
            add("Frank");
        }};
        int rand = (int)(Math.random() * names.size() - 1) + 0;
        name = names.get(rand);
    }

    @Override
    /*Set available money for any given NPC*/
    void setMoney() {
        money = (Math.random() * 50) + 1;
    }

}
