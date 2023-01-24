package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public void addMenuItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }

}
