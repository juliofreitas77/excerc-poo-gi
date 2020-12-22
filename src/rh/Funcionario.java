package rh;

import java.util.Scanner;

public abstract class  Funcionario extends Pessoa {
    Scanner s = new Scanner(System.in);

    private String ctps;
    private Double salario;
    private static Double pisoSalarial;

    public boolean setCtps(String ctps) {
        if (ctps.length() > 0) {
            this.ctps = ctps;
            return true;
        } else {
            System.out.println("CTPS inválido!");
            return false;
        }
    }

    public String getCtps() {
        return ctps;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public static void setPisoSalarial(Double pisoSalarial) {
        Funcionario.pisoSalarial = pisoSalarial;
    }

    public static Double getPisoSalarial() {
        return pisoSalarial;
    }

    public abstract double calcSalario();

    public void lerDados() {

        super.lerDados();

        System.out.println("Informe a CTPS:");
        while (!setCtps(s.nextLine())) ;

        Funcionario.setPisoSalarial(678.0);

    }

    public void mostrarDados() {

        super.mostrarDados();

        System.out.println("CTPS: " + this.ctps);
    }


}
