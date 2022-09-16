package collections.lesson_4;

import java.util.HashMap;
import java.util.Map;

/*
    - A interface map é representada por uma chave e um valor correspondentes entre si ...
    - Map não possibilita o armazenamento de duas chaves idênticas
    - É possível implementar os conjuntos de dados de tipo map por meio de duas interfaces: Map e sortedMap
     (em que existe a ordenação dos elementos contidos nas chaves), usando suas três classes para ser implementada
     — HashMap(), LinkedHashMap() e TreeMap().

    HashMap(): - não realiza a ordenação dos elementos;
    LinkedHashMap(): a mesma coisa que a classe anterior, mas com ordenamento dos elementos contidos no map em
                    ordem de inserção. Suporta o uso de valor e chaves nulos (“null”).
    TreeMap(): o treeMap é implementação das interfaces Map e sortedMap — sempre usa a ordenação ascendente
               (do menor para o maior). É bastante usado na manipulação de dados hierárquicos e não tem suporte
               para uso de valores nulos (“null”).

*/
public class Maps {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        //Verifica se existe uma determindaa chave
        if(languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            //Addiciona a chave e o valor
            languages.put("Java", "a compiled high level, object-oriented, plantform independent language");
            System.out.println("Java added sucessfully");
        }

        languages.put("Python", "an interpred, object-oriented. high-level programing language");
        languages.put("Algol", "an algorithmic language");
        languages.put("Javascript", " a functional programing language");

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            //Addiciona a chave e o valor
            languages.put("Java", "this course is about map");
            System.out.println("Java added sucessfully");
        }

        //remover um valor
        if(languages.remove("Java","a compiled high level, object-oriented, plantform independent language")) {
            System.out.println("Java removed");
        } else {
            System.out.println("Java not removed");
        }

        //actualizar uma chave
        if(languages.replace("Javascript"," a functional programing language"," high-level programing languange")){
            System.out.println("Javascript replaced");
        } else {
            System.out.println("javascript not replaced");
        }

        //Percorrer a interface
        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }


    }
}
