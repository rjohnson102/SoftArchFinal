package edu.wctc.NPCFactories;

import edu.wctc.NPCs.NPC;

public abstract class NPCFactory {
    public abstract NPC spawn(int currentLevel);
}
