package Atividade_Java_Laco;

import java.util.Scanner;

public class Questao1Lac {

// 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3;
		
		Scanner leia = new Scanner (System.in);
					
		System.out.println("\nInforme o primeiro número : ");
		n1 = leia.nextInt();
		System.out.println("\nInforme o  segundo número: ");
		n2 = leia.nextInt();
		System.out.println("\nInforme o  terceiro número: ");
		n3 = leia.nextInt();
		
		if(n1>n2 && n3<n1)
		{
			System.out.printf("\nO número maior é  "+n1);
		}
		else if(n2>n1 && n3<n2)
		{
			System.out.printf("\nO número maior é  " +n2);
		}
		else if(n3>n1 && n2<n3)
		{
			System.out.printf("\nO número maior é  "+n3);
		}
		

	}

}