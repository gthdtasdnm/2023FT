package shapes;

public class DrawRectangle {
    private abstract class State {
        abstract void mouseUp(Pos p);
        abstract void mouseDown(Pos p);
        abstract void mouseMove(Pos p);
    }

    private final State WaitForClick = new State(){

        @Override
        public void mouseUp(Pos p) {
            throw new RuntimeException();
        }

        @Override
        public void mouseDown(Pos p) {
            rect.setA(p);
            setState(Dragging);
        }

        @Override
        public void mouseMove(Pos p) {
            //
        }
    };

    private final State Dragging = new State(){

        @Override
        public void mouseUp(Pos p) {
            rect.setB(p);
            setState(WaitForClick);
        }

        @Override
        public void mouseDown(Pos p) {
            throw new RuntimeException();
        }

        @Override
        public void mouseMove(Pos p) {
            rect.setB(p);
        }
    };

    private final Rectangle rect = new Rectangle();
    private State state = WaitForClick;

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




