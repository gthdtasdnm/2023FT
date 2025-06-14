package shapes;

public class DrawRectangle {
    final WaitForClick waitForClick = new WaitForClick(this);
    final Dragging dragging = new Dragging(this);
    private final Rectangle rect = new Rectangle();
    private State state = waitForClick;

    void setState(State s) {
        state = s;
    }

    public Rectangle getRectangle() {
        return rect;
    }

    public void mouseDown(Pos p) {
        state.mouseDown(p);
    }

    public void mouseUp(Pos p) {
        state.mouseUp(p);
    }

    public void mouseMove(Pos p) {
        state.mouseMove(p);
    }
}

