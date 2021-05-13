package edu.wctc.MenuOut;

import java.util.Iterator;
import java.util.Map;

public class ConsoleMenu extends Interactor {

    @Override
    /*Iterate through Menu Options and list them to Console*/
    public void print(MenuOptions menuOptions) {
        Iterator<Map.Entry<Integer, String>> itr = menuOptions.getMenuItems().entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("(" +entry.getKey() + ")" + entry.getValue());
        }
    }

    @Override
    /*Using MenuContext, get desired input and apply it*/
    public void read(MenuContext context, Mediator mediator) {
            switch (context.GetMenuOption()) {
                case 1:
                    mediator.Interact();
                    break;
                case 2:
                    mediator.Steal();
                    context.PrintStolenMoney();
                    break;
                case 3:
                    mediator.MoveOn();
                    context.PrintPlayerDetails();
                    break;
                case 4:
                    mediator.End();
                    break;
                default:
                    context.PrintError();
                    read(context, mediator);
            }
    }
}
