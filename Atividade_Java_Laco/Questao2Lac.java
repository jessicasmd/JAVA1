package Atividade_Java_Laco;

import java.util.Scanner;

public class Questao2Lac {
	
	//2 -  Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2, n3; 
				
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInforme o primeiro n�mero : ");
		n1 = leia.nextInt();
		System.out.println("\nInforme o  segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("\nInforme o  terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if(n1<n2 && n2<n3)
		{
			System.out.println("\nA ordem � "+n1+"-"+n2+"-"+n3);
		}
		else if (n2<n1 && n1<=n3)
		{
			System.out.println("\nA ordem � "+n2+"-"+n1+"-"+n3);
		}
		else if (n3<n1 && n1<=n2)
		{
			System.out.println("\nA ordem � "+n3+"-"+n1+"-"+n2);
		}
		else if (n3<n2 && n2<=n1)
		{
			System.out.println("\nA ordem � "+n3+"-"+n2+"-"+n1);
		}
		
	}

}
