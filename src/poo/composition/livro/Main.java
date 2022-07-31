package poo.composition.livro;

public class Main {
    public static void main(String[] args) {
        Editora edtiora = new Editora(5555,"Books Day");
        edtiora.addLivro(new Livro(112,"Wonderland",2021, new Autor("Disney",322)));
        edtiora.addLivro(new Livro(113, "Get Rich",2002, new Autor("John Doe", 333)));
        System.out.println(edtiora.getLivros().get(1).getTitulo());
    }
}
