package cadastro;

import java.util.ArrayList;

import rh.AlunoPosGraduacao;

public abstract class DadosAlunosPosGrad {
    private static ArrayList<AlunoPosGraduacao> alunosPos = new ArrayList<AlunoPosGraduacao>();

    public static void cadastrar(AlunoPosGraduacao ap) {
        alunosPos.add(ap); //ADICIONA O ALUNO NO ARRAY
        System.out.println("Total de alunos inseridos...: ");
        System.out.println(alunosPos.size());
    }

    public static void listar(){
        alunosPos.forEach(alunoP -> alunoP.mostrarDados());
            //método mostrarDados() já implementado na prática anterior
   }


    //este método retorna o objeto Aluno caso encontrado, ou null, caso não encotrado
    public static AlunoPosGraduacao buscar(String matricula) {
        AlunoPosGraduacao ap = null;
        for ( AlunoPosGraduacao objeto: alunosPos) {
            if (objeto.getMatricula().equals(matricula)) {
                ap = objeto;
                break;
            }
        }
        return ap;
    }

    //este método usa o método buscar já implementado
    public static boolean excluir(String matricula){
        AlunoPosGraduacao ap = buscar(matricula);
        if (ap != null) {
            alunosPos.remove(ap);
            return true;
        }
        else {
            return false;
        }
    }
}
