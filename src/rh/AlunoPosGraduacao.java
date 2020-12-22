package rh;

import java.util.Scanner;

import academico.CursoPosGrad;

public class AlunoPosGraduacao extends Aluno {

	Scanner s = new Scanner(System.in);

	private CursoPosGrad cursoPosGrad = new CursoPosGrad();
	private String instituicaoPosGraduacao;
	private Integer anoInicioPosGraduacao;
	private Integer anoConclusaoPosGraduacao;

//	Exercicio 09 - Construtores com parametro
	public AlunoPosGraduacao() {
	}

	public AlunoPosGraduacao(CursoPosGrad cursoPosGrad, String instituicaoPosGraduacao, Integer anoInicioPosGraduacao,
			Integer anoConclusaoPosGraduacao) {
		super();
		this.cursoPosGrad = cursoPosGrad;
		this.instituicaoPosGraduacao = instituicaoPosGraduacao;
		this.anoInicioPosGraduacao = anoInicioPosGraduacao;
		this.anoConclusaoPosGraduacao = anoConclusaoPosGraduacao;
	}
	
	

	public void setCursoPosGrad(CursoPosGrad cursoPosGrad) {
		this.cursoPosGrad = cursoPosGrad;
	}

	public CursoPosGrad getCursoPosGrad() {
		return cursoPosGrad;
	}

	public boolean setInstituicao(String instituicaoPosGraduacao) {
		if (instituicaoPosGraduacao.length() > 0) {
			this.instituicaoPosGraduacao = instituicaoPosGraduacao;
			return true;
		} else {
			return false;
		}
	}

	public boolean setAnoInicio(Integer anoInicioPosGraduacao) {
		if (anoInicioPosGraduacao > 0) {
			this.anoInicioPosGraduacao = anoInicioPosGraduacao;
			return true;
		} else {
			return false;
		}
	}

	public boolean setConclusao(Integer anoConclusaoPosGraduacao) {
		if (anoConclusaoPosGraduacao > 0) {
			this.anoConclusaoPosGraduacao = anoConclusaoPosGraduacao;
			return true;
		} else {
			return false;
		}
	}

	public void lerDados() {
		System.out.println("***Aluno Pós Graduação***");
		super.lerDados();

		System.out.println("Curso de Pós graduacao***");
		this.cursoPosGrad = new CursoPosGrad();
		cursoPosGrad.lerDados();

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
		System.out.println("Dados do aluno de pós graduação: ");
		System.out.println("_______________________________");

		super.mostrarDados();

		System.out.println("Pós Graduacao: " + this.cursoPosGrad.getNome());
		System.out.println("Instituicao: " + this.instituicaoPosGraduacao);
		System.out.println("Ano de inicio: " + this.anoInicioPosGraduacao);
		System.out.println("Ano de conclusao: " + this.anoConclusaoPosGraduacao);

		System.out.println("_______________________________");
	}
}
