/**
 * Leaf Class
 * Represents individual menu items that do not contain other items.
 */
public class MenuItem implements MenuComponent {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("  " + name + ": P" + String.format("%.2f", price));
    }
}