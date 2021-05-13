package edu.wctc.JUnitTests;
import edu.wctc.Game.Game;
import edu.wctc.Game.Player;
import edu.wctc.MenuOut.ConsoleMenu;
import edu.wctc.MenuOut.Interactor;
import edu.wctc.MenuOut.MenuContext;
import edu.wctc.NPCs.NPC;
import edu.wctc.Parse.Parse;
import edu.wctc.Parse.ParseInt;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class ParseTest {

    @Test
    void parseInt(){
        Parse parse = new ParseInt();
        assertTrue(parse.parse("1"));
        assertFalse(parse.parse("f"));
    }

}
