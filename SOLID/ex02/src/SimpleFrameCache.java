public class SimpleFrameCache implements FrameCache {
    private Frame last;

    @Override
    public void cache(Frame frame) {
        this.last = frame;
    }

    @Override
    public boolean isCached() {
        return last != null;
    }
}