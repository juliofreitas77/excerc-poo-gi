package cadastro;

import java.util.ArrayList;

import rh.Professor;

public class DadosProfessor {
    private static ArrayList<Professor> professores = new ArrayList<Professor>();

    public static ArrayList<Professor> getProfessores() {
        return professores;
    }

    public static void cadastrar(Professor p) {
        professores.add(p); //ADICIONA O PROFESSROR NO ARRAY
        System.out.println("Total de professores inseridos...: ");
        System.out.println(professores.size());
    }

    public static void listar(){
        professores.forEach(professor -> professor.mostrarDados());
    }

    //este método retorna o objeto Aluno caso encontrado, ou null, caso não encotrado
    public static Professor buscar(String cpf) {
        Professor p = null;
        for ( Professor objeto: professores) {
            if (objeto.getCpf().equals(cpf)) {
                p = objeto;
                break;
            }
        }
        return p;
    }

    //este método usa o método buscar já implementado
    public static boolean excluir(String cpf){
        Professor p = buscar(cpf);
        if (p != null) {
            professores.remove(p);
            return true;
        }
        else {
            return false;
        }
    }


}
