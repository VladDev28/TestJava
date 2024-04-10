package Lab3ex1;

public class Punct {
    private final int x;
    private final int y;

    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punct{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
