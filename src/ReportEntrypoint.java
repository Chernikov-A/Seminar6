import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReportEntrypoint {

    private final Map<String,Report> reportMap;

    public ReportEntrypoint(List<Report> ListReport) {
        reportMap = ListReport.stream().collect(Collectors.toMap(Report::key, Function.identity()));
    }

    public Report create(Document document, String reportType){
        Report report = reportMap.get(reportType);
        if (reportType!=null){
            return report.report(document);
        }
        throw new UnsupportedOperationException("Not implemented ");
    }

}
