package rh;

import java.io.Serializable;
import java.util.Scanner;

@SuppressWarnings("serial")
public abstract class Aluno extends Pessoa implements Serializable{

	Scanner s = new Scanner(System.in);

	private String matricula;
	private Byte situacao;

	public boolean setMatricula(String matricula) {
		if (matricula.length() > 0) {
			this.matricula = matricula;
			return true;
		} else {
			System.out.println("Matricula invalida!");
			return false;
		}
	}

	public boolean setsituacao(String p_situacao) {
		p_situacao = p_situacao.toUpperCase();
		char c = p_situacao.charAt(0);

		switch (c) {
		case 'M':
			situacao = 1;
			return true;
		case 'T':
			situacao = 2;
			return true;
		case 'D':
			situacao = 3;
			return true;
		default:
			return false;
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public void lerDados() {
		super.lerDados();

		System.out.println("Informe a matricula do aluno:");
		while (!setMatricula(s.nextLine()));

		System.out.println("Informe a situação do aluno:");
		while (!setsituacao(s.nextLine()));
		System.out.println("_______________________________");
	}

	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Matricula: " + this.matricula);

		Byte c = this.situacao;
		String status;
		switch (c) {
		case 1:
			status = "Matriculado";
			break;
		case 2:
			status = "Trancado";
		case 3:
			status = "Desligado";
		default:
			status = "";
		}
		System.out.println("Situação: " + status);
		System.out.println("_______________________________");
	}

}
