package chapter11;

public class TestExceptions {
    public static void main(String[] args) {
        String test = "yes";
        try {
            doRisky(test);
        } catch (ScaryException ex)  {
            System.out.println("жуткое исключение");
        } finally {
            System.out.println("finally");
        }
        System.out.println("конец main");
    }
    static void doRisky(String test) throws ScaryException {
        System.out.println("начало опасного метода");
        if ("yes".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("конец опасного метода");
    }


    private static class ScaryException extends Exception {
    }
}
