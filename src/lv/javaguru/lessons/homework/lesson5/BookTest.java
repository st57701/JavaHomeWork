package lv.javaguru.lessons.homework.lesson5;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Tolstoj", "Voina i mir ", 300);
        Book book2 = book1;
        Book book3 = new Book("Pushkin", "ruslan i ludmila", 222);
        System.out.println(book1.equals(book1));
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));

        System.out.println(book1);
    }
}
