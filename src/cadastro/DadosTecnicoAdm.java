package cadastro;

import java.util.ArrayList;

import rh.TecnicoAdm;

public class DadosTecnicoAdm {
    private static ArrayList<TecnicoAdm> tecnicos = new ArrayList<TecnicoAdm>();

    public static ArrayList<TecnicoAdm> getTecnicos() {
        return tecnicos;
    }

    public static void cadastrar(TecnicoAdm t) {
        tecnicos.add(t); //ADICIONA O TECNICO NO ARRAY
        System.out.println("Total de tecnicos inseridos...: ");
        System.out.println(tecnicos.size());
    }

    public static void listar(){
        tecnicos.forEach(tecnico -> tecnico.mostrarDados());
    }

    //este método retorna o objeto Aluno caso encontrado, ou null, caso não encotrado
    public static TecnicoAdm buscar(String Cpf) {
        TecnicoAdm t = null;
        for ( TecnicoAdm objeto: tecnicos) {
            if (objeto.getCpf().equals(Cpf)) {
                t = objeto;
                break;
            }
        }
        return t;
    }

    //este método usa o método buscar já implementado
    public static boolean excluir(String Cpf){
        TecnicoAdm t = buscar(Cpf);
        if (t != null) {
            tecnicos.remove(t);
            return true;
        }
        else {
            return false;
        }
    }
}
