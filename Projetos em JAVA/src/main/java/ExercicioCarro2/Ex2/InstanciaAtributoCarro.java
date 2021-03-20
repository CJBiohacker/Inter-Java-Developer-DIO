package ExercicioCarro2.Ex2;

class InstanciaAtributoCarro {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setMarca("Tesla");
        carro.setModelo("Model S");
        carro.setAno("2020");

        System.out.println(carro.getMarca() + " " + carro.getModelo() + " " + carro.getAno());
    }

}
