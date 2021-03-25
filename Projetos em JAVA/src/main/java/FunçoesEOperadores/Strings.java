package FunçoesEOperadores;
// declaração de pacote [nome pacote]

class Strings {
// mod. acesso - declaração classe [nome classe]

    public static void main(String[] args) {
// mod. acesso - mod. método classe - tipo retorno método - definição classe (String)
        var nome = "Carlos";            // tipo variável(var) - [nome var.] = valor/texto
        var sobrenome = "Junior";           // tipo variável(var) - [nome var.] = valor/texto
        final var nomecompleto = nome + " " + sobrenome;          // mod. método classe - tipo variável(var) - [nome var.] = valor(concat. nome e sobrenome)

        System.out.println("Nome do Cliente: " + nome);             // Imprime classe pulando linha(valor/texto e variável)
        System.out.println("Sobrenome do Cliente: " + sobrenome);           // Imprime classe pulando linha(valor/texto e variável)
        System.out.println("Nome completo do Cliente: " + nomecompleto);            // Imprime classe pulando linha(valor/texto e variável)

        var string = new String(" Nova string ");

        System.out.println("Caractere na posição 7: " + string.charAt(7));
        System.out.println("Quantidade de caracteres: " + string.length());
        System.out.println("Sem Trim: ["  + string +  "]");
        System.out.println("Com Trim: [" + string.trim() + "]");
        System.out.println("Lower Case: " + string.toLowerCase());
        System.out.println("Upper Case: " + string.toUpperCase());
        System.out.println("Contém a letra G ? " + string.contains("G"));
        System.out.println("Contém a letra g ? " + string.contains("g"));
        System.out.println("Substituir 'o' por '0': "+ string.replace("o", "0"));
        System.out.println("Essa string é igual a original ? " + string.equals("Nova string"));
        System.out.println("Essa string é igual a original(ignorando a caixa)? " + string.equalsIgnoreCase(" NovA STring "));
        System.out.println("Do 2º caractére até o 10º: "+ string.substring(2, 10));

    }

}