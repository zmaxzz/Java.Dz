public class Main {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal("Max");

        System.out.println(dog.getName());

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal("Kitty");

        System.out.println(cat.getName());

        AnimalFactory parrotFactory = new CatFactory();
        Animal parrot = parrotFactory.createAnimal("Chop");

        System.out.println(parrot.getName());
    }
}