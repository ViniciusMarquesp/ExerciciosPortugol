package br.com.generation.Portugol;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double precoCarro;
		
		System.out.println("Qual o valor do carro? : ");
		precoCarro = entrada.nextDouble();
		
		double distribuidor = (precoCarro * 28) / 100;
		double imposto = (precoCarro * 45) / 100;
		double precoFinal = precoCarro + distribuidor + imposto;
		
		System.out.println(precoFinal);

	}

}
