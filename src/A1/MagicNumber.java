package A1;

public class MagicNumber {
    public int i = 2;

    public MagicNumber() {
        init();
    }

    protected void init() {
        i = 42;
    }

    @Override
    public String toString() {
        return String.valueOf(i);
    }
}

