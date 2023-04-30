package br.com.i9.exercises.one;

import java.util.Locale;
//import java.util.Locale;
import java.util.Scanner;

public class RadiusCircle {
	/**
	 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
	 * valor da área deste círculo com quatro casas decimais conforme exemplos.
	 * Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
	 */
	// Declarando uma CONSTANTE:
	// https://www.devmedia.com.br/java-variaveis-e-constantes/38311#constantes

	public static void main(String[] args) {

		final float PI = 3.14159F; // Declarando uma CONSTANTE EM JAVA
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o raio de um círculo:");
		double raio = sc.nextDouble();
		double area = PI * Math.pow(raio, 2);
		System.out.printf("Área do Raio é:%.4f", area);
		sc.close();

	}
}
