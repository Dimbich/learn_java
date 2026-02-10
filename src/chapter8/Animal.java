package chapter8;

public abstract class Animal {

    public abstract String getName();

    public abstract void makeNoise();

    public abstract void eat();

    public void sleep() {
        System.out.println(getName() + " спит: z-z-z");
    }
}

abstract class Canine extends Animal {

    @Override
    public void makeNoise() {
        System.out.println(getName() + " воет");
    }
}

class Wolf extends Canine {

    @Override
    public String getName() {
        return "Волк";
    }

    @Override
    public void eat() {
        System.out.println("Волк ест мясо");
    }
}

abstract class Feline extends Animal {

    @Override
    public void makeNoise() {
        System.out.println(getName() + " рычит");
    }
}

class Lion extends Feline {

    @Override
    public String getName() {
        return "Лев";
    }

    @Override
    public void eat() {
        System.out.println("Лев ест добычу");
    }
}

class Cat extends Feline {

    @Override
    public String getName() {
        return "Кошка";
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест корм");
    }
}
