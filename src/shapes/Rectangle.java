package shapes;

public class Rectangle implements Shape {
    private Pos a;
    private Pos b;

    public Rectangle(){
        this(new Pos(),new Pos());
    }

    public Rectangle(Pos a, Pos b){
        this.a = a;
        this.b = b;
    }

    public Pos getA() {
        return a;
    }

    public Pos getB() {
        return b;
    }

    public void setA(Pos a) {
        this.a = a;
    }

    public void setB(Pos b) {
        this.b = b;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
