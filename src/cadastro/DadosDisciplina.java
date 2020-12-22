package cadastro;

import java.util.ArrayList;

import academico.Disciplina;

public abstract class DadosDisciplina {
    private static ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public static void cadastrar(Disciplina d) {
        disciplinas.add(d); //ADICIONA a Disciplina NO ARRAY
        System.out.println("Total de disciplinas inseridas...: ");
        System.out.println(disciplinas.size());
    }

    public static void listar() {
        disciplinas.forEach(disciplina -> disciplina.mostrarDados());
    }

    //este método retorna o objeto Disciplina caso encontrado, ou null, caso não encotrado
    public static Disciplina buscar(int codigo) {
        Disciplina d = null;
        for (Disciplina objeto : disciplinas) {
            if (objeto.getCodigo().equals(codigo)) {
                d = objeto;
                break;
            }
        }
        return d;
    }

    //este método usa o método buscar já implementado
    public static boolean excluir(int codigo) {
        Disciplina d = buscar(codigo);
        if (d != null) {
            disciplinas.remove(d);
            return true;
        } else {
            return false;
        }
    }
}