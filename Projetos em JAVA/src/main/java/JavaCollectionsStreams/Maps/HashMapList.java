package JavaCollectionsStreams.Maps;

import java.util.HashMap;
import java.util.Map;

class HashMapList {

    public static void main(String[] args) {

        Map<String, Integer> criaturasValheim = new HashMap<>();

        criaturasValheim.put("Boar", 10 );
        criaturasValheim.put("Neck", 5);
        criaturasValheim.put("Greyling", 20);
        criaturasValheim.put("Greydwarf", 40);
        criaturasValheim.put("Greydwarf Brute", 150);
        criaturasValheim.put("Greydwarf Shaman", 60);
        criaturasValheim.put("Troll", 600);
        criaturasValheim.put("Draugr Elite", 200);
        criaturasValheim.put("Wraith", 100);
        criaturasValheim.put("Drake", 100);
        criaturasValheim.put("Deathsquito", 20);
        criaturasValheim.put("Fulling", 200);
        criaturasValheim.put("Fulling Shaman", 100);

        System.out.println("Tabela de Criaturas/HP Valheim");
        System.out.println(criaturasValheim + "\n");

        System.out.println("    -Atualizando o HP do Troll para o level 2★\n");
        criaturasValheim.put("Troll", 1800);
        System.out.println(criaturasValheim);

        System.out.println("\n    -Selecionando uma criatura");
        System.out.println("Deathsquito");
        System.out.println("HP = " + criaturasValheim.get("Deathsquito"));

        System.out.println("\n    -Verificando se existe uma criatura na Tabela");
        System.out.println("Criatura: Bonemass");
        System.out.println("Status: " + criaturasValheim.containsKey("BonesMass"));

        System.out.println("\n    -Removendo o Greydwarf da Tabela");
        criaturasValheim.remove("Greydwarf");
        System.out.println(criaturasValheim);

        System.out.println("\n    -Verificando se existe(m) criatura(s) com HP = 100 na Tabela");
        System.out.println("Status: " + criaturasValheim.containsValue(100));

        System.out.println("\n    -Total de criaturas na Tabela");
        System.out.println("Quantidade = " + criaturasValheim.size() + "\n");

        for (Map.Entry<String, Integer> entry: criaturasValheim.entrySet()) {
            System.out.println(entry.getKey() + "  HP = " + entry.getValue());
        }

        System.out.println("\n    -Removendo o Neck da Tabela\n");
        criaturasValheim.remove("Neck");
        System.out.println("Quantidade = " + criaturasValheim.size() + "\n");

        for (String key : criaturasValheim.keySet()) {
            System.out.println(key + "  HP = " + criaturasValheim.get(key));
        }

        System.out.println("\n    -Limpando a Tabela de Criaturas\n");
        criaturasValheim.clear();
        System.out.println("Quantidade atual = " + criaturasValheim.size());

        System.out.println(criaturasValheim.get("Moder"));

    }

}
