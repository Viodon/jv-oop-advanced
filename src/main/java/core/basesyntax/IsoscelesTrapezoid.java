package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperBase;
    private int lowerBase;
    private int height;

    public IsoscelesTrapezoid(String color, int upperBase, int lowerBase, int height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("core.basesyntax.Figure: " + getClass().getSimpleName()
                + ", height: " + height + ", upper base: " + upperBase
                + ", lower base: " + lowerBase + ", color: " + getColor()
                + ", area: " + calculateArea());
    }

    @Override
    public double calculateArea() {
        return ((double)(upperBase + lowerBase) / 2) * height;
    }
}