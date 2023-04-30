package br.com.i9.exercises.one;

import java.util.Scanner;

public class ProductDifference {
	/**
	 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
	 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
	 * segundo a fórmula: DIFERENCA = (A * B - C * D)
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor inteiro A:");
		int A= sc.nextInt();
		System.out.println("Digite o valor inteiro B:");
		int B= sc.nextInt();
		System.out.println("Digite o valor inteiro C:");
		int C= sc.nextInt();
		System.out.println("Digite o valor inteiro D:");
		int D= sc.nextInt();
		int DIFERENCA=(A*B-C*D);
		System.out.printf("DIFERENCA= %d",DIFERENCA);
		sc.close();
	}

}
