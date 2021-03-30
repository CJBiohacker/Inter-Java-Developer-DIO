package ProgramacaoOrientadaObjetos.ExercicioHerançaPolimorfismo;

class Resultado {       //Corrigir casas decimais após a vírgula das taxas de imposto

    public static void main(String[] args) {

        CargoLoja gerente = new Gerente();

        gerente.setNome("Fabio Mozine");
        gerente.setSalario(8450.50);
        gerente.setImposto(0.1);

        CargoLoja supervisor = new Supervisor();

        supervisor.setNome("Pedro");
        supervisor.setSalario(4795.35);
        gerente.setImposto(0.05);

        CargoLoja atendente = new Atendente();

        atendente.setNome("Jibóia");
        atendente.setSalario(1250.30);
        gerente.setImposto(0.01);

        System.out.println("|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|");
        System.out.println("|             Lajä Records             |");
        System.out.println("|______________________________________| ");
        System.out.println("----------------------------------------");
        System.out.println("         Quadro de Funcionários         ");
        System.out.println("----------------------------------------");

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: R$ " + String.format("%.2f",gerente.getSalario()));
        System.out.println("Taxa de Imposto: " + String.format("%.2f",gerente.getImposto()) + "%");
        System.out.println("Valor Pago: R$ " + String.format("%.2f",gerente.calcImposto()));
        System.out.println(" ");

        System.out.println("Nome: " + supervisor.getNome());
        System.out.println("Salário: R$ " + String.format("%.2f",supervisor.getSalario()));
        System.out.println("Imposto Pago: R$ " + String.format("%.3f",supervisor.getImposto()) + "%");
        System.out.println("Valor Pago: R$ " + String.format("%.2f",supervisor.calcImposto()));
        System.out.println(" ");

        System.out.println("Nome: " + atendente.getNome());
        System.out.println("Salário: R$ " + String.format("%.2f",atendente.getSalario()));
        System.out.println("Imposto Pago: R$ " + String.format("%.3f",atendente.getImposto()) + "%");
        System.out.println("Valor Pago: R$ "+ String.format("%.2f",atendente.calcImposto()));

    }

}
