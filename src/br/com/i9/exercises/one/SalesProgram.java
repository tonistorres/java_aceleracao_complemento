package br.com.i9.exercises.one;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class SalesProgram {
	/**
	 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
	 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
	 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digiti o Numero de peças a Serem compradas:");
		int numeroPecas = sc.nextInt();

		float valorTotalDaVenda = 0.0F;
		
		for (int i = 0; i < numeroPecas; i++) {
			System.out.println("Digite o código da peça:");
			int code = sc.nextInt();
			System.out.println("Quantas peças desse CÓDIGO serão vendidas:");
			int qtde = sc.nextInt();
			System.out.println("Preço Unitário da peça:");
			float precoUnit = sc.nextFloat();
			valorTotalDaVenda =valorTotalDaVenda+ (qtde * precoUnit);
		}

		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotalDaVenda);
	}

}
