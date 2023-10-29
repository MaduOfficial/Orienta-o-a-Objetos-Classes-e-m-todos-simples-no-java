package com.madu.poo.classes.e.métodos.com.retorno;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		double autonomia = van.obterautonomia();
		System.out.println("Altonomia di carro é: " + autonomia);
		System.out.println("Altonomia di carro é: " + van.obterautonomia());
	}

}
