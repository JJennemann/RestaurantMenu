package restaurant;

public class Restaurant {
    public static void main(String[] args){

        MenuItem entreeOne = new MenuItem("Meatloaf", "Meatloaf better than your mommas!",
                16.99, "Entree");

        MenuItem entreeTwo = new MenuItem("Spaghetti and Meatballs", "Spaghetti made" +
                " with our famous meatballs!", 15.99, "Entree");

        MenuItem entreeThree = new MenuItem("Country Fried Steak", "Steak fried straight" +
                " from the country!", 12.99, "Entree");

        MenuItem appOne = new MenuItem("Jalapeno Poppers", "You'll never pop another popper" +
                " in your mouth after our jalapeno poppers!", 7.99, "Appetizer");

        MenuItem appTwo = new MenuItem("Fried Pickles", "You like pickles? Try em' fried!",
                5.99, "Appetizer");

        MenuItem dessertOne = new MenuItem("Tiramisu", "It's our only dessert", 9.99,
                "Dessert");

        Menu currentMenu = new Menu();


        currentMenu.addMenuItem(entreeOne);
        currentMenu.addMenuItem(entreeTwo);
        currentMenu.addMenuItem(entreeThree);
        currentMenu.addMenuItem(appOne);
        currentMenu.addMenuItem(appTwo);
        currentMenu.addMenuItem(dessertOne);

        currentMenu.removeMenuItem(dessertOne);

        currentMenu.printMenu();
    }
}
