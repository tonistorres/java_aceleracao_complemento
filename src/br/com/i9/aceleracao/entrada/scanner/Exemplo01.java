package br.com.i9.aceleracao.entrada.scanner;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo01 {
	/**
	 * No comando next() quando for digitar por exemeplo PRIMEIRO NOME é apenas um
	 * nome sem espaço... Caso dê um espaço o programa irá quebrar, pois, para esse
	 * tipo de procedimento temos nextLine() que irá lê a linha toda
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com PRIMEIRO NOME:");
		String nome = sc.next();
		System.out.println("Entre com sua IDADE:");
		int idade = sc.nextInt();
		System.out.println("Digite seu SALÁRIO EM DOLARES:");
		Locale.setDefault(Locale.US);
		double salario = sc.nextDouble();
		System.out.println("Digite seu sexo: F (Feminino) M (Masculino) O(Outros)");
		char sexo = sc.next().charAt(0);
		System.out.printf("Meu nome é %s tenho a idade de  %d%n" + "tenho uma renda de %.2f%n" + "meu sexo é %c", nome,
				idade, salario, sexo);
		sc.close();

	}

}
