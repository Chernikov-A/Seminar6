public class XMLReport implements Report{
    private final Document document;

    public XMLReport(Document document) {
        this.document = document;
    }

    @Override
    public String key() {
        return "XML";
    }

    @Override
    public Report report(Document document) {
        return new XMLReport(document);
    }

    @Override
    public String toString() {
        return "XMLReport{ " +
                "document= " + document +
                '}';
    }
}
