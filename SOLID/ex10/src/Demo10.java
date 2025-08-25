public class Demo10 {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        ReportGenerator reportGenerator = new DailyReportGenerator();
        ReportOutput reportOutput = new ConsoleReportOutput();
        ReportService service = new ReportService(logger, reportGenerator, reportOutput);
        service.generate();
    }
}