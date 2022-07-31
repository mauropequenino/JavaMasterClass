package training.challenge_1;

import java.util.Calendar;

public class RegistoEstudante {
    // Criar uma nova turma para uma conta bancária
    // Cria campos para o número da conta, saldo, nome do cliente, e-mail e telefone.
    //
    // Cria getters e setters para cada campo
    // Cria dois métodos adicionais
    // 1. Para permitir que o cliente deposite fundos (isso deve incrementar o campo saldo).
    // 2. Para permitir que o cliente retire fundos. Isso deve ser deduzido do campo de saldo,
    // mas não permite que a retirada seja concluída se os fundos forem insuficientes.
    // Você desejará criar vários códigos na classe Main (aquela criada pelo IntelliJ) para
    // confirma que seu código está funcionando.
    // Adicione alguns System.out.println's nos dois métodos acima também.
    private Calendar calendar;
    private String codigo;
    private String nome;
    private String apelido;
    private String curso;
    private String email;
    private String turma;
    private double mensalidade;

    private static int count = 1000;

    public RegistoEstudante() {
        this("Default","Default","Default");
        this.email = "defualt@mail.com";
        this.turma = "Default";
        this.codigo = "000000";
    }

    public RegistoEstudante(String nome, String apelido, String curso) {
        this.nome = nome;
        this.apelido = apelido;
        this.curso = curso;
        this.email = gerarEmail();
        this.codigo = gerarCodigo();
        this.turma = gerarTurma();
        this.count++;
    }

    private String gerarEmail(){
        return this.nome.toLowerCase() + this.apelido.toLowerCase() + "@noblestack.com";
    }

    private String gerarCodigo() {
        calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        return String.valueOf(year) + count;
    }

    private String gerarTurma() {
        calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        String turma = String.valueOf(year) +  this.curso.substring(0,2).toUpperCase();
        return turma;
    }

    public void verPerfil() {
        System.out.println("Codigo: " + codigo +
                "\nNome: " + nome + " " + apelido +
                "\nCurso: " + curso +
                "\nTurma: " + turma +
                "\nEmail: " + email +
                "\n================================");
    }
}
