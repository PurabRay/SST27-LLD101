public class MediaPlayer {
    private final FrameDecoder decoder;
    private final FrameRenderer renderer;
    private final FrameCache cache;

    public MediaPlayer(FrameDecoder decoder, FrameRenderer renderer, FrameCache cache) {
        this.decoder = decoder;
        this.renderer = renderer;
        this.cache = cache;
    }

    public void play(byte[] fileBytes) {
        Frame frame = decoder.decode(fileBytes);
        renderer.render(frame);
        cache.cache(frame);
        // Print cache status (same as original behavior)
        System.out.println("Cached last frame? " + cache.isCached());
    }
}