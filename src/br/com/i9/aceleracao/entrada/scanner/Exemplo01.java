package br.com.i9.aceleracao.entrada.scanner;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
		/**
		 * com essa linha de comando estou associando o meu objeto Scanner ao teclado no
		 * modo console
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com PRIMEIRO NOME:");
		// digite um texto sem espaços
		String nome = sc.next();
		System.out.println("Entre com sua IDADE:");
		// comando sc utilizado para leitura de numero inteiro
		int idade = sc.nextInt();
		System.out.println("Digite seu SALÁRIO EM DOLARES:");
		// utilizando o método Locale para setar valores em dolar para meu sistema
		Locale.setDefault(Locale.US);
		// comando sc utilizado para leitura de numeros ponto flutuante
		double salario = sc.nextDouble();
		System.out.println("Digite seu sexo: F (Feminino) M (Masculino) O(Outros)");
		// o método abaixao captura a primeira letra na posição 0 do valor da string digitada
		char sexo = sc.next().charAt(0);
		System.out.printf("Meu nome é %s tenho a idade de  %d%n" + "tenho uma renda de %.2f%n" + "meu sexo é %c", nome,
				idade, salario, sexo);

		/**Desalocando da mémoria esse recurso Scanner criado logo acima(coisas da linguagem)*/
		sc.close();

	}

}
