public class Aviary {
    public void release(Releasable releasable) {
        releasable.performReleaseAction();
        System.out.println("Released");
    }
}