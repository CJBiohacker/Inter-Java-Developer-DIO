package exercicios;

public class OperadorArtimetico {

    public static void main(String[] args) {

        final int result = +1;
        // result is now 1

        System.out.println("O resultado é " + result);



        System.out.println("Descrescer 1");
        result--;
        // result is now 0
        System.out.println("O resultado é " + result);

        System.out.println("Acrescentar 1");
        result++;
        // result is now 1
        System.out.println("O resultado é " + result);

        System.out.println("Inverter 1");
        result = -result;
        // result is now -1
        System.out.println("O resultado é " + result);

        boolean success = false;
        // false
        System.out.println("A condição natural é " + success);
        // true
        System.out.println("A condição barrada é " + !success);

       }

}