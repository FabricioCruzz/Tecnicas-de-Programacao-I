package br.edu.univas.main;

import java.util.Scanner;

public class Trabalho_FabricioCruz {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int menu;
		double a, b;
		
		do {System.out.println("ESCOLHA UMA OPÇÃO:");
		System.out.println("1. Somar");
		System.out.println("2. Subtrair");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("9. Sair");
		menu = scanner.nextInt();
		
		if (menu == 1) {//ADIÇÃO
			System.out.println("Insira o 1º valor a ser calculado:");
			a = scanner.nextDouble();
			System.out.println("Insira o 2º valor a ser calculado:");
			b = scanner.nextDouble();
			double soma = a + b;
			System.out.println("A soma de " + a + " + " + b + " é igual a: " + soma);}
		else if (menu == 2) {//SUBTRAÇÃO
			System.out.println("Insira o 1º valor a ser calculado:");
			a = scanner.nextDouble();
			System.out.println("Insira o 2º valor a ser calculado:");
			b = scanner.nextDouble();
			double subtracao = a - b;
			System.out.println("A subtração de " + a + " - " + b + " é igual a: " + subtracao);}
		else if (menu == 3) {//MULTIPLICAÇÃO
			System.out.println("Insira o 1º valor a ser calculado:");
			a = scanner.nextDouble();
			System.out.println("Insira o 2º valor a ser calculado:");
			b = scanner.nextDouble();
			double multiplicacao = a * b;
			System.out.println("A multiplicacao de " + a + " * " + b + " é igual a: " + multiplicacao);}
		else if (menu == 4) {//DIVISÃO 
			System.out.println("Insira o 1º valor a ser calculado:");
			a = scanner.nextDouble();
			System.out.println("Insira o 2º valor a ser calculado:");
			b = scanner.nextDouble();
			double divisao = a / b;
			System.out.println("A divisao de " + a + " / " + b + " é igual a: " + divisao);}
		else if (menu == 9) {//SAIR 
			System.out.println("Aplicação Encerrada!");
			System.exit(1);
			break;}
		else {System.out.println("Opção inválida! Por favor, digite uma opção correta!");}
		
		}while(true);
	
	scanner.close();
		
		
}
}
