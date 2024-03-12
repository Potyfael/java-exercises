package exerciciosjava;

import java.util.Scanner;

public class AprovandoEmprestimo {
	public static void main(String[] args) {
		
		/***Escreva um programa para aprovar o empréstimo bancário para a compra de uma casa.
		Pergunte o valor da casa, o salário do comprador e em quantos anos ele vai pagar.
		A prestação mensal não pode exceder 30% do salário ou então o empréstimo será negado.*/
		
		Scanner sc = new Scanner(System.in);
		
		double valorCasa, salComprador, prestacao, limite;
		int anos;
		
		System.out.print("Digite o valor da casa: ");
		valorCasa = sc.nextDouble();
		
		System.out.print("Digite seu salário: ");
		salComprador = sc.nextDouble();
		
		System.out.print("Em quantos anos voce vai pagar? ");
		anos = sc.nextInt();
		anos *= 12;
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

		limite = salComprador * 0.30;
		
		prestacao = valorCasa / anos;
		System.out.printf("Prestação mensal: %.2f%n", prestacao);
		System.out.printf("30%% do salário: %.2f%n", limite);
		
		if (prestacao > limite) {
			System.out.println("Empréstimo negado!");
		} else {
			System.out.println("Emprestimo aprovado!");
		}
		
		
	}
}
