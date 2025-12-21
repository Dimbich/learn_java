package chapter10;

class Foo {
    static int x;
    public void go() {
        System.out.println(x);
    }
}

//class Foo2 {
//    int x;
//    public static void go() {
//        System.out.println(x);
//    }
//}

class Foo3 {
    public Foo3(int x) {
        this.x = x;
    }

    final int x;

//    public void go() {
//        System.out.println(x);
//    }
}

class Foo4 {
    static final int x = 10;
    public static void go() {
        System.out.println(x);
    }
}

class Foo5 {
    static final int x = 10;
    public void go(final int x) {
        System.out.println(x);
    }
}

class Foo6 {
    int x = 10;
    public void go(final int x) {
        System.out.println(x);
    }
}


public class test {
    public static void main(String[] args) {

    }
}
