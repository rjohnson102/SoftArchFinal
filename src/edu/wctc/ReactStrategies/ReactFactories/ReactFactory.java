package edu.wctc.ReactStrategies.ReactFactories;

import edu.wctc.ReactStrategies.*;

import java.util.ArrayList;
import java.util.List;

public abstract class ReactFactory {
    List<ReactStrategy> reactStrategies;

    public ReactFactory(){
        reactStrategies = new ArrayList<>(){{
           add(new BasicReaction());
           add(new CabbageReaction());
           add(new HardCoreReaction());
           add(new SneakyReaction());
           add(new ThinMintReaction());
        }};
    }

    public abstract ReactStrategy generate();
}
