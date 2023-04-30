package br.com.i9.exercises.one;

import java.util.Scanner;

public class ReadNumberInteger {

	public static void main(String[] args) {
		/**
		 * Classe scanner passando como argumento a expressão Systen.in - Associa o meu
		 * objeto Scanner ao teclado no modo console ENUNCIADO: Faça um programa para
		 * ler dois valores inteiros, e depois mostrar na tela a soma desses números com
		 * uma mensagem explicativa, conforme exemplos.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o PRIMEIRO numero Inteiro:");
		int primeiroNumero = sc.nextInt();
		System.out.println("Digite o SEGUNDO numero Inteiro");
		int segundoNumero = sc.nextInt();
		System.out.println(primeiroNumero + segundoNumero);
		sc.close();
	}

}
