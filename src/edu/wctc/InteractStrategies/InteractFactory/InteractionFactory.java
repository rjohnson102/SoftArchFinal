package edu.wctc.InteractStrategies.InteractFactory;

import edu.wctc.InteractStrategies.*;

import java.util.ArrayList;
import java.util.List;

public abstract class InteractionFactory {
    List<InteractStrategy> interactStrategies;

    public InteractionFactory(){
        interactStrategies = new ArrayList<>(){{
            add(new BasicInteraction());
            add(new CowboyInteraction());
            add(new FunnyGuyInteraction());
            add(new MinnesotanInteraction());
            add(new TinyReaction());
            add(new ToughGuyInteraction());
        }};
    }
    public abstract InteractStrategy generate();
}
