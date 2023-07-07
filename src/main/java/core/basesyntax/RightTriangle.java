package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("core.basesyntax.Figure: " + getClass().getSimpleName()
                + ", first leg: " + firstLeg + ", second leg " + secondLeg
                + ", color: " + getColor() + ", area: " + calculateArea());
    }

    @Override
    public double calculateArea() {
        return (double)(firstLeg * secondLeg) / 2;
    }
}