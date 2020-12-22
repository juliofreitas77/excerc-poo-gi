package rh;

import java.util.Scanner;

import academico.CursoGrad;

public class AlunoGraduacao extends Aluno {
	Scanner s = new Scanner(System.in);

	private CursoGrad cursoGrad = new CursoGrad();
	private String instituicaoGraduacao;
	private Integer anoInicioGraduacao;
	private Integer anoConclusaoGraduacao;


//	Exercicio 09 - Construtores com parametro
	public AlunoGraduacao() {
		super();
	}

	public AlunoGraduacao(CursoGrad cursoGrad, String instituicaoGraduacao, Integer anoInicioGraduacao,
			Integer anoConclusaoGraduacao) {
		super();
		this.cursoGrad = cursoGrad;
		this.instituicaoGraduacao = instituicaoGraduacao;
		this.anoInicioGraduacao = anoInicioGraduacao;
		this.anoConclusaoGraduacao = anoConclusaoGraduacao;
	}

	public CursoGrad getCursoGrad() {
		return cursoGrad;
	}

	public boolean setInstituicao(String instituicaoGraduacao) {
		if (instituicaoGraduacao.length() > 0) {
			this.instituicaoGraduacao = instituicaoGraduacao;
			return true;
		} else {
			return false;
		}
	}

	public boolean setAnoInicio(Integer anoInicioGraduacao) {
		if (anoInicioGraduacao > 0) {
			this.anoInicioGraduacao = anoInicioGraduacao;
			return true;
		} else {
			return false;
		}
	}

	public boolean setConclusao(Integer anoConclusaoGraduacao) {
		if (anoConclusaoGraduacao > 0) {
			this.anoConclusaoGraduacao = anoConclusaoGraduacao;
			return true;
		} else {
			return false;
		}
	}

	public void lerDados() {
		System.out.println("***Aluno Graduação***");
		super.lerDados();

		System.out.println("***Curso de Graduação***");
		// this.cursoGrad = new CursoGrad();
		getCursoGrad().lerDados();
		System.out.println("Informe a instituicao:");
		while (!setInstituicao(s.nextLine()))
			;

		System.out.println("Informe o ano de inicio:");
		while (!setAnoInicio(s.nextInt()))
			;

		System.out.println("Informe o ano de conclusao:");
		while (!setConclusao(s.nextInt()))
			;

	}

	public void mostrarDados() {
		System.out.println("_______________________________");
		System.out.println("***Dados do aluno de graduação***");
		System.out.println("_______________________________");

		super.mostrarDados();
		System.out.println("***Dados da graduação***");
		System.out.println("_______________________________");
//Exe09	System.out.println("Graduacao: " + DadosAlunosGrad.buscar(this.getMatricula()).getCursoGrad().getNome());
		System.out.println("Graduacao: " + this.cursoGrad.getNome());
		System.out.println("Instituicao: " + this.instituicaoGraduacao);
		System.out.println("Ano de inicio: " + this.anoInicioGraduacao);
		System.out.println("Ano de conclusao: " + this.anoConclusaoGraduacao);
		System.out.println("_______________________________");

	}

}
