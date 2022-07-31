package arrays.bookdatabase;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String category;
    private String pages;

    public Book(String isbn, String title, String author, String publisher, String category, String pages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.pages = pages;
    }

    public static Book createNewBook(String isbn, String title, String author, String publisher, String category, String pages){
        return new Book(isbn, title, author, publisher, category, pages);
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getCategory() {
        return category;
    }

    public String getPages() {
        return pages;
    }
}
