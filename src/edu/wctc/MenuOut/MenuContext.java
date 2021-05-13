package edu.wctc.MenuOut;

import edu.wctc.Parse.Parse;
import edu.wctc.Parse.ParseInt;
import edu.wctc.Game.Player;

import java.util.Scanner;

/*Class Used to Gather info for the Interactor and/or print to the menu*/
public class MenuContext {
    private Scanner keyboard = new Scanner(System.in);
    Parse parse;


    /*Method to get input from Scanner and return an integer value for menuOptions*/
    public int GetMenuOption(){
        parse = new ParseInt();
        String option = "";
        boolean isInt = false;
        while(!isInt){
            option = keyboard.nextLine();
            isInt = parse.parse(option);
            if(!isInt){
                System.out.println("Please Enter a Valid Option");
            }
        }
        int newOption = Integer.parseInt(option);

        return newOption;
    }

    /*Prints Player Details*/
    public void PrintPlayerDetails(){
        Player player = Player.getInstance();
        System.out.println("\n~Player Total: " + player.getFormattedMoney() + "~\n");
    }

    /*Prints Notification for Theft*/
    public void PrintStolenMoney(){
        System.out.println("\n~Money Yanked!~\n");
    }

    public void PrintError(){
        System.out.println("\n~Please Enter Valid Option~\n");
    }
}
