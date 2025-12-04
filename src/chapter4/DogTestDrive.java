package chapter4;
class Dog {
    int size;
    String name;

    void bark(int numOfBarks) {
        String barkSound;

        if (size > 60) {
            barkSound = "Гав Гав!";
        } else if (size > 14) {
            barkSound = "Вуф Вуф!";
        } else {
            barkSound = "Тяв Тяв!";
        }

        while (numOfBarks > 0) {
            System.out.println(barkSound);
            numOfBarks -= 1;
        }
    }
}

class DogTestDrive {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.name = "Мосель";
        one.size = 70;

        Dog two = new Dog();
        two.name = "Жопсель";
        two.size = 8;

        Dog three = new Dog();
        three.name = "Попсель";
        three.size = 35;

        one.bark(1);
        two.bark(2);
        three.bark(3);
    }
}
