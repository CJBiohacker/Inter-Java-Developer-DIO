package ProgramacaoOrientadaObjetos.ExercicioCarro2.Ex1;

class Carro {

    private String Marca, Modelo, Ano, Variante;
    /* Declarando os ATRIBUTOS em formato de variáveis do tipo String.
    CONSTRUTOR SEM PASSAGEM DE PARÂMETROS */

    protected String getMarca() {
        return Marca;
    }
    /* Definindo o MÉTODO para retorno da variável Marca através do comando getMarca. */

    protected void setMarca(String Marca) {
        this.Marca = Marca;
    }
    /*Definindo o MÉTODO para configuração da variável Marca através do comando setMarca. */

    protected String getModelo() {
        return Modelo;
    }
    /* Definindo o MÉTODO para retorno da variável Modelo através do comando getModelo. */

    protected void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    /*Definindo o MÉTODO para configuração da variável Modelo através do comando setModelo. */

    protected String getAno() {
        return Ano;
    }
    /* Definindo o MÉTODO para retorno da variável Ano através do comando getAno. */

    protected void setAno(String Ano) {
        this.Ano = Ano;
    }
    /*Definindo o MÉTODO para configuração da variável Ano através do comando getAno. */

    protected String getVariante() {
        return Variante;
    }
    /* Definindo o MÉTODO para retorno da variável Variante através do comando getVariante. */

    protected void setVariante(String Variante) {
        this.Variante = Variante;
    }
    /*Definindo o MÉTODO para configuração da variável Modelo através do comando getVariante. */

}

