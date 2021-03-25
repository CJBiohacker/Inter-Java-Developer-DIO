package FunçoesEOperadores;

class Do {

    public static void main(String[] args) {

        var num = 8;
        var pos = 1;

        do {
            System.out.print(pos);
            System.out.print(": ");
            pos+=1;
            System.out.println(num);
            num+=1;
        } while (num <=15);

    }

}
