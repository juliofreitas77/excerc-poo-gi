package cadastro;

import java.util.ArrayList;

import rh.AlunoGraduacao;

public abstract class DadosAlunosGrad {
    private static ArrayList<AlunoGraduacao> alunosGrad = new ArrayList<AlunoGraduacao>();

    public static void adicionar(AlunoGraduacao alunoG) {
        alunosGrad.add(alunoG); //ADICIONA O ALUNO NO ARRAY
        System.out.println("Total de alunos de graduação inseridos...: ");
        System.out.println(alunosGrad.size());
    }

    public static void listar(){
        alunosGrad.forEach(alunoG -> alunoG.mostrarDados());
        //método mostrarDados() já implementado na prática anterior
    }


    //este método retorna o objeto Aluno caso encontrado, ou null, caso não encotrado
    public static AlunoGraduacao buscar(String matricula) {
        AlunoGraduacao alunoG = null;
        for ( AlunoGraduacao objeto: alunosGrad) {
            if (objeto.getMatricula().equals(matricula)) {
                alunoG = objeto;
                break;
            }
        }
        return alunoG;
    }

    //este método usa o método buscar já implementado
    public static boolean excluir(String matricula){
        AlunoGraduacao alunoG = buscar(matricula);
        if (alunoG != null) {
            alunosGrad.remove(alunoG);
            return true;
        }
        else {
            return false;
        }
    }
}
