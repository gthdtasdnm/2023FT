package shapes;

import java.util.ArrayList;
import java.util.List;

public class VisitorDemo {
    public static void main(String[] args) {
        final List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(new Pos(1, 2), new Pos(3, 4)));
        shapes.add(new Circle(new Pos(1, 1), 1));

        final Visitor v = new PrintVisitor();
        for (final Shape s : shapes) {
            s.accept(v);
        }
    }
}

