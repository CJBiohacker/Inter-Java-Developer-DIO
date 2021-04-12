package JavaCollectionsStreams.Maps;

import java.util.Map;
import java.util.TreeMap;

class ExercicioFinalMaps {

    public static void main(String[] args) {

        TreeMap<String, String> estadosBr = new TreeMap<>();

        estadosBr.put("AM", "Amazonas");
        estadosBr.put("PA", "Pará");
        estadosBr.put("MT", "Mato Grosso");
        estadosBr.put("MG", "Minas Gerais");
        estadosBr.put("BA", "Bahia");
        estadosBr.put("MS", "Mato Grosso do Sul");
        estadosBr.put("GO", "Goiás");
        estadosBr.put("MA", "Maranhão");
        estadosBr.put("RS", "Rio Grande do Sul");
        estadosBr.put("TO", "Tocantins");
        estadosBr.put("PI", "Piauí");
        estadosBr.put("SP", "São Paulo");
        estadosBr.put("RO", "Rondônia");
        estadosBr.put("RR", "Roraima");
        estadosBr.put("PR", "Paraná");
        estadosBr.put("AC", "Acre");
        estadosBr.put("CE", "Ceará");
        estadosBr.put("AP", "Amapá");
        estadosBr.put("PE", "Pernambuco");
        estadosBr.put("SC", "Santa Catarina");
        estadosBr.put("PB", "Paraíba");
        estadosBr.put("RN", "Rio Grande do Norte");
        estadosBr.put("ES", "Espírito Santo");
        estadosBr.put("RJ", "Rio de Janeiro");
        estadosBr.put("AL", "Alagoas");
        estadosBr.put("SE", "Sergipe");

        System.out.println("Mapa de Árvore das Siglas/Nomes dos Estados do Brasil (Ordenação Alfabética Automática)\n");
        System.out.println(estadosBr + "\n");

        System.out.println("    -Removendo o estado de Minas Gerais do Mapa.\n");
        estadosBr.remove("MG");
        System.out.println(estadosBr + "\n");

        estadosBr.put("DF", "Distrito Federal");
        System.out.println("    -Adicionando o Distrito Federal ao Mapa.\n");
        System.out.println(estadosBr + "\n");

        System.out.println("    -Verificando o tamanho do Mapa.\n");
        System.out.println("Quantidade = " + estadosBr.size() + " Siglas/Estados\n");

        estadosBr.remove("MS", "Mato Grosso do Sul");
        System.out.println("    -Removendo o estado do Mato Grosso do Sul do Mapa.\n");
        System.out.println(estadosBr + "\n");

        System.out.println("Organização do Mapa de Árvore em formato de lista (Nome-Sigla)\n");
        for (Map.Entry<String, String> entry : estadosBr.entrySet()) {
            System.out.println(entry.getValue() + "-" + entry.getKey());
        }

        System.out.println("\n    -Procurando se existe a sigla do estado de Santa Catarina no Mapa.");
        System.out.println("Status = " + estadosBr.containsKey("SC"));

        System.out.println("\n    -Procurando se existe o estado do Maranhão no Mapa.");
        System.out.println("Status = " + estadosBr.containsValue("Maranhão"));

    }

}
