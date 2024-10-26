public class ParrotFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(String name) {
        return new Parrot(name);
    }
}