public class Square implements ResizableShape {
    private int side;

    @Override
    public void setWidth(int width) {
        this.side = width;
    }

    @Override
    public void setHeight(int height) {
        this.side = height; 
    }

    @Override
    public int area() {
        return side * side;
    }
}