public class JSONReport implements Report {
    private final Document document;

    public JSONReport(Document document) {
        this.document = document;
    }
    @Override
    public String key() {
        return "JSON";
    }

    @Override
    public Report report(Document document) {
        return new JSONReport(document);
    }

    @Override
    public String toString() {
        return "JSONReport{ " +
                "document= " + document +
                '}';
    }
}
