package br.com.i9.aceleracao.printf.saida;

import java.util.Locale;

public class Exemplo01 {

	public static void main(String[] args) {
		double x=10.35784;
		String firstName="Tonis";
		int idade=31;
		double renda=4000.0;
		System.out.println(x);
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		Locale.setDefault(Locale.US);
		System.out.println("RESULTADO = "+x+" METROS");
		System.out.printf("RESULTADO = %.2f metros %n",x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",firstName,idade,renda);

	}

}
