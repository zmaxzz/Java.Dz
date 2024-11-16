class Dish implements MenuComponent {
    private String name;
    private double price;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Блюдо: " + name + ", Цена: " + price);
    }
}