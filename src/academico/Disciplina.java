package academico;

import java.util.Scanner;

import rh.Professor;

public class Disciplina {
	Scanner s = new Scanner(System.in);

	private Integer codigo;
	private String nome;
	private Integer cargaHoraria;
	private Professor professor;
	private CursoGrad cursoGrad;

	public Disciplina() {
	}

	public Disciplina(Integer codigo, String nome, Integer cargaHoraria, Professor professor, CursoGrad cursoGrad) {
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.professor = professor;
		this.cursoGrad = cursoGrad;
	}

	public Professor getProfessor() {
		return professor;
	}

	public boolean setCodigo(int p_codigo) {
		if (p_codigo > 0) {
			codigo = p_codigo;
			return true;
		} else {
			System.out.println("Código invalido!");
			return false;
		}
	}

	public boolean setNomeDisc(String nomeDisc) {
		if (nomeDisc.length() > 0) {
			this.nome = nomeDisc;
			return true;
		} else {
			System.out.println("Nome da disciplina invalido!");
			return false;
		}
	}

	public boolean setCargaHoraria(int cargaHoraria) {
		if (cargaHoraria > 0) {
			this.cargaHoraria = cargaHoraria;
			return true;
		} else {
			System.out.println("Carga Horária invalida!");
			return false;
		}
	}

	public CursoGrad getCursoGrad() {
		return cursoGrad;
	}

	public void setCursoGrad(CursoGrad cursoGrad) {
		this.cursoGrad = cursoGrad;
	}

	public boolean setProfessor(String nomeProf) {
		if (nomeProf.length() > 0) {
			this.professor.setNome(nomeProf);
			return true;
		} else {
			System.out.println("Professor invalido!");
			return false;
		}
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void lerDados() {

		System.out.println("***Disciplina***");

		System.out.println("Informe o c�digo da disciplina");
		while (!setCodigo(s.nextInt()))
			;
		s.nextLine();

		System.out.println("Informe o nome da disciplina:");

		while (!setNomeDisc(s.nextLine()));

		System.out.println("Informe a carga horaria da disciplina:");
		while (!setCargaHoraria(s.nextInt()));

		System.out.println("Informe o professor da disciplina:");
		this.professor = new Professor();
		this.professor.lerDados();

	}

	public void mostrarDados() {
		System.out.println("_______________________________");
		System.out.println("***Dados da Disciplina***");
		System.out.println("Codigo: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Carga Horaria: " + this.cargaHoraria);
		System.out.println("_______________________________");
		this.professor.mostrarDados();
		System.out.println("_______________________________");
	}

}
