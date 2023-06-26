public class Circle implements Figure {
    private float radious;

    public Circle(float radious) {
        this.radious = radious;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radious * radious);
    }
}
