public class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(String name) {
        return new Cat(name);
    }
}