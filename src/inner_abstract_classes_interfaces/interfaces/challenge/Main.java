package inner_abstract_classes_interfaces.interfaces.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Crie uma interface simples que permita que um objeto seja salvo em algum tipo de meio de armazenamento.
    // O tipo exato de meio não é conhecido pela interface (nem pelas classes que o implementam).
    // A interface irá especificar apenas 2 métodos, um para retornar um ArrayList de valores a serem salvos
    // e outro para preencher os campos do objeto de um ArrayList.
    //
    // Crie algumas classes de amostra que implementem sua interface salvável (usamos a ideia de um jogo,
    // com Jogadores e Monstros, mas você pode criar qualquer tipo de classe que desejar).
    //
    // Substitua o método toString() para cada uma de suas classes para que elas possam ser facilmente impressas para habilitar
    // o programa a ser testado é mais fácil.
    //
    // Em InnerStellar, escreva um método que recebe um objeto que implementa a interface como parâmetro e
    // "salva" os valores.
    // Ainda não abordamos a E/S, então seu método deve apenas imprimir os valores na tela.
    // Também em InnerStellar, escreva um método que restaure os valores para um objeto que pode ser salvo.
    // Novamente, não vamos usar E/S de arquivo Java; em vez disso, use o método readValues() abaixo para
    // simula a obtenção de valores de um arquivo – isso permite que você digite tantos valores quanto sua classe
    // requer e retorna um ArrayList.
    public static void main(String[] args) {
        Player tim = new Player("Tim", 10,15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
        loadObject(tim);
        System.out.println(tim);

        Isaveable warewolf = new Monster("Werewolf", 20,40);
        System.out.println("Strebgth = " + ((Monster) warewolf).getStrength());
        saveObject(warewolf);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> valeus = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("""
                Choose
                1 to enter a string
                2 to quit
                """);

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String strinInput = sc.nextLine();
                    valeus.add(index, strinInput);
                    index++;
                    break;
            }
        }

        return  valeus;
    }


    //Passando uma interface como parametro, temos uma acesso a todos metodos da interface
    public static void saveObject(Isaveable objectToSave) {
        for(int i=0;i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }
    public static void loadObject(Isaveable objecToLoad){
        List<String> values = readValues();
        objecToLoad.read(values);
    }
}
