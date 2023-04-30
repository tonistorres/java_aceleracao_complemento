package br.com.i9.exercises.one;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeSalary {
	/**
	 * Fazer um programa que leia o número de um funcionário, seu número de horas
	 * trabalhadas, o valor que recebe por hora e calcula o salário desse
	 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
	 * casas decimais.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Código do Funiconário:");
		int codigo = sc.nextInt();

		System.out.println("Digite o Número de Horas Trabalhadas:");
		int horasTrabalhadas = sc.nextInt();

		System.out.println("Digite o Valor a Receber por Hora Trabalhada:");
		double valorHora = sc.nextDouble();

		double salario = horasTrabalhadas * valorHora;
		System.out.println("NUMBER = " + codigo);
		System.out.println("SALARY = U$ " + salario);

		sc.close();

	}

}
