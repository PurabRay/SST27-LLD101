public class Penguin implements Releasable {
    private final Releasable behavior;

    public Penguin(Releasable behavior) {
        this.behavior = behavior;
    }

    @Override
    public void performReleaseAction() {
        behavior.performReleaseAction();
    }
}