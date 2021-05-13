package edu.wctc.MenuOut;

import edu.wctc.Game.Game;
import edu.wctc.NPCs.NPC;
import edu.wctc.Game.Player;

public class Mediator {
    /*Bridge class between Menu and the Game. Applies all actions through the menu inputs*/

    public void Interact(){
        NPC npc = Game.getInstance().getCurrentNPC();
        npc.interact();
    }

    /*Get the Current NPC from the game and use player object to steal from it*/
    public void Steal(){
        NPC npc = Game.getInstance().getCurrentNPC();
        Player player = Player.getInstance();
        npc.react();
        player.steal(npc);
    }

    /*Get the next NPC and replace the game's current instance*/
    public void MoveOn(){
        Game game = Game.getInstance();
        game.getNextNPC();
    }

    /*End the game*/
    public void End(){
        Game game = Game.getInstance();
        game.isRunning = false;
    }
}
