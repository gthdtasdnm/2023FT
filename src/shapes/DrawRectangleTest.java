package shapes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DrawRectangleTest {

    //Test aus der Aufgabe
    @Test
    public void testTransitionToDragging() {
        final DrawRectangle d = new DrawRectangle();
        final Pos p1 = new Pos(4, 2);
        d.mouseDown(p1);
        assertEquals(p1, d.getRectangle().getA());
    }


    //Eigene Tests
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
    public void testTransitionBackToWaitForClick() {
        DrawRectangle dr = new DrawRectangle();
        Pos start = new Pos(0, 0);
        Pos end = new Pos(2, 2);

        dr.mouseDown(start); // Zustand: Dragging
        dr.mouseUp(end);     // zurück zu WaitForClick

        assertEquals(start, dr.getRectangle().getA());
        assertEquals(end, dr.getRectangle().getB());
    }

    @Test
    public void testIllegalMouseUpInWaitForClick() {
        DrawRectangle dr = new DrawRectangle();
        assertThrows(RuntimeException.class, () -> {
            dr.mouseUp(new Pos(1, 1));
        });
    }

    @Test
    public void testIllegalMouseDownInDragging() {
        DrawRectangle dr = new DrawRectangle();
        dr.mouseDown(new Pos(1, 1)); // Zustand: Dragging
        assertThrows(RuntimeException.class, () -> {
            dr.mouseDown(new Pos(2, 2));
        });
    }
}

