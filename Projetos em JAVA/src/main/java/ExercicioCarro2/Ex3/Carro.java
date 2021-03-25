package ExercicioCarro2.Ex3;

class Carro {

    private String Marca, Modelo, Ano, Variante;

    protected Carro(String Marca, String Modelo, String Ano) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ano = Ano;
    }

    protected String getMarca() {
        return Marca;
    }

    protected String getModelo() {
        return Modelo;
    }

    protected String getAno() {
        return Ano;
    }

}