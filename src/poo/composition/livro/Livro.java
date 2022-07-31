package poo.composition.livro;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private int code;
    private String titulo;
    private int ano;
    private Autor autor;

    public Livro(int code, String titulo, int ano, Autor autor) {
        this.code = code;
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
    }


    public int getCode() {
        return code;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public Autor getAutor() {
        return autor;
    }
}
