package lv.javaguru.lessons.homework.lesson9.UniqueWordVocabulary.Test.Exer3;

import java.util.ArrayList;
import java.util.List;

public class Library {


    List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        Library firstLibrary = new Library();
        firstLibrary.addBook("Tolstoy", "War and Peas");
        firstLibrary.addBook("Gogol", "The Gamblers");
        firstLibrary.addBook("Gogol", "Dead Souls");

        firstLibrary.showBooks();


        System.out.println(firstLibrary.getBookByTitle("Dead Souls"));
        System.out.println(firstLibrary.getBooksByAuthor("Gogol"));
        firstLibrary.removeBook("Dead Souls");
        firstLibrary.showBooks();

    }

    public void addBook(String author, String title) {
        //Book book = new Book(author, title);
        bookList.add(new Book(author, title));


    }

    public void removeBook(String title) {
        for (int i = 0; i < bookList.size(); i++) {
            if (this.bookList.get(i).getTitle() == title) {
                bookList.remove(i);
                System.out.println("Book \"" + title + "\" Removed form Library");
            }

        }
    }

    public void showBooks() {
        System.out.println(bookList);
        System.out.println("Count of Books in Library: "+bookList.size());
        System.out.println();
    }

    public List<String> getBookByTitle(String title) {
        List<String> booksByTitle = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (this.bookList.get(i).getTitle() == title) {
                booksByTitle.add(bookList.get(i).toString());


            }

        }System.out.print("We have found these books with title \""+ title +"\" :" );
        return booksByTitle;
    }

    public List<String> getBooksByAuthor(String author) {
        List<String> titleByAuthor = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (this.bookList.get(i).getAuthor() == author) {
                titleByAuthor.add(bookList.get(i).getTitle());


            }

        }
        System.out.print(author + " Has books in our Library : ");
        return titleByAuthor;
    }
}