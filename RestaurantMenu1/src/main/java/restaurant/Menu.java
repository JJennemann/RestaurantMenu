package restaurant;


import java.util.ArrayList;
import java.util.Date;


public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;



    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    void addMenuItem(MenuItem newItem){
        String message = "That item has already been added to the menu.";
        if (menuItems.contains(newItem)){
            System.out.println(message);
            return;
        }
        for (MenuItem item:menuItems){
            if (item.equals(newItem)){
                System.out.println(message);
                return;
            }
        }
        menuItems.add(newItem);
        lastUpdated = new Date();
    }

    void removeMenuItem(MenuItem menuItem){
        menuItems.remove(menuItem);
        lastUpdated = new Date();
    }

    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for(MenuItem item : menuItems){
            if(item.getCategory().equals("Appetizer")){
                appetizers.append(item.toString());
            }
        }
        StringBuilder entrees = new StringBuilder();
        for(MenuItem item : menuItems){
            if(item.getCategory().equals("Entree")){
                entrees.append(item.toString());
            }
        }
        StringBuilder desserts = new StringBuilder();
        for(MenuItem item : menuItems){
            if(item.getCategory().equals("Dessert")){
                desserts.append(item.toString());
            }
        }
        return "JOSH'S DINNER JOINT\n" + "MENU\n" + "\n**APPETIZERS**"
                + appetizers.toString() + "\n**ENTREES**" + entrees.toString() +
                "\n**DESSERTS**" + desserts.toString();
    }

//    void printMenu(){
//        for(MenuItem item:menuItems){
//            System.out.println(item + "\n*****");
//        }
//    }

}
