public class ConsoleReportOutput implements ReportOutput {
    @Override
    public void output(String content) {
        System.out.println(content);
    }
}