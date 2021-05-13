package edu.wctc.InteractStrategies.InteractFactory;

import edu.wctc.InteractStrategies.InteractStrategy;

import java.util.ArrayList;
import java.util.List;

public class InteractorSpawner extends InteractionFactory{
    @Override
    public InteractStrategy generate() {
        int rand = (int)(Math.random() * (interactStrategies.size()-1)) + 0;
        return interactStrategies.get(rand);
    }
}
