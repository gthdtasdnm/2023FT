package A1;

public class Foo {
    private int i;
    public Foo() { this.i = 0; }
    public Foo(int i) { this.i = i; }
    public void process() { this.process(1); }
    public void inc() { this.process(1);}
    public void process(int i) { this.i += i;}
    public int get() { return this.i; }

    public static void main(String[] args) {
        Foo f = new Foo(1);
        f.process(2);
        f.inc();
        System.out.println(f.get());
    }
}

// a) Zeile 4
// b) 4
// c)
//3 nicht nötig
//4 nötig
//5 nicht nötig
//6 nicht nötig
//7 nötig
//8 nicht nötig
