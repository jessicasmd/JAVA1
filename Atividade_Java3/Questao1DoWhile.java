package Atividade_Java3;

import java.util.Scanner;

public class Questao1DoWhile {
	//5 - Crie um programa que leia um número do teclado até que encontre um número igual a 
	//zero. No final, mostre a soma dos números digitados.(DO...WHILE)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int num,soma=0;
		
		System.out.println("\nInforme um número: ");
		num =leia.nextInt();
		
		do
		{	
			soma=soma+num;
			System.out.println("\nInforme um número: ");
			num =leia.nextInt();
		}
		
		while(num!=0);
		{
			System.out.printf("\nA soma é: %d",soma);
		}
	}

}
