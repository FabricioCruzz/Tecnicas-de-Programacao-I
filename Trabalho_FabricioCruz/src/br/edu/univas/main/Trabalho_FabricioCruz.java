package br.edu.univas.main;

import java.util.Scanner;

public class Trabalho_FabricioCruz {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int menu;
		double a, b, result;
		
		do {
			print_menu();
			menu = scanner.nextInt();
			
			if (menu == 9) {//SAIR 
				System.out.println("Aplicação Encerrada!");
				System.exit(1);
				break;}
			
			System.out.println("Insira o 1º valor a ser calculado:");
			a = scanner.nextDouble();
			System.out.println("Insira o 2º valor a ser calculado:");
			b = scanner.nextDouble();
			
			if (menu == 1) {//ADIÇÃO
				
				result = sum(a, b);
				System.out.println("A soma de " + a + " + " + b + " é igual a: " + result);}
			
			else if (menu == 2) {//SUBTRAÇÃO
	
				result = subtraction(a, b);
				System.out.println("A subtração de " + a + " - " + b + " é igual a: " + result);}
			
			else if (menu == 3) {//MULTIPLICAÇÃO
				
				result = multiplication(a, b);
				System.out.println("A multiplicacao de " + a + " * " + b + " é igual a: " + result);}
			
			else if (menu == 4) {//DIVISÃO 
				
				result = division(a, b);
				System.out.println("A divisao de " + a + " / " + b + " é igual a: " + result);}
			
			else {System.out.println("Opção inválida! Por favor, digite uma opção correta!");}
		
		}while(true);
	
	scanner.close();
		
		
}
	public static void print_menu() {
		System.out.println("ESCOLHA UMA OPÇÃO:");
		System.out.println("1. Somar");
		System.out.println("2. Subtrair");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("9. Sair");		
	}
	
	public static double sum (double number1, double number2) {
		return number1 + number2;
	}
	
	public static double subtraction (double number1, double number2) {
		return number1 - number2;
	}
	
	public static double multiplication (double number1, double number2) {
		return number1 * number2;
	}
	
	public static double division (double number1, double number2) {
		return number1 / number2;
	}
	
}
