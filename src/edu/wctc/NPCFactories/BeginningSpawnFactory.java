package edu.wctc.NPCFactories;
import edu.wctc.NPCs.*;
import edu.wctc.NPCs.NPC;

public class BeginningSpawnFactory extends NPCFactory {

    @Override
    /*Returns new NPC's according to the Game level*/
    public NPC spawn(int currentLevel) {
        if(currentLevel == 1){
            return new BasicNPC();
        }
        else if(currentLevel == 2){
            return new LevelTwoNPC();
        }
        else if(currentLevel == 3){
            return new LevelThreeNPC();
        }
        else if(currentLevel == 4){
            return new LevelFourNPC();
        }
        else if(currentLevel >= 5){
            return new LevelFiveNPC();
        }
        return new BasicNPC();
    }
}
