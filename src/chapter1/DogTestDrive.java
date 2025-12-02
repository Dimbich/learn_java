package chapter1;
class Dog {
    int size;
    String breed;
    String name;

    void bark(){
        System.out.println("Гав!Гав!");
    }
}

class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Шарик";
        dog.size = 40;
        dog.bark();
    }
}
