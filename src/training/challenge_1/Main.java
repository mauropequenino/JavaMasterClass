package training.challenge_1;

public class Main {
    public static void main(String[] args) {
        RegistoEstudante teste = new RegistoEstudante();
        teste.verPerfil();
        RegistoEstudante estudante1 = new RegistoEstudante("John","Doe","Desenvolvimento de Software");
        estudante1.verPerfil();
        RegistoEstudante estudante2 = new RegistoEstudante("Jane", "Monro","Analise de Sistemas");
        estudante2.verPerfil();
    }
}
