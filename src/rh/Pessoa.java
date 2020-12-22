package rh;

import java.util.Scanner;

public abstract class Pessoa {
    Scanner s = new Scanner(System.in);

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    public boolean setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
            return true;
        } else {
            System.out.println("Nome invalido!");
            return false;
        }
    }

    public boolean setEndereco(String endereco) {
        if (endereco.length() > 0) {
            this.endereco = endereco;
            return true;
        } else {
            System.out.println("Endereço inválido!");
            return false;
        }
    }

    public boolean setTelefone(String telefone) {
        if (telefone.length() > 0) {
            this.telefone = telefone;
            return true;
        } else {
            System.out.println("Telefone inválido!");
            return false;
        }
    }

    public boolean setCpf(String cpf) {
        if (ValidaCPF.isValidCPF(cpf)) {
            this.cpf = cpf;
            return true;
        } else {
            System.out.println("CPF inválido!");
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void lerDados() {

        System.out.println("Informe o nome:");
        while (!setNome(s.nextLine())) ;

        System.out.println("Informe o endereço:");
        while (!setEndereco(s.nextLine())) ;

        System.out.println("Informe o telefone:");
        while (!setTelefone(s.nextLine())) ;

        System.out.println("Informe o CPF:");
        while (!setCpf(s.nextLine())) ;

    }

    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("CPF: " + this.cpf);
    }
}
