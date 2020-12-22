import java.util.Scanner;

import academico.CursoGrad;
import academico.Disciplina;
import cadastro.DadosAlunosGrad;
import cadastro.DadosDisciplina;
import cadastro.DadosProfessor;
import rh.AlunoGraduacao;
import rh.Professor;

public class Principal {

	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);

		CursoGrad cursoGrad = new CursoGrad();
		cursoGrad.lerDados();

		// LEITURA DOS DADOS REFERNTE A CLASSE AlunoGraduacao
		System.out.println("Digite o nome da Instituição: ");
		String instituicaoGraduacao = ler.nextLine();
		System.out.println("Ano de inicio de Graduaçao");
		Integer anoInicioGraduacao = ler.nextInt();
		System.out.println("Digite o ano de conclusao");
		Integer anoConclusaoGraduaca = ler.nextInt();

		AlunoGraduacao alunoGraduacao = new AlunoGraduacao(cursoGrad, instituicaoGraduacao, anoInicioGraduacao,
				anoConclusaoGraduaca);

		System.out.println("Digite o nome do Aluno: ");
		ler.nextLine();
		String nomeAluno = ler.nextLine();
		alunoGraduacao.setNome(nomeAluno);
		System.out.println("Digite o CPF do aluno: ");
		String cpf = ler.nextLine();
		alunoGraduacao.setCpf(cpf);
		System.out.println("Digite o endereço do aluno: ");
		String enderecoAluno = ler.nextLine();
		alunoGraduacao.setEndereco(enderecoAluno);
		System.out.println("Digite o telefone do aluno: ");
		String telefoneAluno = ler.nextLine();
		alunoGraduacao.setTelefone(telefoneAluno);
		System.out.println("Matricula do aluno: ");
		String matricula = ler.nextLine();
		alunoGraduacao.setMatricula(matricula);
		System.out.println("Informe a situação do aluno:");
		String situacao = ler.nextLine();
		alunoGraduacao.setsituacao(situacao);

//         alunoGraduacao.lerDados();

//		alunoGraduacao.setCursoGrad(alunoGraduacao.getCursoGrad());

		alunoGraduacao.mostrarDados();
//		alunoGraduacao.getCursoGrad().mostrarDados();

		Professor fprofessor = new Professor();
		fprofessor.lerDados();

		System.out.println("***Disciplina***");

		System.out.println("Informe o codigo da disciplina");
		Integer codigo = ler.nextInt();

		System.out.println("Informe o nome da disciplina:");
		ler.nextLine();
		String nome = ler.nextLine();

		System.out.println("Informe a carga horaria da disciplina:");
		Integer cargaHoraria = ler.nextInt();

		Disciplina disciplina = new Disciplina(codigo, nome, cargaHoraria, fprofessor, cursoGrad);
		disciplina.mostrarDados();
		
		DadosDisciplina.cadastrar(disciplina);
		DadosAlunosGrad.adicionar(alunoGraduacao);
		DadosProfessor.cadastrar(fprofessor);
		
//		disciplina.lerDados();

//		alunoGraduacao.getCursoGrad().adicionarDisciplina(disciplina);

//        FolhaPagamento folha = new FolhaPagamento();

//        TecnicoAdm ftecnico = new TecnicoAdm();
//        ftecnico.lerDados();
//        ftecnico.calcSalario();

//        Professor fprofessor = new Professor();
//        fprofessor.lerDados();
//        fprofessor.calcSalario();
//
//        Coordenador fcoordenador = new Coordenador();
//        fcoordenador.lerDados();
//        fcoordenador.calcSalario();
//
//        DadosTecnicoAdm.cadastrar(ftecnico);
//        DadosProfessor.cadastrar(fprofessor);
//        DadosCoordenador.cadastrar(fcoordenador);
//
//        folha.calcIRRF(ftecnico);
//        folha.calcIRRF(fprofessor);
//        folha.calcIRRF(fcoordenador);
//
//        folha.calcINSS(ftecnico);
//        folha.calcINSS(fprofessor);
//        folha.calcINSS(fcoordenador);
//
//        folha.salarioLiquido(ftecnico);
//        folha.salarioLiquido(fprofessor);
//        folha.salarioLiquido(fcoordenador);
//
//        folha.relatorioFolha(DadosTecnicoAdm.getTecnicos());
//        folha.relatorioFolha(DadosProfessor.getProfessores());
//        folha.relatorioFolha(DadosCoordenador.getCoordenadores());
//
//        folha.somaFolha(DadosTecnicoAdm.getTecnicos());
//        folha.somaFolha(DadosProfessor.getProfessores());
//        folha.somaFolha(DadosCoordenador.getCoordenadores());

		ler.close();
	}
}
