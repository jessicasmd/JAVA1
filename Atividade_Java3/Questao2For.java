package Atividade_Java3;

import java.util.Scanner;

public class Questao2For {
	// 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in); 
		
		int x,num,par=0,imp=0;
		
			for(x=1;x<=10;x++)
		{
			System.out.println("\nInforme o n�mero: ");
			num = leia.nextInt();
			
				if (num % 2 == 0 )
				{
					par++;
				}
				
				else
				{
					imp++;
				}
			}
		System.out.println("\nOs n�meros pares informados s�o : "+par);
		System.out.println("\nOs n�meros impares informados s�o : "+imp);	
	}
}


			
			

