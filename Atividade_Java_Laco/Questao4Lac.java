package Atividade_Java_Laco;

import java.util.Scanner;

public class Questao4Lac {

	//Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
		//Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrad

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			float n;
			
			Scanner leia = new Scanner (System.in);
			
			System.out.println("Informe o número: ");
			n = leia.nextFloat();
					
			if(n%2==0)		
			{
				System.out.printf("Número informado é "+n+", sendo assim, é par e sua raiz quadrada é %.2f" ,Math.sqrt(n));
			}
			else 
			{
				System.out.printf("Número informado é "+n+", sendo assim, é impar e elevado ao quadrado é " +Math.pow(n,2));
			}
		}

	}


