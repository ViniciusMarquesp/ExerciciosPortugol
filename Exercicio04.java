package br.com.generation.Portugol;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int A, B, C, D, R, S;
		
		System.out.println("Digite um número para calculo: ");
		A = entrada.nextInt();
				
		System.out.println("Mais um número para calculo: ");
		B = entrada.nextInt();
		
		System.out.println("Outro número para calculo: ");
		C = entrada.nextInt();
		
		
		R = (int)Math.pow((A + B), 2);
		S = (int)Math.pow((B + C), 2);
		
		D = (R + S) / 2;
		
		System.out.println("O valor é: " + D);

	}

}
