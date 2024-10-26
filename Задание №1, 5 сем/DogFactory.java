public class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(String name) {
        return new Dog(name);
    }
}