package edu.wctc.JUnitTests;
import edu.wctc.Game.Game;
import edu.wctc.NPCFactories.BeginningSpawnFactory;
import edu.wctc.NPCFactories.NPCFactory;
import edu.wctc.NPCs.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpawnFactoryTest {
    @Test
    void spawn(){
        NPCFactory npcFactory = new BeginningSpawnFactory();
        assertTrue(npcFactory.spawn(1) instanceof BasicNPC);
        assertTrue(npcFactory.spawn(2) instanceof LevelTwoNPC);
        assertTrue(npcFactory.spawn(3) instanceof LevelThreeNPC);
        assertTrue(npcFactory.spawn(4) instanceof LevelFourNPC);
        assertTrue(npcFactory.spawn(5) instanceof LevelFiveNPC);
    }
}
