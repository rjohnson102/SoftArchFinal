package edu.wctc.MenuOut;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class MenuOptions {
    private HashMap<Integer, String> menuItems;

    /*List of all the available menu options*/
    public MenuOptions(){
        menuItems = new HashMap<Integer, String>(){{
            put(1, "Interact");
            put(2, "Steal");
            put(3, "Move On");
            put(4, "End");
        }};
    }

    public HashMap getMenuItems(){
        return menuItems;
    }
}
