public class Demo02 {
    public static void main(String[] args) {
        FrameDecoder decoder = new SimpleFrameDecoder();
        FrameRenderer renderer = new ConsoleFrameRenderer();
        FrameCache cache = new SimpleFrameCache();
        MediaPlayer player = new MediaPlayer(decoder, renderer, cache);
        player.play(new byte[]{1, 2, 3, 4});
    }
}