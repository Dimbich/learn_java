package chapter10;

public class TextBox {
    Integer i;
    int j;

    public void go() {
        j = i;
        System.out.println(j);
        System.out.println(i);
    }

    public static void main(String[] args) {
        TextBox tb = new TextBox();
        tb.go();
    }
}
