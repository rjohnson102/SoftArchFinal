package edu.wctc.NPCs;

import edu.wctc.InteractStrategies.InteractFactory.InteractorSpawner;
import edu.wctc.ReactStrategies.ReactFactories.ReactionSpawner;
import edu.wctc.TheftStrategies.BasicTheft;
import edu.wctc.TheftStrategies.LevelTwoTheft;

import java.util.ArrayList;

public class LevelTwoNPC extends NPC{

    public LevelTwoNPC(){
        interactionFactory = new InteractorSpawner();
        reactFactory = new ReactionSpawner();
        interactStrategy = interactionFactory.generate();
        reactStrategy = reactFactory.generate();
        theftStrategy = new LevelTwoTheft();
    }

    @Override
    void setNames() {
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
    void setMoney() {
        money = (Math.random() * 100) + 1;
    }
}
