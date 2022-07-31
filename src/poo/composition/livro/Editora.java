package poo.composition.livro;

import java.util.ArrayList;

public class Editora {
    private int code;
    private String name;

    private ArrayList<Livro> livros = new ArrayList<Livro>();

    public Editora(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public boolean addLivro(Livro livro){
        this.livros.add(livro);
        return true;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }
}
