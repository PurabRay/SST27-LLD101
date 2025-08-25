public class Demo07 {
    public static void main(String[] args) {
        PrinterService basicService = new PrinterService(new BasicPrinter(), null);
        basicService.print("Hello");
        basicService.scan("/tmp/out");
        PrinterService multiFunctionService = new PrinterService(new MultiFunctionPrinter(), new MultiFunctionPrinter());
        multiFunctionService.print("Hello");
        multiFunctionService.scan("/tmp/out");
    }
}