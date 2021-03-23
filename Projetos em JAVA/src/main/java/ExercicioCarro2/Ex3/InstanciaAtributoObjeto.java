package ExercicioCarro2.Ex3;

public class InstanciaAtributoObjeto {

    public static void main(String[] args) {

        Carro carro = new Carro("Tesla", "Model S", "2020");

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " +carro.getModelo());
        System.out.println("Ano: " +carro.getAno());
    }

}
