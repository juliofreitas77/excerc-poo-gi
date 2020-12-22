package persist;

import java.util.ArrayList;

import rh.Aluno;

@SuppressWarnings("unchecked")
public class DadosAlunos {

	private static ArrayList<Aluno> alunos;

	static {
		alunos = (ArrayList<Aluno>) Persist.recuperar("alunos.dat");
		if (alunos == null)
			alunos = new ArrayList<Aluno>();
	}

	public static void cadastrar(Aluno a) {
		alunos.add(a);
		boolean r = Persist.gravar(alunos, "alunos.dat");
	}

	public static ArrayList<Aluno> lerRegistros() {
		alunos = (ArrayList<Aluno>) Persist.recuperar("alunos.dat");
		if (alunos == null) {
			System.out.println("Arquivo Vazio!");
		}

		return alunos;
	}
}
