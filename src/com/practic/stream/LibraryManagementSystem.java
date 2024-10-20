package com.practic.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Book{
    private String title;
    private String author;
    private String genre;
    private int publicationYear;

    public Book(String title, String author, String genre, int publicationYear) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    @Override
    public String toString() {
        return String.format("%s by %s (%d) - Genre: %s", title, author, publicationYear, genre);
    }

}
class Library{
    private List<Book> books;

    public Library(){
        this.books=new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }
    public List<Book> searchByAuthor(String author){
         return books.stream().filter(b->b.getAuthor().equalsIgnoreCase("author")).toList();
    }
    public List<Book> searchByGenre(String genre){
        return books.stream().filter(m->m.getGenre().equalsIgnoreCase(genre)).toList();
    }

    public Optional<Book> searchByTitle(String title){
        return books.stream().filter(n->n.getTitle().equalsIgnoreCase("title")).findFirst();
    }

    public Map<String,List<Book>> groupByGenre(){
        return books.stream().collect(Collectors.groupingBy(Book::getGenre));
    }
    public void display(){
        books.forEach(System.out::println);
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {

        Library library=new Library();
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 1937));
        library.addBook(new Book("1984", "George Orwell", "Dystopian", 1949));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", 1960));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 1925));
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction", 1951));
        library.addBook(new Book("Brave New World", "Aldous Huxley", "Dystopian", 1932));

        //display all the library books
        library.display();

       //Search book by Author
        System.out.println("\nBooks by George Orwell:");
        List<Book> author=library.searchByAuthor("George Orwell");
        author.forEach(System.out::println);

        //search book by title
        System.out.println("\nSearching for '1984':");
        Optional<Book> title=library.searchByTitle("1984");
        title.ifPresentOrElse(System.out::println,()-> System.out.println("Book not found"));

       //Group book by gene
        System.out.println("\nBooks Grouped by Genre:");
        Map<String,List<Book>> group=library.groupByGenre();

        for(Map.Entry<String,List<Book>> mn:group.entrySet()){
            System.out.println(mn.getKey()+" "+mn.getValue());
        }


    }
}
