import academico.CursoGrad;
import persist.DadosAlunos;
import rh.Aluno;
import rh.AlunoGraduacao;

public class Principal {

	public static void main(String args[]) {

		CursoGrad cursoGrad = new CursoGrad();

		AlunoGraduacao alunoGraduacao = new AlunoGraduacao(cursoGrad);
		alunoGraduacao.lerDados();
		alunoGraduacao.mostrarDados();

		DadosAlunos.cadastrar(alunoGraduacao);

		for (Aluno aluno : DadosAlunos.lerRegistros()) {
			System.out.println("Dados do aluno: \n" + aluno.toString());
		}
	}
}
