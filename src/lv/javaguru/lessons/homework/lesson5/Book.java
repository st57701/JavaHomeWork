package lv.javaguru.lessons.homework.lesson5;

import java.util.Objects;

public class Book {
    private String author;
    private String title;
    private int pageCount;

    Book(String author, String title, int pageCount) {
        this.author=author;
        this.title=title;
        this.pageCount=pageCount;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(author);
    }
    @Override
    public String toString() {
        return "Book{"+ title + "author " + author + " page " + pageCount;
    }
}
