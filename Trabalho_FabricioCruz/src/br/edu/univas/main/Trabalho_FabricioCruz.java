package br.edu.univas.main;

import java.util.Scanner;

public class Trabalho_FabricioCruz {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int menu;
		double a, b;
		
		do {System.out.println("ESCOLHA UMA OP��O:");
		System.out.println("1. Somar");
		System.out.println("2. Subtrair");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("9. Sair");
		menu = scanner.nextInt();
		
		if (menu == 1) {//ADI��O
			System.out.println("Insira o 1� valor a ser calculado:");
			a = scanner.nextDouble();
			System.out.println("Insira o 2� valor a ser calculado:");
			b = scanner.nextDouble();
			double soma = a + b;
			System.out.println("A soma de " + a + " + " + b + " � igual a: " + soma);}
		else if (menu == 2) {//SUBTRA��O
			System.out.println("Insira o 1� valor a ser calculado:");
			a = scanner.nextDouble();
			System.out.println("Insira o 2� valor a ser calculado:");
			b = scanner.nextDouble();
			double subtracao = a - b;
			System.out.println("A subtra��o de " + a + " - " + b + " � igual a: " + subtracao);}
		else if (menu == 3) {//MULTIPLICA��O
			System.out.println("Insira o 1� valor a ser calculado:");
			a = scanner.nextDouble();
			System.out.println("Insira o 2� valor a ser calculado:");
			b = scanner.nextDouble();
			double multiplicacao = a * b;
			System.out.println("A multiplicacao de " + a + " * " + b + " � igual a: " + multiplicacao);}
		else if (menu == 4) {//DIVIS�O 
			System.out.println("Insira o 1� valor a ser calculado:");
			a = scanner.nextDouble();
			System.out.println("Insira o 2� valor a ser calculado:");
			b = scanner.nextDouble();
			double divisao = a / b;
			System.out.println("A divisao de " + a + " / " + b + " � igual a: " + divisao);}
		else if (menu == 9) {//SAIR 
			System.out.println("Aplica��o Encerrada!");
			System.exit(1);
			break;}
		else {System.out.println("Op��o inv�lida! Por favor, digite uma op��o correta!");}
		
		}while(true);
	
	scanner.close();
		
		
}
}
