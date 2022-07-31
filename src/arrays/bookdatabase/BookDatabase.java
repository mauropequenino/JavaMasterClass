package arrays.bookdatabase;

import java.util.ArrayList;

public class BookDatabase {
    private ArrayList<Book> bookList;

    public BookDatabase(){
        this.bookList = new ArrayList<Book>();
    }

    public boolean addNewBook(Book book){
        if(findBooks(book.getTitle()) >= 0){
            System.out.println("O livro ja existe");
            return false;
        }
        bookList.add(book);
        return true;
    }

    public int findBooks(Book book){
        return this.bookList.indexOf(book);
    }

    public int findBooks(String bookTitle){
        for(int i=0;i<bookList.size();i++){
            Book book = bookList.get(i);
            if(book.getTitle().equalsIgnoreCase(bookTitle)){
                return i;
            }
        }
        return -1;
    }

    public boolean updateBook(Book oldBook, Book newBook){
        int bookPosition = findBooks(oldBook);
        if(bookPosition < 0){
            System.out.println(oldBook.getTitle() + " nao encontrado");
            return false;
        } else if(findBooks(newBook.getTitle()) != -1){
            System.out.println("\nO livro ja existe");
            return false;
        }
        this.bookList.set(bookPosition, newBook);
        System.out.println(oldBook.getTitle() + " foi actualizado para " + newBook.getTitle());
        return true;
    }

    public boolean removeBook(Book book){
        int bookPosition = findBooks(book);
        if(bookPosition < 0){
            System.out.println(book.getTitle() + "nao encontrado");
            return false;
        }
        this.bookList.remove(book);
        System.out.println(book.getTitle() + " removido com successo");
        return true;
    }

    public String queryBook(Book book){
        if (findBooks(book) >= 0){
            return book.getTitle();
        }
        return null;
    }

    public Book queryBook(String bookName){
        int bookPosition = findBooks(bookName);
        if (bookPosition >= 0){
            return this.bookList.get(bookPosition);
        }
        return null;
    }

    public void printBookList(){
        if(bookList.size() > 0){
            for (int i=0;i<bookList.size();i++){
                System.out.println((i+1) + " - " + bookList.get(i).getTitle());
            }
        } else {
            System.out.println("Nenhum livro adicionado!");
        }

    }
}
