/**
 * Класс, представляющий члена библиотеки.
 */
public class Member {
    private String name;
    private int memberId;

    /**
     * Инициализация члена библиотеки.
     *
     * @param name Имя члена.
     * @param memberId Уникальный идентификатор члена.
     */
    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    /**
     *      * Возвращает имя члена.
     *
     * @return Имя члена.
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает уникальный идентификатор члена.
     *
     * @return Уникальный идентификатор члена.
     */
    public int getMemberId() {
        return memberId;
    }

    @Override
    public String toString() {
        return name + " (ID: " + memberId + ")";
    }
}