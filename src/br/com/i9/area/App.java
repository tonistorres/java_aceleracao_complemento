package br.com.i9.area;

import java.util.Locale;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// Triangulo
		Area areaGeneric = new Area();
		double TRIANGULO = areaGeneric.calcularAreaTrianguloRetangulo(3.0, 5.2);
		System.out.printf("TRIANGULO: %.3f %n", TRIANGULO);
		//Circulo
		double CIRCULO=areaGeneric.calcularAreaCirculo(5.2);
		System.out.printf("CIRCULO: %.3f %n",CIRCULO);
		//Trapezio
		double TRAPEZIO=areaGeneric.areaTrapezio(3.0, 4.0, 5.2);
		System.out.printf("TRAPEZIO: %.3f %n",TRAPEZIO);
		//Quadrado
		double QUADRADO=areaGeneric.areaQuadrado(4.0);
		System.out.printf("QUADRADO: %.3f %n",QUADRADO);
		double RETANGULO=areaGeneric.areaRetangulo(3.0, 4.0);
		System.out.printf("RETANGULO: %.3f %n",RETANGULO);
		
	}

}
