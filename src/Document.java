import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Document {
    private UUID id;
    private String title;
    private String content;

    @Override
    public String toString() {
        return "Document{" +
                "id= " + id +
                ", title= '" + title + '\'' +
                ", content= '" + content + '\'' +
                '}';
    }

    public Document(String title, String content) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.content = content;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
