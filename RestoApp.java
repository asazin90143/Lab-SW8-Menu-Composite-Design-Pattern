/**
 * Client Application
 * Demonstrates the construction and usage of the composite structure.
 */
public class RestoApp {
    public static void main(String[] args) {
        // 1. Create Leaf Items
        MenuItem burger = new MenuItem("Classic Burger", 250.00);
        MenuItem fries = new MenuItem("Large Fries", 85.00);
        MenuItem soda = new MenuItem("Root Beer", 60.00);

        // 2. Create Sub-Composite (Combo)
        MenuCategory soloMeal = new MenuCategory("Barkada Solo Meal");
        soloMeal.add(burger);
        soloMeal.add(fries);
        soloMeal.add(soda);

        // 3. Create another Leaf
        MenuItem sundae = new MenuItem("Vanilla Sundae", 45.00);

        // 4. Create Top-Composite (Main Menu)
        MenuCategory mainMenu = new MenuCategory("Main Menu");
        mainMenu.add(soloMeal);
        mainMenu.add(sundae);

        // 5. Test Output
        mainMenu.print();
        System.out.println("===");
        System.out.println("Total Menu Value: P" + String.format("%.2f", mainMenu.getPrice()));
    }
}