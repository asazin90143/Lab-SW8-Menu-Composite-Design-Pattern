import java.util.ArrayList;
import java.util.List;

/**
 * Composite Class
 * Maintains a list of child components and aggregates their data.
 */
public class MenuCategory implements MenuComponent {
    private String categoryName;
    private List<MenuComponent> menuComponents = new ArrayList<>();

    public MenuCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public void add(MenuComponent component) {
        menuComponents.add(component);
    }

    public void remove(MenuComponent component) {
        menuComponents.remove(component);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (MenuComponent component : menuComponents) {
            total += component.getPrice();
        }
        return total;
    }

    @Override
    public void print() {
        System.out.println(categoryName.toUpperCase());
        for (MenuComponent component : menuComponents) {
            component.print();
        }
    }
}