package arrays.bookdatabase;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static BookDatabase bookDB = new BookDatabase();

    public static void main(String[] args) {
        boolean quit = false;
        printDatabaseOptions();

        while(!quit){
            System.out.println("\nEscolha a sua opcao (6 - Exibir as opcoes disponiveis)");
            int action = sc.nextInt();
            sc.nextLine();
            switch (action){
                case 0:
                    System.out.println("Terminado!");
                    quit = true;
                    break;
                case 1:
                    bookDB.printBookList();
                    break;
                case 2:
                    addNewBook();
                    break;
                case 3:
                    updateBook();
                    break;
                case 4:
                    removeBook();
                    break;
                case 5:
                    queryBook();
                    break;
                case 6:
                    printDatabaseOptions();
                    break;
            }
        }
    }
    public static void addNewBook(){
        System.out.print("Insira o codigo ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Insira o titulo: ");
        String title = sc.nextLine();
        System.out.print("Insira o autor: ");
        String author = sc.nextLine();
        System.out.print("Insira a editora: ");
        String publisher = sc.nextLine();
        System.out.print("Insira a cateogira: ");
        String category = sc.nextLine();
        System.out.print("Insira o total pageinas: ");
        String pages = sc.nextLine();

        Book book = Book.createNewBook(isbn, title, author, publisher, category, pages);
        if (bookDB.addNewBook(book)){
            System.out.println("Novo livro adicionado com sucesso!");
        } else {
            System.out.println("Erro ao adicionar o livro, tente novamente!");
        }
    }

    public static void updateBook(){
        System.out.print("Insira o titulo de um livro: ");
        String existingTitle = sc.nextLine();
        Book existingBookRecord = bookDB.queryBook(existingTitle);
        if(existingBookRecord == null){
            System.out.println("Livro nao encontrado");
            return;
        }

        System.out.print("Insira o codigo ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Insira o titulo: ");
        String title = sc.nextLine();
        System.out.print("Insira o autor: ");
        String author = sc.nextLine();
        System.out.print("Insira a editora: ");
        String publisher = sc.nextLine();
        System.out.print("Insira a cateogira: ");
        String category = sc.nextLine();
        System.out.print("Insira o total pageinas: ");
        String pages = sc.nextLine();

        Book newbook = Book.createNewBook(isbn, title, author, publisher, category, pages);
        if (bookDB.updateBook(existingBookRecord, newbook)){
            System.out.println("Actualizado com sucesso!");
        } else {
            System.out.println("Nao foi possivel actualizar o livro!");
        }
    }

    public static void removeBook(){
        System.out.print("Insira o titulo de um livro: ");
        String existingTitle = sc.nextLine();
        Book existingBookRecord = bookDB.queryBook(existingTitle);
        if(existingBookRecord == null){
            System.out.println("Livro nao encontrado");
            return;
        }
        bookDB.removeBook(existingBookRecord);
    }

    public static void queryBook(){
        System.out.print("Insira o titulo de um livro: ");
        String title = sc.nextLine();
        Book existingBook = bookDB.queryBook(title);
        if(existingBook == null){
            System.out.println("Livro nao encontrado");
            return;
        }
        System.out.println("ISBN: " + existingBook.getIsbn() +
                "\nTitle: " + existingBook.getTitle() +
                "\nAutor: " + existingBook.getAuthor() +
                "\nEditora: " + existingBook.getPublisher() +
                "\nCategoria: " + existingBook.getCategory() +
                "\nPages: " +existingBook.getPages());
    }


    public static void printDatabaseOptions(){

        System.out.println("\nOptions disponiveis:\n");
        System.out.println("""
                0 - Terminar
                1 - Exibir a lista de livros
                2 - Adicionar um novo livro
                3 - Editar um livro
                4 - Eliminar um livro
                5 - Procurar um livro
                6 - Exibir as opcoes disponiveis
                """);
        System.out.print("Escolha a sua opcao: ");

    }
}
