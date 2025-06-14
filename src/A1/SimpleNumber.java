package A1;

public class SimpleNumber extends MagicNumber {
    public int j;

    SimpleNumber() {
        init();
    }

    @Override
    protected void init() {
        j = 4;
    }

    @Override
    public String toString() {
        return super.toString() + j;
    }

    public static void main(String[] args) {
        SimpleNumber s = new SimpleNumber();
        System.out.println("s.i = " + s.i);
        System.out.println("s.j = " + s.j);
        System.out.println(s);
    }
}
