import java.util.ArrayList;
import java.util.List;

public class Book {

    private final String tittle;
    private final List<String> paragraphs = new ArrayList<>();
    private final List<String> images = new ArrayList<>();
    private final List<String> tables = new ArrayList<>();

    public Book(String tittle) {
        this.tittle = tittle;
    }

    public void createNewParagraph(final String paragraph) {
        paragraphs.add(paragraph);
    }

    public void createNewImage(final String imageUrl) {
        images.add(imageUrl);
    }

    public void createNewTable(final String table) {
        tables.add(table);
    }

    @Override
    public String toString() {
        return tittle  + "Paragraphs: \n" + String.join("\n", paragraphs)
                + "\nImages:\n" + String.join("\n", images)
                + "\nTables:\n" + String.join("\n", tables);
    }

    public void print() {
        System.out.print(this);
    }
}
