public class Demo06 {
    public static void main(String[] args) {
        Aviary aviary = new Aviary();
        aviary.release(new Bird(new FlyingBehavior()));
        aviary.release(new Penguin(new NonFlyingBehavior()));
    }
}