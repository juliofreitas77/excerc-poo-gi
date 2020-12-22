package rh;

import java.util.Scanner;

import util.EntradaDeDados;

public class Coordenador extends Funcionario {
	Scanner s = new Scanner(System.in);

	private String especializacao;
	private Integer numeroHorasSemana;
	private Double valorHoraSemana;

	public String getEspecializacao() {
		return especializacao;
	}

	public boolean setEspecializacao(String especializacao) {

		if (especializacao.length() > 0) {
			this.especializacao = especializacao;
			return true;
		} else {
			System.out.println("Especialização invalida!");
			return false;
		}
	}

	public boolean setNumeroHorasSemana(Integer numeroHorasSemana1) {
		if (numeroHorasSemana1 > 0) {
			this.numeroHorasSemana = numeroHorasSemana1;
			return true;
		} else {
			System.out.println("Numero de Horas Semana Invalido!");
			return false;
		}
	}

	public boolean setValorHoraSemana(Double valorHoraSemana1) {
		if (valorHoraSemana1 > 0) {
			this.valorHoraSemana = valorHoraSemana1;
			return true;
		} else {
			System.out.println("Valor Horas Semana Inválido");
			return false;
		}
	}

	@Override
	public String getNome() {
		return super.getNome();
	}

	@Override
	public double calcSalario() {
		return numeroHorasSemana * valorHoraSemana;
	}

	public void lerDados() {
		System.out.println("***Coordenador***");
		super.lerDados();

		System.out.println("Informe a especialização:");
		while (!setEspecializacao(s.nextLine()));

		System.out.println("Informe o numero de horas semanais:");
//        while(!setNumeroHorasSemana(s.nextInt()));
		setNumeroHorasSemana(EntradaDeDados.lerInteiro());

		System.out.println("Informe o valor de horas semanais:");
//        while(!setValorHoraSemana(s.nextDouble()));
		setValorHoraSemana(EntradaDeDados.lerDouble());
	}

	public void mostrarDados() {
		System.out.println("***Dados do Coordenador***");
		System.out.println("_______________________________");
		super.mostrarDados();
		System.out.println("Especialização: " + this.especializacao);
		System.out.println("Salario: " + this.calcSalario());
		System.out.println("_______________________________");
	}
}
