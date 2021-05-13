package edu.wctc.Game;

import edu.wctc.NPCs.NPC;
import edu.wctc.NPCFactories.BeginningSpawnFactory;
import edu.wctc.NPCFactories.NPCFactory;
import edu.wctc.MenuOut.ConsoleMenu;
import edu.wctc.MenuOut.Interactor;

public class Game{
    private static Game instance = null;
    private Player player;
    private NPC currentNPC;
    private NPCFactory npcFactory;
    private int currentLevel;
    public boolean isRunning;
    private Interactor menu;

    private Game() {
        /*Setting all beginning values for game start and spawning the first NPC*/
        player = Player.getInstance();
        npcFactory = new BeginningSpawnFactory();
        currentLevel = 1;
        isRunning = true;
        menu = new ConsoleMenu();
        spawnNPC();
    }

    public static Game getInstance(){
        if(instance == null){
            instance = new Game();
        }
        return instance;
    }

    public void startLevel(){
        /*Check the value of Player's wallet and set the current level accordingly.
        Start the Level in the Menu*/
        checkPlayerStatus();
        menu.start();
    }

    private void checkPlayerStatus(){
        if(player.getMoney() > 40){
            currentLevel = 2;
        }
        if(player.getMoney() > 150){
            currentLevel = 3;
        }
        if(player.getMoney() > 275){
            currentLevel = 4;
        }
        if(player.getMoney() > 500){
            currentLevel = 5;
        }
    }

    public void getNextNPC(){
        spawnNPC();
    }

    private void spawnNPC(){
        currentNPC = npcFactory.spawn(currentLevel);
    }

    public void setNpcFactory(NPCFactory npcFactory) {
        this.npcFactory = npcFactory;
    }

    public NPC getCurrentNPC(){
        return currentNPC;
    }
}
