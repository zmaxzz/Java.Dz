import java.util.ArrayList;
import java.util.List;

class MenuCategory implements MenuComponent {
    private String name;
    private List<MenuComponent> menuComponents = new ArrayList<>();

    public MenuCategory(String name) {
        this.name = name;
    }

    public void add(MenuComponent component) {
        menuComponents.add(component);
    }

    public void remove(MenuComponent component) {
        menuComponents.remove(component);
    }

    @Override
    public void print() {
        System.out.println("Категория: " + name);
        for (MenuComponent component : menuComponents) {
            component.print(); // Рекурсивно вызываем print() для дочерних компонентов
        }
    }
}