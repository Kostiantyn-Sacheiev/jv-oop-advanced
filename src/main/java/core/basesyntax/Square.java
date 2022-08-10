package core.basesyntax;

public class Square extends Figure {

    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void printState() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + getSide() + ", color: " + getColor());
    }

    public int getSide() {
        return side;
    }
}