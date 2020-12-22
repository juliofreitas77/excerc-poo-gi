package cadastro;

import java.util.ArrayList;

import rh.Coordenador;

public class DadosCoordenador {
    private static ArrayList<Coordenador> coordenadores = new ArrayList<Coordenador>();

    public static ArrayList<Coordenador> getCoordenadores() {
        return coordenadores;
    }

    public static void cadastrar(Coordenador coord) {
        coordenadores.add(coord); //ADICIONA O TECNICO NO ARRAY
        System.out.println("Total de tecnicos inseridos...: ");
        System.out.println(coordenadores.size());
    }

    public static void listar(){
        coordenadores.forEach(coordenador -> coordenador.mostrarDados());
    }

    //este método retorna o objeto Aluno caso encontrado, ou null, caso não encotrado
    public static Coordenador buscar(String Cpf) {
        Coordenador t = null;
        for ( Coordenador objeto: coordenadores) {
            if (objeto.getCpf().equals(Cpf)) {
                t = objeto;
                break;
            }
        }
        return t;
    }

    //este método usa o método buscar já implementado
    public static boolean excluir(String Cpf){
        Coordenador coord = buscar(Cpf);
        if (coord != null) {
            coordenadores.remove(coord);
            return true;
        }
        else {
            return false;
        }
    }
}
