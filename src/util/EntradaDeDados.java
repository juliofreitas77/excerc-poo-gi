package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDeDados {

	public static int lerInteiro() {
		Scanner ler = new Scanner(System.in);
		int i = 0;
		while (true) {
			try {
				i = ler.nextInt();
//				System.out.println("Entrada OK!");
				break;
			} catch (InputMismatchException e) {
				System.out.println("Erro: " + e.toString());
				System.out.println("Digite novamente! ");
			}
		}
		return i;
	}

	public static double lerDouble(){
		Scanner ler = new Scanner(System.in);
		double d = 0;
		System.out.println("Digite um numero: ");

		while (true) {
			try {
				d = ler.nextDouble();
//				System.out.println("Entrada OK!");
				break;
			} catch (InputMismatchException e) {
				System.out.println("Erro: " + e.toString());
				System.out.println("Digite novamte! ");
			}
		}
		return d;
	}
}
