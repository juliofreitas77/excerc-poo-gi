import academico.CursoGrad;
import persist.DadosAlunos;
import rh.Aluno;
import rh.AlunoGraduacao;

import java.time.LocalDateTime;

import static persist.DadosAlunos.cadastrar;

public class Principal {

    public static void main(String[] args) {

        CursoGrad cursoGrad = new CursoGrad();

        AlunoGraduacao alunoGraduacao = new AlunoGraduacao(cursoGrad);
        alunoGraduacao.lerDados();

        System.out.println(cadastrar(alunoGraduacao));

        for (Aluno aluno : DadosAlunos.lerRegistros()) {
            AlunoGraduacao graduacao = (AlunoGraduacao) aluno;
            aluno.mostrarDados();
            System.out.println(LocalDateTime.now());
        }
    }
}
