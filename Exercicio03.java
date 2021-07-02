package br.com.generation.Portugol;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int segundosTotal, minutos, horas, segundos;
		
		System.out.println("Coloque os segundos que deseja calcular: ");
		segundosTotal = entrada.nextInt();
		
		horas = segundosTotal / 3600;
		minutos = segundosTotal % 3600 / 60;
		segundos = segundosTotal % 60;
		
		System.out.println(horas + "h " + minutos + "m " + segundos + "s ");

	}

}
