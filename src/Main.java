import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Заявление","Прошу предоставить оплачиваемый отпуск");
        ReportEntrypoint reportEntrypoint = new ReportEntrypoint(List.of(
                new JSONReport(document),
                new XMLReport(document),
                new PDFReport(document)));
        System.out.println(reportEntrypoint.create(document,"XML"));
        System.out.println(reportEntrypoint.create(document,"PDF"));
        System.out.println(reportEntrypoint.create(document,"JSON"));
    }
}