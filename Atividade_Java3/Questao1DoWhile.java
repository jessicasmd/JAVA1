package Atividade_Java3;

import java.util.Scanner;

public class Questao1DoWhile {
	//5 - Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a 
	//zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int num,soma=0;
		
		System.out.println("\nInforme um n�mero: ");
		num =leia.nextInt();
		
		do
		{	
			soma=soma+num;
			System.out.println("\nInforme um n�mero: ");
			num =leia.nextInt();
		}
		
		while(num!=0);
		{
			System.out.printf("\nA soma �: %d",soma);
		}
	}

}
