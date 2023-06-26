public class Rectangle implements Figure {
    private float base;
    private float height;

    public Rectangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float getArea() {
        return base * height;
    }
}
