package chapter8;

public class TestAnimal {

    public static void main(String[] args) {

        Animal[] animals = {
                new Wolf(),
                new Cat(),
                new Lion()
        };

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
            animal.sleep();
            System.out.println("-----");
        }
    }
}
