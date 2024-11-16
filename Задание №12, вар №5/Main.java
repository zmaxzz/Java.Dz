public class Main {
    public static void main(String[] args) {

        Dish dish1 = new Dish("Паста", 250.0);
        Dish dish2 = new Dish("Пицца", 300.0);
        Dish dish3 = new Dish("Салат", 150.0);

        MenuCategory italianCategory = new MenuCategory("Итальянская кухня");
        MenuCategory saladCategory = new MenuCategory("Салаты");

        italianCategory.add(dish1);
        italianCategory.add(dish2);
        saladCategory.add(dish3);

        MenuCategory mainMenu = new MenuCategory("Главное меню");
        mainMenu.add(italianCategory);
        mainMenu.add(saladCategory);

        mainMenu.print();
    }
}