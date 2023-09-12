public class PDFReport implements Report{
    private final Document document;

    public PDFReport(Document document) {
        this.document = document;
    }

    @Override
    public String key() {
        return "PDF";
    }

    @Override
    public Report report(Document document) {
        return new PDFReport(document);
    }

    @Override
    public String toString() {
        return "PDF{ " +
                "document= " + document +
                '}';
    }
}
