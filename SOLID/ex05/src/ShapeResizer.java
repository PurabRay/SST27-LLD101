public class ShapeResizer {
    private final ResizeStrategy strategy;

    public ShapeResizer(ResizeStrategy strategy) {
        this.strategy = strategy;
    }

    public int areaAfterResize(ResizableShape shape) {
        strategy.resize(shape);
        return shape.area();
    }
}