package br.com.generation.Portugol;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite sua nota: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Digite sua nota: ");
		nota2 = entrada.nextDouble();
		
		System.out.println("Digite sua nota: ");
		nota3 = entrada.nextDouble();
		
		double notaFinal;
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5));
		notaFinal = media / 10;
		
		System.out.println("Sua média é: " + notaFinal);

	}

}
