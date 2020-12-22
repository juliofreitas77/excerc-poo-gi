package rh;

import java.util.Scanner;

import academico.CursoPosGrad;
import util.EntradaDeDados;


public class AlunoPosGraduacao extends Aluno {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Scanner s = new Scanner(System.in);

	private CursoPosGrad cursoPosGrad;
	private String instituicaoPosGraduacao;
	private Integer anoInicioPosGraduacao;
	private Integer anoConclusaoPosGraduacao;

//	Exercicio 09 - Construtores com parametro
	public AlunoPosGraduacao() {
	}

	public AlunoPosGraduacao(CursoPosGrad cursoPosGrad) {
		super();
		this.cursoPosGrad = cursoPosGrad;
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

//		System.out.println("Curso de Pós graduacao***");
//		this.cursoPosGrad = new CursoPosGrad();
//		cursoPosGrad.lerDados();

		System.out.println("Informe a instituicao:");
		while (!setInstituicao(s.nextLine()))
			;

		System.out.println("Informe o ano de inicio:");
		setAnoInicio(EntradaDeDados.lerInteiro());

		System.out.println("Informe o ano de conclusao:");
		setConclusao(EntradaDeDados.lerInteiro());
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
