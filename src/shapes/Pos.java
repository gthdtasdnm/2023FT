package shapes;

public class Pos {
    private int x, y;

    public Pos() {
        this(0, 0);
        //new shapes.Pos(0,0);
    }

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public int hashCode(){
        return 31 * x + 17 * y;
    }

    public boolean equals(Object o){
        Pos p = (Pos) o;
        return (x == p.getX() && y == p.getY());
    }
}
