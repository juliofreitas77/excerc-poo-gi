package academico;



import java.util.ArrayList;
import java.util.Scanner;

public abstract class Curso {

    Scanner s = new Scanner(System.in);

    public String getCodigo;
    private String codigo;
    private String nome;
    private String duracao;
    private ArrayList<Curso> cursos = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();


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

    public void cadastrar(Curso curso) {
        this.cursos.add(curso); //ADICIONA o Curso NO ARRAY
        System.out.println("Total de cursos inseridos...: ");
        System.out.println(this.cursos.size());
    }

    public void listarCurso() {
        cursos.forEach(curso -> mostrarDados());
    }

    //este método retorna o objeto Curso caso encontrado, ou null, caso não encotrado
    public Curso buscar(String codigoCurso) {
        Curso curso = null;
        for (Curso objeto : this.cursos) {
            if (objeto.getCodigo.equals(codigoCurso)) {
                curso = objeto;
                break;
            }
        }
        return curso;
    }

    //este método usa o método buscar já implementado
    public boolean excluir(String matricula) {
        Curso curso = this.buscar(matricula);
        if (curso != null) {
            this.cursos.remove(curso);
            return true;
        } else {
            return false;
        }
    }

    public void adicionarDisciplina (Disciplina disciplina) {
        this.disciplinas.add(disciplina); //ADICIONA a Disciplina NO ARRAY
        System.out.println("Total de disciplinas inseridas...: ");
        System.out.println(this.disciplinas.size());
    }

    public void mostrarDisciplinas() {
        disciplinas.forEach(disciplina -> disciplina.mostrarDados());

    }

    //este método retorna o objeto Disciplina caso encontrado, ou null, caso não encotrado
    public Disciplina buscar(int codigo) {
        Disciplina disciplina = null;
        for (Disciplina objeto : this.disciplinas) {
            if (objeto.getCodigo().equals(codigo)) {
                disciplina = objeto;
                break;
            }
        }
        return disciplina;
    }

    //este método usa o método buscar já implementado
    public boolean remover(int codigo) {
        Disciplina disciplina = this.buscar(codigo);
        if (disciplina != null) {
            this.disciplinas.remove(disciplina);
            return true;
        } else {
            return false;
        }
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
        this.mostrarDisciplinas();
       // System.out.println("_______________________________");
    }
}
