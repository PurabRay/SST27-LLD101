public class PrinterService {
    private final Printable printable;
    private final Scannable scannable;

    public PrinterService(Printable printable, Scannable scannable) {
        this.printable = printable;
        this.scannable = scannable;
    }

    public void print(String text) {
        printable.print(text);
    }

    public void scan(String dstPath) {
        if (scannable == null) {
            System.out.println("Scanning not supported");
        } else {
            scannable.scan(dstPath);
        }
    }
}