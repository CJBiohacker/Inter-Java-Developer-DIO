package FunçoesEOperadores;

class While {

    public static void main(String[] args) {

        var nome = 1820;
        var pos = 1;

        while (nome >= 100) {
            System.out.print(pos);
            System.out.print(": ");
            pos +=1;
            System.out.println(nome);
           nome /=2;

        }

    }

}
