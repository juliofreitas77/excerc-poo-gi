package rh;

import java.util.Scanner;

import academico.CursoGrad;
import util.EntradaDeDados;

public class AlunoGraduacao extends Aluno {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Scanner s = new Scanner(System.in);

	private CursoGrad cursoGrad;
	private String instituicaoGraduacao;
	private Integer anoInicioGraduacao;
	private Integer anoConclusaoGraduacao;

	public AlunoGraduacao() {
		super();
	}

	public AlunoGraduacao(CursoGrad cursoGrad) {
		super();
		this.cursoGrad = cursoGrad;
	}

	public CursoGrad getCursoGrad() {
		return cursoGrad;
	}

	public void setCursoGrad(CursoGrad cursoGrad) {
		this.cursoGrad = cursoGrad;
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


	public Integer getAnoConclusaoGraduacao() {
		return anoConclusaoGraduacao;
	}

	public void setAnoConclusaoGraduacao(Integer anoConclusaoGraduacao) {
		this.anoConclusaoGraduacao = anoConclusaoGraduacao;
	}

	public void lerDados() {
		System.out.println("***Aluno Graduação***");
		super.lerDados();

		System.out.println("***Curso de Graduação***");
		getCursoGrad().lerDados();

		System.out.println("Informe a instituicao:");
		while (!setInstituicao(s.nextLine()));
		
		System.out.println("Informe o ano de inicio:");
		setAnoInicio(EntradaDeDados.lerInteiro());

		System.out.println("Informe o ano de conclusao:");
		setAnoConclusaoGraduacao(EntradaDeDados.lerInteiro());
	}

	public void mostrarDados() {
		System.out.println("_______________________________");
		System.out.println("");
		System.out.println("***Dados do aluno de graduação***");
		System.out.println("_______________________________");

		super.mostrarDados();
		System.out.println("");
		System.out.println("***Dados da graduação***");
		System.out.println("_______________________________");
		System.out.println("Graduacao: " + this.cursoGrad.getNome());
		System.out.println("Instituicao: " + this.instituicaoGraduacao);
		System.out.println("Ano de inicio: " + this.anoInicioGraduacao);
		System.out.println("Ano de conclusao: " + this.anoConclusaoGraduacao);
		System.out.println("_______________________________");
		System.out.println("");
	}
}
