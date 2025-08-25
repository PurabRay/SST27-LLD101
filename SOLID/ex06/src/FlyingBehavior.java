public class FlyingBehavior implements Releasable {
    @Override
    public void performReleaseAction() {
        System.out.println("Flap!");
    }
}