package Arrays;

class Exemplos {

    public static void main(String[] args) {

        int Balaclava[] = new int[3];

        Balaclava[0] = 1;
        Balaclava[1] = 3;
        Balaclava[2] = 7;

        int PG[] = {1,5,10,50,100,500,1000,5000,10000};
        int CPU[][]= { {3,8,6} , {8,3,5,0} };

        System.out.println("Array/Matriz da Balaclava 137\n");
        for (int i=0; i<3; i+=1) {
            System.out.println("Elemento da posição " + i + ": "+ Balaclava[i]);
        }

        System.out.println("\nAlterando o valor dos elementos!\n");
        Balaclava[0] = 6;
        Balaclava[1] = 6;
        Balaclava[2] = 6;

        for (int i=0; i<3; i+=1) {
            System.out.println("Novo elemento da posição " + i + ": "+ Balaclava[i]);
        }

        System.out.println("\nArray/Matriz da PG(5 e 2)\n");
        for (int i=0; i<PG.length; i+=1) {
            System.out.println("Elemento da posição " + i + ": "+ PG[i]);
        }

        System.out.println("\nArray/Matriz dos Processadores\n");
        for (int i=0; i<CPU.length ; i+=1) {
            for (int j=0; j<CPU[i].length; j++) {
                System.out.println("Elemento: " + CPU[i][j]);
            }
        }

    }
}
