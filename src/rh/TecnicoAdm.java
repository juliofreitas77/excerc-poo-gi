package rh;

import java.util.Scanner;

import util.EntradaDeDados;

public class TecnicoAdm extends Funcionario {
	Scanner s = new Scanner(System.in);

	private String cargo;
	private String departamento;
	private Double salario;
	private static Double valorHoraExtra;
	private Integer quantidadeHoraExtra;

	public boolean setCargo(String cargo) {
		if (cargo.length() > 0) {
			this.cargo = cargo;
			return true;
		} else {
			System.out.println("Cargo invalido!");
			return false;
		}
	}

	public String getCargo() {
		return cargo;
	}

	public boolean setDepartamento(String departamento) {
		if (departamento.length() > 0) {
			this.departamento = departamento;
			return true;
		} else {
			System.out.println("Departamento invalido!");
			return false;
		}
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setSalario(Double salarioBase) {
		if (salarioBase > 0) {
			salario = salarioBase;
		} else {
			System.out.println("Salario invalido!");
		}
	}

	public Double getSalario() {
		return salario;
	}

	public static boolean setValorHoraExtra(Double valorHoraExtra1) {
		if (valorHoraExtra1 > 0) {
			valorHoraExtra = valorHoraExtra1;
			return true;
		} else {
			System.out.println("Valor Hora Extra invalido!");
			return false;
		}
	}

	public static double getValorHoraExtra() {
		return valorHoraExtra;
	}

	public boolean setQtdHoraExtra(int quantidadeHoraExtra) {
		if (quantidadeHoraExtra > 0) {
			this.quantidadeHoraExtra = quantidadeHoraExtra;
			return true;
		} else {
			System.out.println("Quantidade Hora Extra invalido!");
			return false;
		}
	}

	public Integer getQuantidadeHoraExtra() {
		return quantidadeHoraExtra;
	}

	@Override
	public double calcSalario() {
		setSalario(Funcionario.getPisoSalarial() + (valorHoraExtra * quantidadeHoraExtra));
		return this.salario;
	}

	public void lerDados() {
		System.out.println("_______________________________");
		System.out.println("**Tecnico Administrativo**");
		super.lerDados();

		System.out.println("Informe o cargo:");
		while (!setCargo(s.nextLine()));

		System.out.println("Informe o departamento:");
		while (!setDepartamento(s.nextLine()));

		TecnicoAdm.setValorHoraExtra(30.0);

		System.out.println("Informe a quantidade de horas extras:");
		setQtdHoraExtra(EntradaDeDados.lerInteiro());
	}

	public void mostrarDados() {
		System.out.println("_______________________________");
		System.out.println("**Dados do Tecnico Administrativo**");
		System.out.println("_______________________________");
		super.mostrarDados();
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Departamento: " + this.departamento);
		System.out.printf("Salario: %.2f", this.calcSalario());
		System.out.printf("\n");
		System.out.println("_______________________________");
	}

}
