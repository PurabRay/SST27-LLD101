public class Bird implements Releasable {
    private final Releasable behavior;

    public Bird(Releasable behavior) {
        this.behavior = behavior;
    }

    @Override
    public void performReleaseAction() {
        behavior.performReleaseAction();
    }
}