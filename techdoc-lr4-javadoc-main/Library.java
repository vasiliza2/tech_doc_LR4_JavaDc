import java.util.ArrayList;
import java.util.List;

/**
 * Класс, представляющий библиотеку.
 */
public class Library {
    private List<Book> books;
    private List<Member> members;

    /**
     * Инициализация библиотеки с пустыми списками книг и членов.
     */
    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    /**
     * Добавляет книгу в библиотеку.
     *
     * @param book Книга для добавления.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Добавляет члена в библиотеку.
     *
     * @param member Член для добавления.
     */
    public void addMember(Member member) {
        members.add(member);
    }

    /**
     * Выдает книгу члену библиотеки.
     *
     * @param memberId Уникальный идентификатор члена.
     * @param isbn ISBN книги.
     * @return Сообщение о результате операции.
     */
    public String checkOutBook(int memberId, String isbn) {
        Member member = members.stream()
                .filter(m -> m.getMemberId() == memberId)
                .findFirst()
                .orElse(null);
        
        Book book = books.stream()
                .filter(b -> b.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null);

        if (member == null) {
            return "Член с таким ID не найден.";
        }
        if (book == null) {
            return "Книга с таким ISBN не найдена.";
        }
        if (book.checkOut()) {
            return "Книга '" + book.getTitle() + "' выдана члену '" + member.getName() + "'.";
        }
        return "Книга уже выдана.";
    }

    /**
     * Возвращает книгу в библиотеку.
     *
     * @param isbn ISBN книги.
     * @return Сообщение о результате операции.
     */
    public String returnBook(String isbn) {
        Book book = books.stream()
                .filter(b -> b.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null);
        
        if (book == null) {
            return "Книга с таким ISBN не найдена.";
        }
        if (book.returnBook()) {
            return "Книга '" + book.getTitle() + "' возвращена в библиотеку.";
        }
        return "Книга не была выдана.";
    }
}