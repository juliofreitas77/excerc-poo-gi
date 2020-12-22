package rh;

import java.util.Scanner;

public class Professor extends Funcionario{

    Scanner s = new Scanner(System.in);

    private String titulacao;
    private String areaPesquisa;
    private Integer numeroHorasAula;
    private Double valorHoraAula;

    public boolean setTitulacao(String titulacao) {
        if (titulacao.length() > 0) {
            this.titulacao = titulacao;
            return true;
        } else {
            System.out.println("Titulação invalida!");
            return false;
        }
    }

    public boolean setAreaPesquisa(String areaPesquisa) {
        if (areaPesquisa.length() > 0) {
            this.areaPesquisa = areaPesquisa;
            return true;
        } else {
            System.out.println("Area de Pesquisa invalida!");
            return false;
        }
    }

    public boolean setNumeroHorasAula(Integer numeroHorasAula) {
        if (numeroHorasAula > 0) {
        this.numeroHorasAula = numeroHorasAula;
            return true;
        } else {
            System.out.println("Numero de Horas Aula Invalido!");
            return false;
        }
    }

    public boolean setValorHoraAula(Double valorHoraAula) {
        if (valorHoraAula > 0) {
        this.valorHoraAula = valorHoraAula;
            return true;
        } else {
            System.out.println("Valor Horas Aula Inválido");
            return false;
        }
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public double calcSalario() {
        return numeroHorasAula * valorHoraAula;
    }

    public void lerDados() {
        System.out.println("***Professor***");
        super.lerDados();

        System.out.println("Informe a titulação:");
        while(!setTitulacao(s.nextLine()));

        System.out.println("Informe a area de pesquisa:");
        while(!setAreaPesquisa(s.nextLine()));

        System.out.println("Informe o numero de horas aula:");
        while(!setNumeroHorasAula(s.nextInt()));

        System.out.println("Informe o valor de horas aula:");
        while(!setValorHoraAula(s.nextDouble()));

    }

    public void mostrarDados() {
        System.out.println("***Dados do Professor***");
        System.out.println("_______________________________");

        super.mostrarDados();

        System.out.println("Titulo: "+this.titulacao);
        System.out.println("Area de Pesquisa: "+this.areaPesquisa);
        System.out.println("Salario: "+this.calcSalario());
        System.out.println("_______________________________");
    }


}
