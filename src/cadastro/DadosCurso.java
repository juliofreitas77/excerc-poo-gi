package cadastro;

import java.util.ArrayList;

import academico.Curso;

public abstract class DadosCurso {
    private static ArrayList<Curso> cursos = new ArrayList<>();

    public static void cadastrar(Curso c) {
        cursos.add(c); //ADICIONA o Curso NO ARRAY
        System.out.println("Total de cursos inseridos...: ");
        System.out.println(cursos.size());
    }

    public static void listar() {
        cursos.forEach(curso -> curso.mostrarDados());
    }

    //este método retorna o objeto Curso caso encontrado, ou null, caso não encotrado
    public static Curso buscarCurso(String codigoC) {
        for (Curso objeto : cursos) {
            if (objeto.getCodigo.equals(codigoC)) {
                return objeto;
            }
        }
        return null;
    }

    //este método usa o método buscar já implementado
    public static boolean excluir(String codigoC) {
        Curso c = buscarCurso(codigoC);
        if (c != null) {
            cursos.remove(c);
            return true;
        } else {
            return false;
        }
    }
}
