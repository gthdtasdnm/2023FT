package shapes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DrawRectangleTest {

    @Test
    public void testTransitionToDragging() {
        final DrawRectangle d = new DrawRectangle();
        final Pos p1 = new Pos(4, 2);
        d.mouseDown(p1);
        assertEquals(p1, d.getRectangle().getA());
    }

    @Test
    public void testTransitionToDragging2() {
        DrawRectangle dr = new DrawRectangle();
        Pos start = new Pos(1, 2);
        dr.mouseDown(start);
        assertEquals(start, dr.getRectangle().getA());
    }

    @Test
    public void testDraggingSetsEndPoint() {
        DrawRectangle dr = new DrawRectangle();
        Pos start = new Pos(1, 2);
        Pos move = new Pos(3, 4);

        dr.mouseDown(start); // Zustand: Dragging
        dr.mouseMove(move);

        assertEquals(start, dr.getRectangle().getA());
        assertEquals(move, dr.getRectangle().getB());
    }

    @Test
    public void testMouseUpReturnsToWaitState() {
        DrawRectangle dr = new DrawRectangle();
        Pos p1 = new Pos(1, 1);
        Pos p2 = new Pos(2, 2);

        dr.mouseDown(p1);
        dr.mouseMove(p2);
        dr.mouseUp(p2);

        assertEquals(p1, dr.getRectangle().getA());
        assertEquals(p2, dr.getRectangle().getB());
    }
}
