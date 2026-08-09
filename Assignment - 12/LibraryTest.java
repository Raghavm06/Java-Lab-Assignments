import library.Book;

public class LibraryTest {

    public static void main(String[] args) {

        Book b = new Book(
            101,
            "Java Programming",
            "Herbert Schildt",
            850
        );

        b.display();
    }
}