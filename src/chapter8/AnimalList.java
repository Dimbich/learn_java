package chapter8;

public class AnimalList {
    private Animal[] animals = new Animal[3];
    private int nextIndex = 0;

    public void add(Animal animal) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = animal;
            System.out.println(animal.getName() + " добавлен в ячейку " + nextIndex++);
        }
    }

    public Animal[] getAnimals() {
        return animals;
    }
}
