public class DefaultResizeStrategy implements ResizeStrategy {
    private final int width;
    private final int height;

    public DefaultResizeStrategy(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(ResizableShape shape) {
        shape.setWidth(width);
        shape.setHeight(height); 
    }
}