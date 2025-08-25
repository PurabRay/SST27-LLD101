public class NonFlyingBehavior implements Releasable {
    @Override
    public void performReleaseAction() {
        System.out.println("Waddle!");
    }
}