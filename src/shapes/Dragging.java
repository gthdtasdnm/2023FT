package shapes;

public class Dragging implements State{
    private final DrawRectangle context;

    public Dragging(DrawRectangle context) {
        this.context = context;
    }

    @Override
    public void mouseUp(Pos p) {
        context.getRectangle().setB(p);
        context.setState((new WaitForClick(context)));
    }

    @Override
    public void mouseDown(Pos p) {
        throw new RuntimeException();
    }

    @Override
    public void mouseMove(Pos p) {
        context.getRectangle().setB(p);
        context.setState(new Dragging(context));
    }
}
