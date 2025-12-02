package chapter1;

class Player {
    int number;
    void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("Думаю что это число - " + number);
    }
}
