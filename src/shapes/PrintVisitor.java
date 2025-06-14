package shapes;

public class PrintVisitor implements Visitor {
    private int i = 1;

    @Override
    public void visit(Circle c) {
        System.out.println(i + ": shapes.Circle centered at " + c.getCenter() + " with radius " + c.getRadius());
    }

    @Override
    public void visit(Rectangle r) {
        System.out.println(i + ": shapes.Rectangle from " + r.getA() + " to " + r.getB());
        i++;
    }
}
