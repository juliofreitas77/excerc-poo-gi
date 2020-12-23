package persist;

import rh.Aluno;

import java.io.Serializable;
import java.util.ArrayList;

public class DadosAlunos implements Serializable {

	private static ArrayList<Aluno> alunos;

	static {
		alunos = (ArrayList<Aluno>) Persist.recuperar("alunos.dat");
		if (alunos == null)
			alunos = new ArrayList<Aluno>();
	}

	public static Boolean cadastrar(Aluno a) {
		alunos.add(a);
		boolean r = Persist.gravar(alunos, "alunos.dat");
		return r;
	}

	public static ArrayList<Aluno> lerRegistros() {
		alunos = (ArrayList<Aluno>) Persist.recuperar("alunos.dat");
		if (alunos == null) {
			System.out.println("Arquivo Vazio!");
		}

		return alunos;
	}
}
