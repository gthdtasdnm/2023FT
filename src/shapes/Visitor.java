package shapes;

public interface Visitor {
    void visit(Circle c);
    void visit(Rectangle r);
}
