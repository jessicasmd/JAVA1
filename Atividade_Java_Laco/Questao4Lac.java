package Atividade_Java_Laco;

import java.util.Scanner;

public class Questao4Lac {

	//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
		//Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrad

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			float n;
			
			Scanner leia = new Scanner (System.in);
			
			System.out.println("Informe o n�mero: ");
			n = leia.nextFloat();
					
			if(n%2==0)		
			{
				System.out.printf("N�mero informado � "+n+", sendo assim, � par e sua raiz quadrada � %.2f" ,Math.sqrt(n));
			}
			else 
			{
				System.out.printf("N�mero informado � "+n+", sendo assim, � impar e elevado ao quadrado � " +Math.pow(n,2));
			}
		}

	}


