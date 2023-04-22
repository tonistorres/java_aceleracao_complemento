package br.com.i9.aceleracao.complemento;

import java.util.Locale;

public class Exercicio01 {

	public static void main(String[] args) {

		/**Em um novo programa inicie as variáveis */
		String product1 = "Computer";
		String product2 = "Office desk";
		int age=30;
		int code=5290;
		char gender='F';
		double price1=2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		double measureUS = 53.234567;
		
		/**Resultado é uma String no seguinte formato*/
		
		System.out.printf("Products:%n"
				+ "%s, which price is $ %.2f %n"
				+ "%s, which price is $ %.2f%n%n"
				+ "Record: %d years old, code %d and gender: %c%n%n"
				+ "Measue with eight decimal places: %.8f%n"
				+ "Rouded (three decimal places):%.3f%n"
				,product1,price1,product2,price2,age,code,gender,measure, measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}
