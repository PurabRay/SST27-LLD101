public class Demo05 {
    public static void main(String[] args) {
        ResizeStrategy strategy = new DefaultResizeStrategy(5, 4);
        ShapeResizer resizer = new ShapeResizer(strategy);
        System.out.println(resizer.areaAfterResize(new Rectangle())); 
        System.out.println(resizer.areaAfterResize(new Square())); 
    }
}