package shapes;

public class Circle implements Shape{
    private int radius;
    private Pos center;

    public Circle(){
        this(new Pos(),0);
    }

    public Circle(Pos center, int radius){
        if(radius < 0){
            throw new IllegalArgumentException("du hund");
        }
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public Pos getCenter() {
        return center;
    }

    public void setRadius(int radius) {
        if(radius < 0){
            throw new IllegalArgumentException("richtiger hund");
        }
        this.radius = radius;
    }

    public void setCenter(Pos center) {
        this.center = center;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
