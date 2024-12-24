/**
 * Класс, представляющий книгу в библиотеке.
 */
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isCheckedOut;

    /**
     * Инициализация книги.
     *
     * @param title Название книги.
     * @param author Автор книги.
     * @param isbn ISBN книги.
     */
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isCheckedOut = false;
    }

    /**
     * Получает название книги.
     *
     * @return Название книги.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Получает автора книги.
     *
     * @return Автор книги.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Получает ISBN книги.
     *
     * @return ISBN книги.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Проверяет книгу на выдачу.
     *
     * @return true, если книга успешно выдана; false, если книга уже выдана.
     */
    public boolean checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            return true;
        }
        return false;
    }

    /**
     * Возвращает книгу в библиотеку.
     *
     * @return true, если книга успешно возвращена; false, если книга не была выдана.
     */
    public boolean returnBook() {
        if (isCheckedOut) {
            isCheckedOut = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + isbn + ")";
    }
}