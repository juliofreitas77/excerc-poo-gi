package academico;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Curso implements Serializable {
	private static final long serialVersionUID = 1L;

	transient Scanner s = new Scanner(System.in);

    public String getCodigo;
    private String codigo;
    private String nome;
    private String duracao;

    public boolean setCodigo(String p_codigo){
        if(p_codigo.length() > 0 ){
            this.codigo = p_codigo;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean setNome(String nome){
        if(nome.length() > 0){
            this.nome = nome;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean setDuracao(String p_duracao){
        if(p_duracao.length() > 0){
            this.duracao = p_duracao;
            return true;
        }
        else{
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }


    public void lerDados() {
        System.out.println("Informe o codigo do curso:");
        while(!setCodigo(s.nextLine()));

        System.out.println("Informe o nome do curso:");
        while(!setNome(s.nextLine()));

        System.out.println("Informe a duraçao do curso:");
        while(!setDuracao(s.nextLine()));

    }

    public void mostrarDados() {
        System.out.println("***Dados do Curso***");
        System.out.println("_______________________________");

        System.out.println("Codigo: "+this.codigo);
        System.out.println("Nome: "+this.nome);
        System.out.println("Duraçao: "+this.duracao);
    }
}
