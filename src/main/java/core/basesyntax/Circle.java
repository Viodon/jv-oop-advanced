package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("core.basesyntax.Figure: " + getClass().getSimpleName()
                + ", radius: " + radius + ", color: " + getColor() + ", area: " + calculateArea());
    }
}