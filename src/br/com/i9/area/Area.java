package br.com.i9.area;

public class Area {

	protected double calcularAreaTrianguloRetangulo(double base, double altura) {
		return base * altura / 2;
	}

	protected double calcularAreaCirculo(double raio) {
		 final float PI = 3.14159F;
		 return PI* Math.pow(raio, 2);		
	}
	
	protected double areaTrapezio(double B,double b,double h) {
		return ((B+b)*h)/2;		
	}
	
	protected double areaQuadrado(double l) {
		return Math.pow(l, 2);		
	}
	
	protected double areaRetangulo(double base, double h) {
		return base*h;
	}
}
