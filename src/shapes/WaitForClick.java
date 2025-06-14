package shapes;

public class WaitForClick implements State{
    private final DrawRectangle context;

    public WaitForClick(DrawRectangle context) {
        this.context = context;
    }

    @Override
    public void mouseUp(Pos p) {
        throw new RuntimeException();
    }

    @Override
    public void mouseDown(Pos p) {
        context.getRectangle().setA(p);
        context.setState(new Dragging(context));
    }

    @Override
    public void mouseMove(Pos p) {
        context.setState(new WaitForClick(context));
        //kann auch weggelassen werden
    }
}
