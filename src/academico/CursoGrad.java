package academico;

import java.util.Scanner;

public class CursoGrad extends Curso {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
		System.out.println("");
		System.out.println("**************Informações do curso************");		
		super.lerDados();
		System.out.println("Informe quantos periodos tem o curso:");
		while (!setPeriodo(s.nextLine()));
	}

	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Periodo: " + this.periodo);
		System.out.println("_______________________________");
	}
}
