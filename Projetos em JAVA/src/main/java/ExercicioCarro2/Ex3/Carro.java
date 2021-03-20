package ExercicioCarro2.Ex3;

class Carro {

    protected String Marca, Modelo, Ano, Variante;

    protected Carro(String Marca) {
        this.Marca = Marca;

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