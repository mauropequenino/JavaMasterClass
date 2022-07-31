package training.challenge_2;

public class Cidadao {
    private int id;
    private String nome;
    private String apelido;

    public Cidadao (Cidadao c) {
        this.id = c.id;
        this.nome = c.nome;
        this.apelido = c.apelido;;
    }

    public Cidadao(int id, String nome, String apelido) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }
}
