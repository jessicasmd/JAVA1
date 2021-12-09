package Atividade_Java_Laco;

import java.util.Scanner;

public class Questao2Lac {
	
	//2 -  Faça um programa que entre com três números e coloque em ordem crescente.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2, n3; 
				
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInforme o primeiro número : ");
		n1 = leia.nextInt();
		System.out.println("\nInforme o  segundo número: ");
		n2 = leia.nextInt();
		System.out.println("\nInforme o  terceiro número: ");
		n3 = leia.nextInt();
		
		if(n1<n2 && n2<n3)
		{
			System.out.println("\nA ordem é "+n1+"-"+n2+"-"+n3);
		}
		else if (n2<n1 && n1<=n3)
		{
			System.out.println("\nA ordem é "+n2+"-"+n1+"-"+n3);
		}
		else if (n3<n1 && n1<=n2)
		{
			System.out.println("\nA ordem é "+n3+"-"+n1+"-"+n2);
		}
		else if (n3<n2 && n2<=n1)
		{
			System.out.println("\nA ordem é "+n3+"-"+n2+"-"+n1);
		}
		
	}

}
