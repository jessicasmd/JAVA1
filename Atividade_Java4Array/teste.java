package Atividade_Java4Array;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int x,somaP=0,contI=0,num;
		int[] a = new int [6];
				              
		
		
		for(x=0;x<6;x++)
		{
			System.out.printf("\nEntre com um n�mero: ");
			num=leia.nextInt();
						
			a[x]=num;
			
			if(a[x]%2==0)
			{
				somaP+=a[x];
				
			}
			else
			{
				contI++;
				
			}
			
		}
		System.out.println("\nA somat�ria dos n�meros pares � de "+somaP);
		System.out.println("\nA quantidade de n�meros �mpares � de "+contI);
		
		System.out.println("\nOs n�meros pares digitados foram: ");
		for(x=0;x<6;x++) 
		{ 
			if(a[x]%2==0)
			{
				System.out.println(a[x]);
			}

		}
		System.out.println("\nOs n�meros �mpares digitados foram: ");
		for(x=0;x<6;x++)
		{
			if(a[x]%2!=0)
			{
				System.out.println(a[x]);
			}
		}
	}
}