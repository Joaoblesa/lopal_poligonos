package com.br.engsenai.projetocalcu.model;

public class Quadrado {
	
	public double lado;
	
	private double calcularArea() {
		double area = lado * lado;
		return area;
	}
	
	private double calcularPerimetro() {
		double perimetro = 4 * lado;
		return perimetro;
	}

	public void mostrarDados() {
		System.out.println("------------");
		System.out.println("DADOS DO QUADRADO");
		System.out.println("------------");
		System.out.println("LADO: " + lado);
		System.out.println("AREA: " + calcularArea());
		System.out.println("PERIMETRO: " + calcularPerimetro());
		System.out.println("------------");
	}
	
}