package poo.composition.livro;

public class Autor {
    private String nome;
    private int code;

    public Autor(String nome, int code) {
        this.nome = nome;
        this.code = code;
    }

    public String getNome() {
        return nome;
    }

    public int getCode() {
        return code;
    }
}
