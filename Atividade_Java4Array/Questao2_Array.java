package Atividade_Java4Array;

import java.util.Scanner;

public class Questao2_Array {
	//2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
	//	� Os n�meros pares digitados;  
	//	� A soma dos n�meros pares digitados; 
	//	� Os n�meros �mpares digitados; 
	//	� A quantidade de n�meros �mpares digitados.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		
		
		int num,somaPar=0,x, numImp=0;
		int[] a = new int [6];
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nInforme um n�mero: ");
			num= leia.nextInt();
		
			a[x]=num;
			
		if(num % 2 == 0 )
			{
			
				somaPar+=a[x];
			}
		else if(num % 3 == 0 )
		{
			numImp++;
		}
		}
		
		System.out.println("\nA soma dos n�meros pares � : "+somaPar);
		System.out.println("\nA quantidade de n�meros impares �: "+numImp);
		System.out.println("\nOs n�meros pares informa��o foram: ");
		
		for(x=0;x<6;x++)
		{
			if(a[x]%2 == 0)
			{
				System.out.println(a[x]);
			}
		}
		
		System.out.println("\nOs n�meros �mpares informados foram: ");
		
		for(x=0;x<6;x++) 
		{
			if(a[x]%2!=0)
			{
				System.out.println(a[x]);
			}
		}
		
	}

}
