package training.challenge_2;

public class Docente extends Cidadao{
    private String id;

    public Docente(String id, Cidadao cidadao) {
        super(cidadao);
        this.id = id;
    }

    public Docente (int id, String nome, String apelido, String numero){
        this(numero, new Cidadao(id,nome,apelido));
    }

    public String getNumero() {
        return this.id;
    }

    public String getNome() {
        return super.getNome() + " " + super.getApelido();
    }
}
