package calculo;

import java.util.ArrayList;

import rh.Funcionario;

public class FolhaPagamento {

	private double totalFolha = 0;

	public double getTotalFolha() {
		return totalFolha;
	}

	public void setTotalFolha(double totalFolha) {
		this.totalFolha = totalFolha;
	}

	/*
	 * public double getTotalEncargos() { return (this.totalFolha * 0.3378); }
	 * 
	 * public void setTotalEncargos(double totalEncargos) { }
	 */

	public double somaFolha(ArrayList<? extends Funcionario> funcionarios) {

		for (Funcionario func : funcionarios) {
			this.totalFolha = 0;
			this.totalFolha += func.calcSalario();
			System.out.printf("\n Nome: %s \n " + "Salario:%.2f \n " + "Categoria: %s \n", func.getNome(),
					func.getSalario(), func.getClass().getName());
		}
		return 0;
	}

	public double calcIRRF(Funcionario f) {
		if (f.calcSalario() > 3000)
			return f.calcSalario() * 0.275;
		else if (f.calcSalario() > 1500)
			return f.calcSalario() * 0.15;
		else
			return 0;
	}

	public double calcINSS(Funcionario f) {
		if (f.calcSalario() > 0)
			return f.calcSalario() * 0.11;
		else
			return 0;
	}

	public double salarioLiquido(Funcionario f) {
		if (f.calcSalario() > 0)
			return f.calcSalario() - (calcIRRF(f) + calcINSS(f));
		else
			return 0;
	}

	public void relatorioFolha(ArrayList<? extends Funcionario> funcionarios) {
		for (Funcionario funcion : funcionarios) {
			System.out.println("_______________________________");
			System.out.println("**Dados do Funcionario**");
			System.out.println("_______________________________");
			System.out.println("Nome: " + funcion.getNome());
			System.out.println("Categoria: " + funcion.getClass().getName());
			System.out.printf("Salario Bruto: %.2f\n", funcion.calcSalario());
			System.out.printf("IRRF: %.2f\n", calcIRRF(funcion));
			System.out.printf("INSS: %.2f\n", calcINSS(funcion));
			System.out.printf("Salario Liquido: %.2f\n", salarioLiquido(funcion));
			System.out.printf("\n");
			System.out.println("_______________________________");

		}
	}
}
