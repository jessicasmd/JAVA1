package Atividade_Java_Laco;

import java.util.Scanner;

public class Questao3Lac {

	// 3Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
		// 10-14 infantil
		//15-17 juvenil
		//18-25 adulto

			
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int id;
			
			Scanner leia = new Scanner (System.in);
			
			System.out.println("\n\t\t Em qual op��o se enquadra sua idade:  ");
			System.out.println("1- 10 � 14 anos. ");
			System.out.println("2- 15 � 17 anos. ");
			System.out.println("3- 18 � 25 anos. ");
			System.out.println("\nEscolha a sua op��o ");
			id = leia.nextInt();
			
			switch (id)
			{
			case 1:
				System.out.println("\n Sua categoria � INFANTIL ");
				break;
				
			case 2:
				System.out.println("\n Sua categoria � JUVENIL ");
				break;
				
			case 3:
				System.out.println("\n Sua categoria � ADULTO ");
				break;
				
			default:
				System.out.println("\nOp��o inv�lida!!!");
			}
		}
	
}
