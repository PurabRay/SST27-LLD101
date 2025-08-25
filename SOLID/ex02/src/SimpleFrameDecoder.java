public class SimpleFrameDecoder implements FrameDecoder {
    @Override
    public Frame decode(byte[] fileBytes) {
        return new Frame(fileBytes);
    }
}