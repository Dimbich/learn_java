package chapter8;

interface Note {
    int iMethod();
}

abstract class Picasso implements Note {
    @Override
    public int iMethod() {
        return 7;
    }
}

class Acts extends Picasso {
    @Override
    public int iMethod() {
        return 5;
    }
}

class Clowns extends Picasso{}

public class Of76 extends Clowns{
    public static void main(String[] args) {
        Note[] i = new Note[3];
        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new Of76();

        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j].iMethod() + " " + i[j].getClass());
        }
    }
}
