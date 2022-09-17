package collections.lesson_4.exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    private static Map<Integer, Localizacao> locations = new HashMap<Integer, Localizacao>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        locations.put(0, new Localizacao(0,"You are standing at the end of a road"));
        locations.put(1, new Localizacao(1,"Voce na Inamar"));
        locations.put(2, new Localizacao(2,"Voce em na Marinha de Guerra"));
        locations.put(3, new Localizacao(3,"Voce em na esta no WaterFront"));
        locations.put(4, new Localizacao(4,"Voce em no Porto de Maputo"));
        locations.put(5, new Localizacao(5,"Voce em na Praca dos Trabalhores"));
        locations.put(6, new Localizacao(6,"Voce em no Predio 33 Andares"));
        locations.put(7, new Localizacao(7,"Voce em nos Correios"));
        locations.put(8, new Localizacao(8,"Voce em na Nova Baixa"));
        locations.put(9, new Localizacao(9,"Voce em na EPC 16 de Junho"));

        locations.get(1).addExist("O",2);
        locations.get(1).addExist("E",4);
        locations.get(1).addExist("N",6);
        locations.get(1).addExist("Q", 0);

        locations.get(2).addExist("O", 3);
        locations.get(2).addExist("E", 1);
        locations.get(2).addExist("Q", 0);

        locations.get(3).addExist("E", 2);
        locations.get(3).addExist("Q", 0);

        locations.get(4).addExist("E", 5);
        locations.get(4).addExist("O", 1);
        locations.get(4).addExist("Q", 0);

        locations.get(5).addExist("O", 4);
        locations.get(5).addExist("Q", 0);

        locations.get(6).addExist("N", 9);
        locations.get(6).addExist("O", 8);
        locations.get(6).addExist("E", 7);
        locations.get(6).addExist("S", 1);
        locations.get(6).addExist("Q", 0);

        locations.get(7).addExist("O", 6);
        locations.get(7).addExist("Q", 0);

        locations.get(8).addExist("E", 6);
        locations.get(8).addExist("Q", 0);

        locations.get(9).addExist("S", 6);
        locations.get(9).addExist("Q", 0);


        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }

            Map<String, Integer> exist = locations.get(loc).getExists();
            System.out.print("Direcoes disponiveis: ");
            for(String exit: exist.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = sc.nextLine().toUpperCase();

            if(exist.containsKey(direction)) {
                loc = exist.get(direction);
            } else {
                System.out.println("Voce nao pode ir por essa direcao");
            }
        }


    }
}
