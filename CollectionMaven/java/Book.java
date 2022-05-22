import lombok.Builder;
import lombok.ToString;

import java.time.LocalDate;

@Builder
@ToString
public class Book {
    private final String isbn;
    private final String title;
    private final String genre;
    private final String author;
    private final LocalDate published;
    private final String description;
}

class Main {
    public static void main(String[] args) {
        var book = Book.builder()
                .author("Author")
                .title("Title")
                .build();
        System.out.println(book);
    }
}
