package chapter8;

public class TestAnimal {

    public static void main(String[] args) {

        AnimalList  animalList = new AnimalList();
        animalList.add(new Wolf());
        animalList.add(new Cat());
        animalList.add(new Lion());

        for (Animal animal : animalList.getAnimals()) {
            animal.makeNoise();
            animal.eat();
            animal.sleep();
            System.out.println("-----");
        }
    }
}
