public class ReportService {
    private final Logger logger;
    private final ReportGenerator reportGenerator;
    private final ReportOutput reportOutput;

    public ReportService(Logger logger, ReportGenerator reportGenerator, ReportOutput reportOutput) {
        this.logger = logger;
        this.reportGenerator = reportGenerator;
        this.reportOutput = reportOutput;
    }

    public void generate() {
        logger.log("Generating daily report...");
        String content = reportGenerator.generateReport();
        reportOutput.output(content);
    }
}