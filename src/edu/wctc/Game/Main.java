package edu.wctc.Game;

import edu.wctc.Game.Game;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Game game = Game.getInstance();
        while(game.isRunning == true){
            game.startLevel();
        }
    }
}
