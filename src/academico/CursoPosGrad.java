package academico;

import java.util.Scanner;

public class CursoPosGrad extends Curso {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Scanner s = new Scanner(System.in);

	private String especialidade;

	public boolean setEspecialidade(String especialidade) {
		if (especialidade.length() > 0) {
			this.especialidade = especialidade;
			return true;
		} else {
			System.out.println("Nome da especialidade invalido!");
			return false;
		}
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void lerDados() {
		super.lerDados();
		System.out.println("***Informe a especialidade do curso***");
		while (!setEspecialidade(s.nextLine()))
			;

	}

	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Especialidade: " + this.especialidade);
		System.out.println("_______________________________");
	}
}
