package Atividade_Java3;

import java.util.Scanner;

public class Questao1While {
	
	// 3-  Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	//idade for =-99.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int  x,idade,idMaior50=0,idMenor21=0;
			
		System.out.println("\nInforme sua idade: ");
		idade=leia.nextInt();
					
			while(idade!=-99)
			{ 
							
				if(idade<=21)
				{
					idMenor21++;
				}
				else if(idade>=50)
				{
					idMaior50++;
				}
				else
				{
					System.out.println("\nDado sem registro!");
				}
				System.out.println("\nInforme sua idade: ");
				idade=leia.nextInt();
		}
			System.out.println("\n A quantidade de pessoas com menos de 21 anos é "+idMenor21);
			System.out.println("\n A quantidade de pessoas com maior de 50 anos é "+idMaior50);
	}

}
