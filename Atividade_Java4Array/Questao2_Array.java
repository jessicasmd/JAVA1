package Atividade_Java4Array;

import java.util.Scanner;

public class Questao2_Array {
	//2- Faça um programa que receba 6 números inteiros e mostre: 
	//	• Os números pares digitados;  
	//	• A soma dos números pares digitados; 
	//	• Os números ímpares digitados; 
	//	• A quantidade de números ímpares digitados.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		
		
		int num,somaPar=0,x, numImp=0;
		int[] a = new int [6];
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nInforme um número: ");
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
		
		System.out.println("\nA soma dos números pares é : "+somaPar);
		System.out.println("\nA quantidade de números impares é: "+numImp);
		System.out.println("\nOs números pares informação foram: ");
		
		for(x=0;x<6;x++)
		{
			if(a[x]%2 == 0)
			{
				System.out.println(a[x]);
			}
		}
		
		System.out.println("\nOs números ímpares informados foram: ");
		
		for(x=0;x<6;x++) 
		{
			if(a[x]%2!=0)
			{
				System.out.println(a[x]);
			}
		}
		
	}

}
