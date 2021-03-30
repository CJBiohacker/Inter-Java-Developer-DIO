package ProgramacaoOrientadaObjetos.ExercicioCarro2.Ex1;

class InstanciaAtributoObjeto {

    public static void main(String[] args) {

        Carro carro = new Carro(); // Construção e Instanciação do OBJETO

        carro.setMarca("Tesla"); // Trazendo o MÉTODO 'setMarca' para definir a variável 'Marca' do OBJETO 'carro'.
        carro.setModelo("Model S"); // Trazendo o MÉTODO 'setModelo' para definir a variável 'Modelo' do OBJETO 'carro'.
        carro.setAno("2019"); // Trazendo o MÉTODO 'setAno' para definir a variável 'Ano' do OBJETO 'carro'.

        System.out.println(carro.getMarca() + " " + carro.getModelo() + " " + carro.getAno());
        // Imprime na tela a 'Marca' através do MÉTODO 'getMarca'.

    }

}