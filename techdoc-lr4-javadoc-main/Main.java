/**
 * Основной класс для запуска программы библиотеки.
 */
public class Main {

    /**
     * Основная функция для запуска программы.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Library library = new Library();

        // Добавление книг
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");
        library.addBook(book1);
        library.addBook(book2);

        // Добавление членов
        Member member1 = new Member("Alice", 1);
        Member member2 = new Member("Bob", 2);
        library.addMember(member1);
        library.addMember(member2);

        // Проверка выдачи книги
        System.out.println(library.checkOutBook(1, "1234567890"));  // Alice checks out 1984
        System.out.println(library.checkOutBook(2, "1234567890"));  // Bob tries to check out 1984 again

        // Возврат книги
        System.out.println(library.returnBook("1234567890"));  // Return 1984
        System.out.println(library.checkOutBook(2, "1234567890"));  // Bob checks out 1984
    }
}