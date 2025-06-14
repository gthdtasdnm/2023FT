package A1;

public class Overload {
    static private void process(int i) {
        System.out.println("i = " + i);
    }

    static private void process(String s) {
        System.out.println("s = " + s);
    }

    public static void main(String[] args) {
        Overload.process("1");
    }
}
