package academico;

import java.util.Scanner;

public class CursoGrad extends Curso {
    Scanner s = new Scanner(System.in);

    private String periodo;

    public String getPeriodo() {
        return periodo;
    }

    public boolean setPeriodo(String periodo) {
        if (periodo.length() > 0) {
            this.periodo = periodo;
            return true;
        } else {
            System.out.println("Periodo invalido!");
            return false;
        }
    }


    public void lerDados() {
        super.lerDados();
        System.out.println("Informe o periodo do curso:");
        while (!setPeriodo(s.nextLine())) ;

    }

    public void mostrarDados() {
        super.mostrarDados();
//        System.out.println("Dados do Curso de Gradução: ");
//        System.out.println("_______________________________");

        System.out.println("Periodo: " + this.periodo);
        System.out.println("_______________________________");
    }


}
